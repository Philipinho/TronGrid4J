package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Transaction {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Data> data = null;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Contract {

        @JsonProperty("parameter")
        private Parameter parameter;
        @JsonProperty("type")
        private String type;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Data {

        @JsonProperty("block_timestamp")
        private long blockTimestamp;
        @JsonProperty("raw_data")
        private RawData rawData;
        @JsonProperty("raw_data_hex")
        private String rawDataHex;
        @JsonProperty("ret")
        private List<Ret> ret = null;
        @JsonProperty("signature")
        private List<String> signature = null;
        @JsonProperty("txID")
        private String txID;

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

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Parameter {

        @JsonProperty("type_url")
        private String typeUrl;
        @JsonProperty("value")
        private Value value;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class RawData {

        @JsonProperty("contract")
        private List<Contract> contract = null;
        @JsonProperty("expiration")
        private long expiration;
        @JsonProperty("fee_limit")
        private long feeLimit;
        @JsonProperty("ref_block_bytes")
        private String refBlockBytes;
        @JsonProperty("ref_block_hash")
        private String refBlockHash;
        @JsonProperty("timestamp")
        private long timestamp;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Ret {

        @JsonProperty("code")
        private String code;
        @JsonProperty("contractRet")
        private String contractRet;
        @JsonProperty("fee")
        private long fee;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Value {

        @JsonProperty("call_value")
        private long callValue;
        @JsonProperty("contract_address")
        private String contractAddress;
        @JsonProperty("data")
        private String data;
        @JsonProperty("owner_address")
        private String ownerAddress;

    }

}
