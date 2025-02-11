package com.example.dbconnection.controller;

import com.example.dbconnection.entity.dto.BenhNhanDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.service.BenhNhanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/benhnhan")
@Slf4j
@CrossOrigin
public class BenhNhanController {
    @Autowired
    private BenhNhanService benhNhanService;
    @PostMapping("/add")
    public GeneralResponse addBenhNhan(@RequestBody BenhNhanDTO benhNhanDTO){
        try {
            return benhNhanService.create(benhNhanDTO);
        }  catch (Exception e) {
            return null;
        }
    }
    @PutMapping
    public GeneralResponse updateBenhNhan(@RequestBody BenhNhanDTO benhNhanDTO){
        try {
            return benhNhanService.update(benhNhanDTO);
        }   catch (Exception e) {
            return null;
        }
    }
    @GetMapping
    public GeneralResponse getBenhNhan(@RequestParam BenhNhanDTO benhNhanDTO){
        try{
            return benhNhanService.getBenhNhan(benhNhanDTO);
        }   catch (Exception e) {
            return null;
        }
    }
    @DeleteMapping
    public GeneralResponse deleteBenhNhan(String maBenhNhan){
        try {
            return benhNhanService.delete(maBenhNhan);
        }   catch (Exception e) {
            return null;
        }
    }
}
