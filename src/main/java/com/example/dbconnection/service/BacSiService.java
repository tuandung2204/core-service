package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.BacSiDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;

public interface BacSiService {
    GeneralResponse create(BacSiDTO bacSiDTO);
    GeneralResponse update(BacSiDTO bacSiDTO);
    GeneralResponse delete(String maBacSi);
    GeneralResponse getBacsi(BacSiDTO bacSiDTO);
}
