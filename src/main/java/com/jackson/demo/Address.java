package com.jackson.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {

    }
}
