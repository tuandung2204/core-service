package com.example.dbconnection.refactor.utils.securityUtils;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

@Component
public class RsaUtils {

    public static byte[] encrypt(PublicKey publicKey, byte[] plainText) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(plainText);
    }

    public static byte[] decrypt(PrivateKey privateKey, byte[] cipherText) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        return cipher.doFinal(cipherText);
    }

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);

        return keyPairGenerator.generateKeyPair();

    }

    public static PublicKey getPublicKey(byte[] publicKeyEncoded) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyEncoded);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        return keyFactory.generatePublic(keySpec);
    }

    public static PrivateKey getPrivateKey(byte[] privateKeyEncoded) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyEncoded);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        return keyFactory.generatePrivate(keySpec);
    }

    public String encryptString( String plainText) throws Exception {
        PublicKey publicKey = getPublicKey(Base64.decodeBase64(plainText));
        byte[] cipherText = encrypt(publicKey, plainText.getBytes());
        return Base64.encodeBase64String(cipherText);
    }

    public String decryptString( String cipherText) throws Exception {
        PrivateKey privateKey = getPrivateKey(Base64.decodeBase64(cipherText));
        byte[] cipherBytes = Base64.decodeBase64(cipherText);
        byte[] plainTextBytes = decrypt(privateKey, cipherBytes);
        return new String(plainTextBytes);
    }
}
