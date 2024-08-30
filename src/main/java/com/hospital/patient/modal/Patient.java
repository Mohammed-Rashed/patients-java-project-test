package com.hospital.patient.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {


    private String name;
    private int age;

    public Patient() {
//        this.name = name;
    }


    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
}
