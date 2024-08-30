package com.hospital.patient.modal;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModal {
    public String getName() {
        return name;
    }

    private String name;
    List<String> names= new ArrayList<>();
    List<Object> persons= new ArrayList<>();


    PatientModal(){
        names.add("Mohammed");
        names.add("Rashed");
        names.add("Farida");
        names.add("Fedra");

        persons.add(new Object[]{"Rashed",31});
        persons.add(new Object[]{"Asmaa",32});
        persons.add(new Object[]{"Farida",4});
        persons.add(new Object[]{"Fedra",1});
    }
    public String getPatientNameFormDatabase(){
        return names.get(0);
    }
    public List<String> getAllNames(){
        return names;
    }
    public List<Object> getAllPersons(){
        return persons;
    }
}
