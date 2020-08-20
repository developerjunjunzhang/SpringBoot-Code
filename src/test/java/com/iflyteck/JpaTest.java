package com.iflyteck;

import com.iflyteck.domain.Account;
import com.iflyteck.repository.AccountRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootCodeApplication.class)
public class JpaTest {
    @Autowired
    private AccountRespository accountRespository;

    @Test
    public void test () {
        List<Account> accounts = accountRespository.findAll();
        System.out.println(accounts);
    }
}
