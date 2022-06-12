package br.com.walletsafe.my_wallet_safe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.walletsafe.my_wallet_safe.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, String>{
    
}
