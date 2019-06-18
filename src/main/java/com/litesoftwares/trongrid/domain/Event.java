package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class Event {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Data> data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Data {

        @JsonProperty("caller_contract_address")
        private String callerContractAddress;
        @JsonProperty("transaction_id")
        private String transactionId;
        @JsonProperty("result")
        private Result result;
        @JsonProperty("result_type")
        private ResultType resultType;
        @JsonProperty("block_timestamp")
        private long blockTimestamp;
        @JsonProperty("block_number")
        private long blockNumber;
        @JsonProperty("event_name")
        private String eventName;
        @JsonProperty("contract_address")
        private String contractAddress;
        @JsonProperty("event_index")
        private long eventIndex;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Meta {

        @JsonProperty("at")
        private long at;
        @JsonProperty("page_size")
        private long pageSize;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Result {

        @JsonProperty("from")
        private String from;
        @JsonProperty("to")
        private String to;
        @JsonProperty("value")
        private String value;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class ResultType {

        @JsonProperty("from")
        private String from;
        @JsonProperty("to")
        private String to;
        @JsonProperty("value")
        private String value;

    }

}