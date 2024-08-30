package com.hospital.patient.controllers;

import com.hospital.patient.modal.Patient;
import com.hospital.patient.modal.PatientModal;
import com.hospital.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired // make Dependence injection
    private PatientService patientService; // class then name

    @GetMapping("/print-name")
    public String printName() {
        return patientService.printName("Rashed"); // Ensure this is a valid view name
    }

    @GetMapping("/print-specific-name")
    public String printSpecificName() {
        return patientService.printAllNames(); // Ensure this is a valid view name
    }
//    @GetMapping("/find-name")
//    public String findName(@RequestParam String name) {
//        return patientService.findName(name); // Ensure this is a valid view name
//    }

    @GetMapping("/find-name-json")
    public ResponseEntity findNameJson(@RequestParam String name) {
        return ResponseEntity.ok(patientService.findName(name));
    }
    @GetMapping("/get-patients")
    public ResponseEntity getPatients() {
        return ResponseEntity.ok(patientService.getPatients());
    }

    @PostMapping("/store")
    public ResponseEntity storePatient(@RequestBody Patient patient) {
       return ResponseEntity.ok(patient);
    }
}
