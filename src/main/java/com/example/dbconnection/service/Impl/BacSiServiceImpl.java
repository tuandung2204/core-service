package com.example.dbconnection.service.Impl;

import com.example.dbconnection.entity.BacSi;
import com.example.dbconnection.entity.dto.BacSiDTO;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.repository.BacSiRepository;
import com.example.dbconnection.service.BacSiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BacSiServiceImpl implements BacSiService {
    @Autowired
    BacSiRepository bacSiRepository;
    @Override
    public GeneralResponse create(BacSiDTO bacSiDTO) {
        BacSi bacsi = new BacSi();
        bacsi.setMaBacSi(bacSiDTO.getMaBacSi());
        bacsi.setHoTen(bacSiDTO.getHoTen());
        bacsi.setTuoi(bacSiDTO.getTuoi());
        bacsi.setEmail(bacSiDTO.getEmail());
        bacsi.setSoDienThoai(bacSiDTO.getSoDienThoai());
        bacsi.setChuyenKhoa(bacSiDTO.getChuyenKhoa());
        bacSiRepository.save(bacsi);
        return new GeneralResponse(HttpStatus.OK.value(),"",bacsi);
    }

    @Override
    public GeneralResponse update(BacSiDTO bacSiDTO) {
        BacSi bacsi = bacSiRepository.findByMaBacSi(bacSiDTO.getMaBacSi());
        if (bacsi == null) {
            return new GeneralResponse(HttpStatus.NOT_FOUND.value(), "Bác sĩ không tồn tại", null);
        }
        log.info("Before update: " + bacsi);
        bacsi.setHoTen(bacSiDTO.getHoTen());
        bacsi.setTuoi(bacSiDTO.getTuoi());
        bacsi.setEmail(bacSiDTO.getEmail());
        bacsi.setSoDienThoai(bacSiDTO.getSoDienThoai());
        bacsi.setChuyenKhoa(bacSiDTO.getChuyenKhoa());
        log.info("After update: " + bacsi);

        bacSiRepository.save(bacsi);
        return new GeneralResponse(HttpStatus.OK.value(),"Cập nhật thành công ",bacsi);
    }

    @Override
    public GeneralResponse delete(String maBacSi) {
            BacSi bacSi = bacSiRepository.findByMaBacSi(maBacSi);
            if (bacSi == null) {
                return new GeneralResponse(HttpStatus.NOT_FOUND.value(), "Không tìm thấy bác sĩ để xóa", null);
            }

            bacSiRepository.delete(bacSi);
            log.info("Deleting BacSi with maBacSi: " + maBacSi);
            return new GeneralResponse(HttpStatus.OK.value(), "Xóa thành công", null);

        }

    @Override
    public GeneralResponse getBacsi(BacSiDTO bacSiDTO) {
        BacSi bacsi =bacSiRepository.findByMaBacSi(bacSiDTO.getMaBacSi());
        return new GeneralResponse(HttpStatus.OK.value(),"",bacsi);
    }

}
