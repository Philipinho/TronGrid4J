package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Asset {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Data> data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Data {

        @JsonProperty("id")
        private String id;
        @JsonProperty("abbr")
        private String abbr;
        @JsonProperty("description")
        private String description;
        @JsonProperty("frozen_supply")
        private List<FrozenSupply> frozenSupply;
        @JsonProperty("name")
        private String name;
        @JsonProperty("num")
        private long num;
        @JsonProperty("precision")
        private long precision;
        @JsonProperty("total_supply")
        private long totalSupply;
        @JsonProperty("trx_num")
        private long trxNum;
        @JsonProperty("url")
        private String url;
        @JsonProperty("vote_score")
        private long voteScore;
        @JsonProperty("owner_address")
        private String ownerAddress;
        @JsonProperty("start_time")
        private long startTime;
        @JsonProperty("end_time")
        private long endTime;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class FrozenSupply {

        @JsonProperty("forzen_days")
        private long frozenDays;
        @JsonProperty("frozen_amount")
        private long frozenAmount;

    }

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
        @JsonProperty("approx_total_pages")
        private long approxTotalPages;
        @JsonProperty("fingerprint")
        private String fingerprint;
        @JsonProperty("links")
        private Links links;

    }

}