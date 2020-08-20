package com.iflyteck;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iflyteck.domain.Account;
import com.iflyteck.repository.AccountRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootCodeApplication.class)
public class RedisTest {

    @Autowired
    private AccountRespository accountRespository;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test() throws JsonProcessingException {
        String allAccount = redisTemplate.boundValueOps("findAllAccount").get();
        if (allAccount == null) {
            List<Account> accounts= accountRespository.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            String accountsString = objectMapper.writeValueAsString(accounts);
            redisTemplate.boundValueOps("findAllAccount").set(accountsString);
            System.out.println("===========从数据库中获取数据===============");
        } else {
            System.out.println("===========从redis中获取数据===============");
        }
        System.out.println(allAccount);
    }
}
