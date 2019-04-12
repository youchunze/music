package com.hyczzz.music.repository;

import com.hyczzz.music.dataobject.TUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: hyczzz
 * @date: 2019/4/5 0005 22:39
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TUserRepositoryTest {
    @Autowired
    private TUserRepository tUserRepository;

    @Test
    public void addUser(){
        TUser tUser = new TUser();
        tUser.setLoginName("hyczzz");
        tUser.setPassword("123");
        tUser.setCouldId("1232");
        tUser.setQqId("123");
        tUser.setKugouId("1231");
        tUser.setRealName("1231");
        tUser.setPhone("1231");
        tUser.setEmail("1231");
        tUser.setSex(1);
        tUser.setPhoto(null);
        TUser user = tUserRepository.save(tUser);
        Assert.assertEquals(tUser.getLoginName(),user.getLoginName());
    }
}