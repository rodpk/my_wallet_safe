package br.com.walletsafe.my_wallet_safe.model;

import java.time.LocalDateTime;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;


@Data
public class TransactionHistory {

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private Wallet sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false) 
    private Wallet receiver;

    private LocalDateTime transactionTime;

}
