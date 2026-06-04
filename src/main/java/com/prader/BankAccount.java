package com.prader;

public class BankAccount {
    private Double amount;
    private Integer id;
    private String accountName;
    private Integer accountAge;

    public BankAccount(Double amount, Integer accountAge, String accountName, Integer id) {
        this.amount = amount;
        this.accountAge = accountAge;
        this.accountName = accountName;
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountAge() {
        return accountAge;
    }

    public void setAccountAge(Integer accountAge) {
        this.accountAge = accountAge;
    }
}
