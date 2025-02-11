package com.example.dbconnection.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DatLichDTO {
    @JsonProperty("ma_phieu_dat_lich")
    private String maPhieuDatLich;
    @JsonProperty("ngay_hen")
    private Date ngayHen;
    @JsonProperty("gio_hen")
    private Time gioHen;
    @JsonProperty("bac_si")
    private String bacSi;
    @JsonProperty("so_phong")
    private String soPhong;
}