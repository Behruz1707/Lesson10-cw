package model;

import java.util.List;

public class Payment {
    private String accFrom;
    private String accTo;
    private double amount;
    private List<Payment> payments;

    public Payment(String accFrom, String accTo, double amount) {
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
    }

    public String getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(String accFrom) {
        this.accFrom = accFrom;
    }

    public String getAccTo() {
        return accTo;
    }

    public void setAccTo(String accTo) {
        this.accTo = accTo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
