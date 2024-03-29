package com.balasamajam.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PaymentModel
{
    private String memberFullName;

    private String collectedByFullName;

    private double amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date paymentDate;

    public String getMemberFullName() {
        return memberFullName;
    }

    public void setMemberFullName(String memberFullName) {
        this.memberFullName = memberFullName;
    }

    public String getCollectedByFullName() {
        return collectedByFullName;
    }

    public void setCollectedByFullName(String collectedByFullName) {
        this.collectedByFullName = collectedByFullName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
