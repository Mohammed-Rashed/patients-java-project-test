package com.hospital.patient.controllers;

import com.hospital.patient.modal.Inc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/inc") // for prefix
public class IncController {

    @GetMapping("get-patient-info")
        public Inc getPatientInc(){
//            Inc c = new Inc();
//            c.setId(UUID.randomUUID());
//            c.setPatientName("Rashed");
//            c.setIncNo(1234);

        //use builder from lombok
          return  Inc.builder()
                    .patientName("Rashed")
                    .IncNo(1234)
                    .id(UUID.randomUUID())
                    .build();
        }

}
