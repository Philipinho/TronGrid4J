package com.litesoftwares.trongrid;

import com.litesoftwares.trongrid.domain.Asset;
import com.litesoftwares.trongrid.domain.Ping;
import com.litesoftwares.trongrid.domain.Account;
import com.litesoftwares.trongrid.domain.Transaction;

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

}
