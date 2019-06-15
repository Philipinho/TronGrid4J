package com.litesoftwares.trongrid.impl;

import com.litesoftwares.trongrid.TronGridAPIService;
import com.litesoftwares.trongrid.TronGridApi;
import com.litesoftwares.trongrid.TronGridApiClient;
import com.litesoftwares.trongrid.domain.Ping;
import com.litesoftwares.trongrid.domain.Account;
import com.litesoftwares.trongrid.domain.Transaction;

import java.util.HashMap;
import java.util.Map;

public class TronGridApiClientImpl implements TronGridApiClient {
    private TronGridApi tronGridApi;
    private TronGridAPIService tronGridAPIService;
    private Map<String, String> nullQuery = new HashMap<>();

    public TronGridApiClientImpl(){
        this.tronGridApi = new TronGridApi();
        this.tronGridAPIService = tronGridApi.createService(TronGridAPIService.class);
    }

    @Override
    public Ping ping() {
        return tronGridApi.executeSync(tronGridAPIService.ping());
    }

    @Override
    public Account getAccountInfo(String address) {
        return getAccountInfo(address, nullQuery);
    }

    @Override
    public Account getAccountInfo(String address,Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getAccountInfo(address,params));
    }

    @Override
    public Transaction getTransactions(String address) {
        return tronGridApi.executeSync(tronGridAPIService.getTransactions(address, nullQuery));
    }

    @Override
    public Transaction getTransactions(String address, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getTransactions(address,params));
    }

}
