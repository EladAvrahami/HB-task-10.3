package com.jb.hapoalim.Task.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckRequest {

    @Valid
    private Customer customer;
}
