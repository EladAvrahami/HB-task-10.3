package com.jb.hapoalim.Task.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @Min(14)
    @Max(120)
    @NotNull
    private int age;
    //@Valid
   // private Address address;


}
