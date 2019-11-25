package pl.jasiek.app.repo;

import pl.jasiek.app.model.Transaction;

import java.util.List;

public interface TransactionsRepo {
    Transaction findTransactionByName(String name);
    List<Transaction> findAll();
}
