package com.example.dbconnection.service.Impl;

import com.example.dbconnection.entity.DoctorEntity;
import com.example.dbconnection.entity.dto.req.DoctorReq;
import com.example.dbconnection.entity.dto.res.GeneralResponse;
import com.example.dbconnection.extra.utils.GeneratedRandomStringUtils;
import com.example.dbconnection.repository.DoctorRepository;
import com.example.dbconnection.service.DoctorService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private GeneratedRandomStringUtils generatedRandomStringUtils;


    @Override
    public GeneralResponse add(DoctorReq doctorReq) {

        if (doctorReq == null) {
            return new GeneralResponse(HttpStatus.BAD_REQUEST.value(), "", "No input for doctor", null);
        }
        String genString = generatedRandomStringUtils.generateSecureHexString(4);
        String drId = doctorReq.getDepartment().concat("-");
        String combined = String.format("%s%s", drId, genString);

        DoctorEntity validationDr = doctorRepository.findByDrId(combined);
        if (validationDr != null) {
            return new GeneralResponse(HttpStatus.BAD_REQUEST.value(), "", "Doctor with this Id exists", null);
        }

        DoctorEntity doctorEntity = DoctorEntity.builder()
                .age(doctorReq.getAge())
                .department(doctorReq.getDepartment())
                .email(doctorReq.getEmail())
                .drName(doctorReq.getDrName())
                .telephone(doctorReq.getTelephone())
                .position(doctorReq.getPosition())
                .drId(combined)
                .build();
        doctorRepository.save(doctorEntity);
        return new GeneralResponse(HttpStatus.OK.value(), "", "Doctor added", doctorEntity);
    }

    @Override
    public GeneralResponse update(DoctorReq doctorReq) {
        if (doctorReq == null) {
            return new GeneralResponse(HttpStatus.BAD_REQUEST.value(), "", "No input for doctor", null);
        }

        DoctorEntity doctorEntity = doctorRepository.findByDrId(doctorReq.getDrId());

        if (doctorEntity == null) {
            return new GeneralResponse(HttpStatus.NOT_FOUND.value(), "", "Doctor not found", null);
        }

        doctorEntity.setEmail(doctorReq.getEmail());
        doctorEntity.setTelephone(doctorReq.getTelephone());
        doctorEntity.setPosition(doctorReq.getPosition());
        doctorEntity.setDepartment(doctorReq.getDepartment());
        doctorEntity.setDrName(doctorReq.getDrName());
        doctorEntity.setAge(doctorReq.getAge());
        doctorRepository.save(doctorEntity);

        return new GeneralResponse(HttpStatus.OK.value(), "", "Doctor updated", doctorEntity);
    }

    @Override
    public GeneralResponse delete(String drId) {
        DoctorEntity doctorEntity = doctorRepository.findByDrId(drId);
        if (doctorEntity == null) {
            return new GeneralResponse(HttpStatus.NOT_FOUND.value(), "", "Doctor not found", null);
        }
        doctorRepository.delete(doctorEntity);
        return new GeneralResponse(HttpStatus.OK.value(), "", "Doctor deleted", doctorEntity);
    }

    @PostConstruct
    public void init() {
        DoctorReq doctorReq = new DoctorReq();
        doctorReq.setAge(40);
        doctorReq.setDepartment("Cardiology");
        doctorReq.setDrName("Doctor");
        doctorReq.setEmail("doctor@gmail.com");
        doctorReq.setTelephone("1234567890");
        doctorReq.setPosition("Staff");

        GeneralResponse d = add(doctorReq);
        log.info("Doctor added: " + d.getData());

    }

}
