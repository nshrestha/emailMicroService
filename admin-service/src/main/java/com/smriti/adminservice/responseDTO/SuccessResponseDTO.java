package com.smriti.adminservice.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponseDTO {

    private String message;

    public SuccessResponseDTO(String message) {
        this.message = message;
    }

}
