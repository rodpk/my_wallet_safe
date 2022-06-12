package br.com.walletsafe.my_wallet_safe.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
public class Wallet {
    
    @Column(name = "wallet_id")
    private Integer id;

    @Column(name = "total_balance")
    private BigDecimal totalBalance;
    
    @OneToOne(mappedBy = "wallet")
    private Person person;

    @OneToMany(mappedBy = "sender")
    private Set<TransactionHistory> senderTransactions;
    
    @OneToMany(mappedBy = "receiver")
    private Set<TransactionHistory> receiverTransactions;
}
