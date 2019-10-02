package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TRC20Contract {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Map<String, Long>> data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Links {

        @JsonProperty("next")
        private String next;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Meta {

        @JsonProperty("at")
        private long at;
        @JsonProperty("page_size")
        private long pageSize;
        @JsonProperty("fingerprint")
        private String fingerprint;
        @JsonProperty("links")
        private Links links;

    }

}
