package br.com.walletsafe.my_wallet_safe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class Person {

    @Column(name = "name")
    private String name;

    @Column(name = "doc", unique = true, length = 14)
    private String doc;

    @Column(name = "email")
    private String email;

    @Column(name = "cellphone")
    private String cellphone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id", referencedColumnName = "wallet_id")
    private Wallet wallet;
}
