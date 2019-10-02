package com.litesoftwares.trongrid.impl;

import com.litesoftwares.trongrid.TronGridAPIService;
import com.litesoftwares.trongrid.TronGridApi;
import com.litesoftwares.trongrid.TronGridApiClient;
import com.litesoftwares.trongrid.domain.*;

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

    @Override
    public Asset getAssets() {
        return getAssets(nullQuery);
    }

    @Override
    public Asset getAssets(Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getAssets(params));
    }

    @Override
    public Asset getAssetByName(String name) {
        return getAssetByName(name, nullQuery);
    }

    @Override
    public Asset getAssetByName(String name, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getAssetByName(name, params));
    }

    @Override
    public Asset getAssetById(String id) {
        return getAssetById(id,false);
    }

    @Override
    public Asset getAssetById(String id, boolean onlyConfirmed) {
        return tronGridApi.executeSync(tronGridAPIService.getAssetById(id, onlyConfirmed));
    }

    @Override
    public Event getEventsByTxId(String transactionId) {
        return getEventsByTxId(transactionId, nullQuery);
    }

    @Override
    public Event getEventsByTxId(String transactionId, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getEventsByTxId(transactionId, params));
    }

    @Override
    public Event getEventsByContractAddress(String contractAddress) {
        return getEventsByContractAddress(contractAddress, nullQuery);
    }

    @Override
    public Event getEventsByContractAddress(String contractAddress, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getEventsByContractAddress(contractAddress, params));
    }

    @Override
    public Event getEventsByBlockNumber(String blockNumber) {
        return getEventsByBlockNumber(blockNumber,false);
    }

    @Override
    public Event getEventsByBlockNumber(String blockNumber, boolean onlyConfirmed) {
        return tronGridApi.executeSync(tronGridAPIService.getEventsByBlockNumber(blockNumber,onlyConfirmed));
    }

    @Override
    public Event getEventsByLatestBlock() {
        return getEventsByLatestBlock(false);
    }

    @Override
    public Event getEventsByLatestBlock(boolean onlyConfirmed) {
        return tronGridApi.executeSync(tronGridAPIService.getEventsByLatestBlock(onlyConfirmed));
    }

    @Override
    public Contract getTxInfoByContract(String contractAddress) {
        return getTxInfoByContract(contractAddress, nullQuery);
    }

    @Override
    public Contract getTxInfoByContract(String contractAddress, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getTxInfoByContract(contractAddress, params));
    }
    
     @Override
    public TRC20Contract getTRC20Holders(String contractAddress) {
        return getTRC20Holders(contractAddress, nullQuery);
    }

    @Override
    public TRC20Contract getTRC20Holders(String contractAddress, Map<String, String> params) {
        return tronGridApi.executeSync(tronGridAPIService.getTRC20Holders(contractAddress, params));
    }
}
