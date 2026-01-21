package com.jpmc.midascore.service;

import com.jpmc.midascore.foundation.Transaction;

public interface TransactionService {
    boolean processTransaction(Transaction transaction);
}
