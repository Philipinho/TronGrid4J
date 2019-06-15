package com.litesoftwares.trongrid;

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

}
