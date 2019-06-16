package com.litesoftwares.trongrid;

import com.litesoftwares.trongrid.domain.Asset;
import com.litesoftwares.trongrid.domain.Ping;
import com.litesoftwares.trongrid.domain.Account;
import com.litesoftwares.trongrid.domain.Transaction;

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


}
