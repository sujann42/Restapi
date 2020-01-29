package com.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper= new ObjectMapper();
            Student student= mapper.readValue
                    (new File("data/sample-full.json"),Student.class);
            System.out.println(student.getFirstName());
            System.out.println(student.getId());
            System.out.println(student.getLastName());
            System.out.println(student.isActive());
            Address address= student.getAddress();

            System.out.println(address.getCity());
            System.out.println(address.getCountry());
            System.out.println(address.getState());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
