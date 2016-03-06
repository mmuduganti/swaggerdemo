package com.example.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.joda.time.DateTime;

import java.time.LocalDate;

@Data
@ApiModel
public class FirstRequest {

    String name;
    LocalDate localDate;
    DateTime dateTime;
}
