package com.jb.hapoalim.Task.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Address {
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String streetAddress;



}
