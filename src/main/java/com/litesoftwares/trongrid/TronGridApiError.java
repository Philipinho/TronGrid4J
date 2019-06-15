package com.litesoftwares.trongrid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TronGridApiError {
    private int code;
    @JsonProperty("error")
    private String message;

}
