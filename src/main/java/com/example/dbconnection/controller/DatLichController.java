package com.example.dbconnection.controller;

import com.example.dbconnection.entity.dto.BacSiDTO;
import com.example.dbconnection.entity.dto.DatLichDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.service.DatLichService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/datlich")
@Slf4j
@CrossOrigin
public class DatLichController {
    @Autowired
    private DatLichService datLichService;
    @PostMapping("/create")
    public GeneralResponse addDatLich(@RequestBody DatLichDTO datLichDTO) {
        try {
            return datLichService.create(datLichDTO);
        }  catch (Exception e) {
            log.error("Lỗi khi tạo thông tin đặt lịch", e);  // Thêm log để kiểm tra lỗi
            return new GeneralResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Đặt lịch thất bại",null);
        }
    }
    @PutMapping
    public GeneralResponse updateDatLich(@RequestBody DatLichDTO datLichDTO) {
        try{
            return datLichService.update(datLichDTO);
        } catch (Exception e){
            log.error("Lỗi khi cập nhật thông tin đặt lịch", e);  // Thêm log để kiểm tra lỗi
            return new GeneralResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Cập nhật thông tin thất bại", null);
        }
    }
    @GetMapping
    public GeneralResponse getDatLich(@RequestParam DatLichDTO datLichDTO) {
        try {
            return datLichService.getDatLich(datLichDTO);
        } catch (Exception e){
            return null;
        }
    }
    @DeleteMapping
    public GeneralResponse deleteDatLich(@RequestParam("maDatLich") String maDatLich) {
        try {
            return datLichService.delete(maDatLich);
        } catch (Exception e){
            return new GeneralResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Xóa thất bại", null);
        }
    }
}
