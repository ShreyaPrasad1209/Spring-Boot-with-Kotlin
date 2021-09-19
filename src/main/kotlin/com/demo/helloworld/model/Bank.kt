package com.demo.helloworld.model

class Bank {

    private val accountNum: String
    private val trust: Double
    private val transactionFee: Int

    constructor(accountNum: String, trust: Double, transaction_fee: Int)
    {
        this.accountNum=accountNum
        this.trust=trust
        this.transactionFee=transaction_fee
    }

    fun getAccountNum(): String
    {
        return this.accountNum;
    }

    fun getTrust(): Double
    {
        return this.trust;
    }

    fun getTransactionFee(): Int
    {
        return this.transactionFee;
    }






}