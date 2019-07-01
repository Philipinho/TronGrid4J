package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Ping {
    @JsonProperty("Welcome to")
    private String welcomeTo;
    @JsonProperty("API version")
    private String apiVersion;

}
