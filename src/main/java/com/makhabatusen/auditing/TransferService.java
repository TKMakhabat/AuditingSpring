package com.makhabatusen.auditing;

public interface TransferService {

    void transfer(String accountA, String accountB, Long amount);

}
