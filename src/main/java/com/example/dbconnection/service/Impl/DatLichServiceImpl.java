package com.example.dbconnection.service.Impl;

import com.example.dbconnection.entity.DatLich;
import com.example.dbconnection.entity.dto.DatLichDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.repository.DatLichRepository;
import com.example.dbconnection.service.DatLichService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DatLichServiceImpl implements DatLichService {
    @Autowired
    DatLichRepository datLichRepository;
    @Override
    public GeneralResponse create(DatLichDTO datLichDTO) {
        DatLich datlich = new DatLich();
        datlich.setMaPhieuDatLich(datLichDTO.getMaPhieuDatLich());
        datlich.setNgayHen(datLichDTO.getNgayHen());
        datlich.setGioHen(datLichDTO.getGioHen());
        datlich.setBacSi(datLichDTO.getBacSi());
        datlich.setSoPhong(datLichDTO.getSoPhong());
        datLichRepository.save(datlich);
        return new GeneralResponse(HttpStatus.OK.value(), "", datlich);

    }

    @Override
    public GeneralResponse update(DatLichDTO datLichDTO) {
        DatLich datlich = datLichRepository.findByMaPhieuDatLich(datLichDTO.getMaPhieuDatLich());
        datlich.setNgayHen(datLichDTO.getNgayHen());
        datlich.setGioHen(datLichDTO.getGioHen());
        datlich.setBacSi(datLichDTO.getBacSi());
        datlich.setSoPhong(datLichDTO.getSoPhong());
        datLichRepository.save(datlich);
        return new GeneralResponse(HttpStatus.OK.value(), "", datlich);
    }

    @Override
    public GeneralResponse getDatLich(DatLichDTO datLichDTO) {
        DatLich datlich = datLichRepository.findByMaPhieuDatLich(datLichDTO.getMaPhieuDatLich());
        return new GeneralResponse(HttpStatus.OK.value(), "", datlich);
    }

    @Override
    public GeneralResponse delete(String maPhieuDatLich) {
        DatLich datlich = datLichRepository.findByMaPhieuDatLich(maPhieuDatLich);
        datLichRepository.delete(datlich);
        return new GeneralResponse(HttpStatus.OK.value(), "", null);
    }

}
