package com.example.dbconnection.service.Impl;

import com.example.dbconnection.entity.BenhNhan;
import com.example.dbconnection.entity.dto.BenhNhanDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.repository.BenhNhanRepository;
import com.example.dbconnection.service.BenhNhanService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BenhNhanServiceImpl implements BenhNhanService {
    @Autowired
    BenhNhanRepository benhNhanRepository;
    @Override
    public GeneralResponse create(BenhNhanDTO benhNhanDTO){
        BenhNhan benhNhan = new BenhNhan();
        benhNhan.setMaBenhNhan(benhNhanDTO.getMaBenhNhan());
        benhNhan.setHoTen(benhNhanDTO.getHoTen());
        benhNhan.setTuoi(benhNhanDTO.getTuoi());
        benhNhan.setDiaChi(benhNhanDTO.getDiaChi());
        benhNhan.setSdt(benhNhanDTO.getSdt());
        benhNhan.setEmail(benhNhanDTO.getEmail());
        benhNhanRepository.save(benhNhan);
        return new GeneralResponse(HttpStatus.OK.value(),"",benhNhan);
    }
    @Override
    public GeneralResponse update(BenhNhanDTO benhNhanDTO) {
        BenhNhan benhNhan = benhNhanRepository.findByMaBenhNhan(benhNhanDTO.getMaBenhNhan());
        benhNhan.setHoTen(benhNhanDTO.getHoTen());
        benhNhan.setTuoi(benhNhanDTO.getTuoi());
        benhNhan.setDiaChi(benhNhanDTO.getDiaChi());
        benhNhan.setSdt(benhNhanDTO.getSdt());
        benhNhan.setEmail(benhNhanDTO.getEmail());
        benhNhanRepository.save(benhNhan);
        return new GeneralResponse(HttpStatus.OK.value(),"",benhNhan);
    }
    @Override
    public GeneralResponse delete(String maBenhNhan) {
        BenhNhan benhNhan = benhNhanRepository.findByMaBenhNhan(maBenhNhan);
        benhNhanRepository.delete(benhNhan);
        return new GeneralResponse(HttpStatus.OK.value(),"",null);
    }
    @Override
    public GeneralResponse getBenhNhan(BenhNhanDTO benhNhanDTO) {
        BenhNhan benhNhan =benhNhanRepository.findByMaBenhNhan(benhNhanDTO.getMaBenhNhan());
        return new GeneralResponse(HttpStatus.OK.value(),"",benhNhan);
    }

}
