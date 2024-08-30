package com.hospital.patient.service;

import com.hospital.patient.modal.Patient;
import com.hospital.patient.modal.PatientModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {


    @Autowired
    private PatientModal patientModal;

    public String printName(String name){
        return "my name is " + patientModal.getPatientNameFormDatabase().toUpperCase();
    }

    public String printAllNames(){

        List<String> names = patientModal.getAllNames();

//        String namesAsString = names.stream()
//                .collect(Collectors.joining(", ")); // Join with ", "

        String namesAsString = String.join(", ", names); // Join with ", "

        return namesAsString;

    }
    public Patient findName(String name){
        List<String> names = patientModal.getAllNames();

        String n = names
                .stream()
                .filter(i -> i.equals(name)  )
                .findAny()
                .orElse("Not Found");
        Patient p = new Patient();
        p.setName(name);
        return p;
//        return n.toUpperCase();

    }

    public List<Patient> getPatients(){
        ArrayList<Patient> patients = new ArrayList<>();
        patientModal.getAllPersons().forEach(personObj ->
        {
            Object[] person = (Object[]) personObj;
            String name = (String) person[0]; // Example of getting name from person
            int age =(int) person[1];      // Example of getting age from person
            patients.add(new Patient(name, age)); // Add new Patient with dynamic data
        });
        return  patients;
    }
}
