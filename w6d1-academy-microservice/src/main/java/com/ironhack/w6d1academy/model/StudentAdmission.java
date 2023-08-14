package com.ironhack.w6d1academy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAdmission {
    Integer studentId;
    Boolean isAdmitted;
}
