package com.example.dbconnection.extra.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
@Component
public class GeneratedRandomStringUtils {
    @Autowired
    SecureRandom secureRandom;


    public int generateSecureInt(int bound) {
        return secureRandom.nextInt(bound);
    }

    public String generateSecureHexString(int length) {
        byte[] randomBytes = new byte[length];
        secureRandom.nextBytes(randomBytes);
        return bytesToHex(randomBytes);
    }


    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
}
