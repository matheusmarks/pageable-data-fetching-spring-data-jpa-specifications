package com.example.advancedsearch.dto;

import com.example.advancedsearch.enums.MaritalStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class PersonFilter {

    private String name;
    private String email;
    private MaritalStatusEnum maritalStatus;
    private String district;
    private String city;
    private String state;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate initialBirthday;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate finalBirthday;



}
