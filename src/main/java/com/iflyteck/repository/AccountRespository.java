package com.iflyteck.repository;

import com.iflyteck.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRespository extends JpaRepository<Account, Integer> {
    public List<Account> findAll();
}
