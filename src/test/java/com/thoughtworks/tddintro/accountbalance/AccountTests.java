package com.thoughtworks.tddintro.accountbalance;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account acnt = new Account(100);
        acnt.makeDeposit(50);
        assertThat(acnt.getBalance(), is(150));
    }
//
    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account acnt = new Account(150);
        acnt.makeWithdrawl(100);
        assertThat(acnt.getBalance(), is(50));
    }
//
    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account acnt = new Account(50);
        acnt.makeWithdrawl(100);
        assertThat(acnt.getBalance(), is(50));
    }
}
