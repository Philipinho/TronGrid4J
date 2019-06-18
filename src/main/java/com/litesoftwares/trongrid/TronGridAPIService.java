package com.litesoftwares.trongrid;

import com.litesoftwares.trongrid.domain.*;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface TronGridAPIService {
    @GET("/")
    Call<Ping> ping();

    @GET("/v1/accounts/{address}")
    Call<Account> getAccountInfo(@Path("address") String address, @QueryMap Map<String, String> params);

    @GET("/v1/accounts/{address}/transactions")
    Call<Transaction> getTransactions(@Path("address") String address, @QueryMap Map<String, String> params);

    @GET("/v1/assets")
    Call<Asset> getAssets(@QueryMap Map<String, String> params);

    @GET("/v1/assets/{name}/list")
    Call<Asset> getAssetByName(@Path("name") String name, @QueryMap Map<String, String> params);

    @GET("/v1/assets/{identifier}")
    Call<Asset> getAssetById(@Path("identifier") String id, @Query("only_confirmed") boolean onlyConfirmed);

    @GET("/v1/transactions/{transactionID}/events")
    Call<Event> getEventsByTxId(@Path("transactionID") String transactionId, @QueryMap Map<String, String> params);

    @GET("/v1/contracts/{address}/events")
    Call<Event> getEventsByContractAddress(@Path("address") String contractAddress, @QueryMap Map<String, String> params);

    @GET("/v1/blocks/{block_number}/events")
    Call<Event> getEventsByBlockNumber(@Path("block_number") String blockNumber, @Query("only_confirmed") boolean onlyConfirmed);

    @GET("/v1/blocks/latest/events")
    Call<Event> getEventsByLatestBlock(@Query("only_confirmed") boolean onlyConfirmed);

    @GET("/v1/contracts/{contractAddress}/transactions")
    Call<Contract> getTxInfoByContract(@Path("contractAddress") String contractAddress, @QueryMap Map<String, String> params);




}
