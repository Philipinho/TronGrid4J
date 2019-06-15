package com.litesoftwares.trongrid.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class Account {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private List<Data> data;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class AccountResource {

    @JsonProperty("latest_consume_time_for_energy")
    private long latestConsumeTimeForEnergy;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class ActivePermission {

    @JsonProperty("id")
    private long id;
    @JsonProperty("keys")
    private List<Key> keys;
    @JsonProperty("operations")
    private String operations;
    @JsonProperty("permission_name")
    private String permissionName;
    @JsonProperty("threshold")
    private long threshold;
    @JsonProperty("type")
    private String type;

}

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class AssetV2 {

    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private long value;
}
    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Data {

    @JsonProperty("account_resource")
    private AccountResource accountResource;
    @JsonProperty("active_permission")
    private List<ActivePermission> activePermission;
    @JsonProperty("address")
    private String address;
    @JsonProperty("assetV2")
    private List<AssetV2> assetV2;
    @JsonProperty("balance")
    private long balance;
    @JsonProperty("create_time")
    private long createTime;
    @JsonProperty("free_asset_net_usageV2")
    private List<FreeAssetNetUsageV2> freeAssetNetUsageV2;
    @JsonProperty("free_net_usage")
    private long freeNetUsage;
    @JsonProperty("latest_consume_free_time")
    private long latestConsumeFreeTime;
    @JsonProperty("latest_opration_time")
    private long latestOprationTime;
    @JsonProperty("owner_permission")
    private OwnerPermission ownerPermission;
    @JsonProperty("trc20")
    private List<Object> trc20;

}
    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data

    public static class FreeAssetNetUsageV2 {

    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private long value;

}
    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Key {

    @JsonProperty("address")
    private String address;
    @JsonProperty("weight")
    private long weight;

}

    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    public static class Key_ {

    @JsonProperty("address")
    private String address;
    @JsonProperty("weight")
    private long weight;

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
    public static class OwnerPermission {

    @JsonProperty("keys")
    private List<Key_> keys;
    @JsonProperty("permission_name")
    private String permissionName;
    @JsonProperty("threshold")
    private long threshold;

}
}