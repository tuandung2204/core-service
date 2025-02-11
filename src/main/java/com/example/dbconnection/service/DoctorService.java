package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.req.DoctorReq;
import com.example.dbconnection.entity.dto.res.GeneralResponse;

public interface DoctorService {
    GeneralResponse add(DoctorReq doctorReq);

    GeneralResponse update(DoctorReq doctorReq);

    GeneralResponse delete(String drId);

}
