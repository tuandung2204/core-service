package com.example.dbconnection.controller;

import com.example.dbconnection.entity.dto.BacSiDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.service.BacSiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bacsi")
@Slf4j
@CrossOrigin
public class BacSiController {
    @Autowired
    private BacSiService bacSiService;
    @PostMapping
    public GeneralResponse addBacSi(@RequestBody BacSiDTO bacSiDTO) {
        try {
            return bacSiService.create(bacSiDTO);
        }  catch (Exception e) {
            return null;
        }
    }
    @PutMapping
    public GeneralResponse updateBacSi(@RequestBody BacSiDTO bacSiDTO) {
        try{
            return bacSiService.update(bacSiDTO);
        } catch (Exception e){
            log.error("Lỗi khi cập nhật thông tin bác sĩ", e);  // Thêm log để kiểm tra lỗi
            return new GeneralResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Cập nhật thông tin thất bại", null);
        }
    }
    @GetMapping
    public GeneralResponse getBacSi(@RequestParam BacSiDTO bacSiDTO) {
        try {
            return bacSiService.getBacsi(bacSiDTO);
        } catch (Exception e){
            return null;
        }
    }
    @DeleteMapping
    public GeneralResponse deleteBacSi(@RequestParam("maBacSi") String maBacSi) {
        try {
            return bacSiService.delete(maBacSi);
        } catch (Exception e){
            return new GeneralResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Xóa thất bại", null);
        }
        }
    }


