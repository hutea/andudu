package com.hydom.account.service;

import com.hydom.account.ebean.Account;
import com.hydom.dao.DAO;

public interface AccountService extends DAO<Account> {

	public Account findByUP(String username, String password);

	public Account findByUsername(String username);

}
