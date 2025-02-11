package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.DatLichDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;

public interface DatLichService {
    GeneralResponse create(DatLichDTO datLichDTO);
    GeneralResponse update(DatLichDTO datLichDTO);
    GeneralResponse delete(String maPhieuDatLich);
    GeneralResponse getDatLich(DatLichDTO datLichDTO);
}
