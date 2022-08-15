package com.main.repos;

import java.util.List;

import com.main.model.Transactions;

public interface TransactionsRepo {
	
	List<Transactions> get();
	List<Transactions> get(String customer_id);
	void transaction(Transactions transc);

}