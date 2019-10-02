package com.litesoftwares.trongrid;

import com.litesoftwares.trongrid.domain.*;

import java.util.Map;

public interface TronGridApiClient {
    Ping ping();

    Account getAccountInfo(String address);

    Account getAccountInfo(String address, Map<String, String> params);

    Transaction getTransactions(String address);

    Transaction getTransactions(String address, Map<String, String> params);

    Asset getAssets();

    Asset getAssets(Map<String, String> params);

    Asset getAssetByName(String name);

    Asset getAssetByName(String name, Map<String, String> params);

    Asset getAssetById(String id);

    Asset getAssetById(String id, boolean onlyConfirmed);

    Event getEventsByTxId(String transactionId);

    Event getEventsByTxId(String transactionId, Map<String, String> params);

    Event getEventsByContractAddress(String contractAddress);

    Event getEventsByContractAddress(String contractAddress, Map<String, String> params);

    Event getEventsByBlockNumber(String blockNumber);

    Event getEventsByBlockNumber(String blockNumber, boolean onlyConfirmed);

    Event getEventsByLatestBlock();

    Event getEventsByLatestBlock(boolean onlyConfirmed);

    Contract getTxInfoByContract(String contractAddress);

    Contract getTxInfoByContract(String contractAddress, Map<String, String> params);
    
    TRC20Contract getTRC20Holders(String contractAddress);

    TRC20Contract getTRC20Holders(String contractAddress, Map<String, String> params);

}
