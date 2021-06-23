package com.company.managementportal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "MANAGEMENTPORTAL_PAYMENT", indexes = {
        @Index(name = "IDX_MANAGEMENTPORTAL_PAYMENT_TRANSACTION_CODE", columnList = "TRANSACTION_CODE")
})
@Entity(name = "managementportal_Payment")
@NamePattern("%s %s|paymentType,transactionCode")
public class Payment extends StandardEntity {
    private static final long serialVersionUID = 189013454298697973L;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @NotNull
    @Column(name = "TRANSACTION_CODE", nullable = false, unique = true)
    private String transactionCode;

    @NotNull
    @Column(name = "PAYMENT_TYPE", nullable = false)
    private String paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUARD_ID")
    private Guard guard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}