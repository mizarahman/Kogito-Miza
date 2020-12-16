package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

import org.acme.Account;
import org.acme.Current;

@ApplicationScoped
public class CurrentAccountService {

	public Current currentAccount(Account account) {
	return new Current(account.getName(),account.getAge());

	}
}
