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
public class BenhNhanDTO {
    @JsonProperty("ma_benh_nhan")
    private String maBenhNhan;
    @JsonProperty("ho_ten")
    private String hoTen;
    @JsonProperty("tuoi")
    private Integer tuoi;
    @JsonProperty("dia_chi")
    private String diaChi;
    @JsonProperty("so_dien_thoai")
    private String sdt;
    @JsonProperty("email")
    private String email;
}

