package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.BenhNhanDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;

public interface BenhNhanService {
    GeneralResponse create(BenhNhanDTO benhNhanDTO);
    GeneralResponse update(BenhNhanDTO benhNhanDTO);
    GeneralResponse delete(String maBenhNhan);
    GeneralResponse getBenhNhan(BenhNhanDTO benhNhanDTO);
}
