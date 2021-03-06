package com.ensias.albchometimelineservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationResponse {

    int status;
    String error;
    String message;
    String path;
}