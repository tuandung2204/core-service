package com.example.dbconnection.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BacSiDTO {
    @JsonProperty("ma_bac_si")
    private String maBacSi;
    @JsonProperty("ho_ten")
    private String hoTen;
    @JsonProperty("tuoi")
    private Integer tuoi;
    @JsonProperty("so_dien_thoai")
    private String soDienThoai;
    @JsonProperty("email")
    private String email;
    @JsonProperty("chuyen_khoa")
    private String chuyenKhoa;
}