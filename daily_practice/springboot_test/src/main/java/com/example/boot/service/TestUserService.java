package com.example.boot.service;

import java.util.List;
import com.example.boot.domain.TestUser;
import com.example.boot.domain.TestUserExample;
public interface TestUserService{


    long countByExample(TestUserExample example);

    int deleteByExample(TestUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    List<TestUser> selectByExample(TestUserExample example);

    TestUser selectByPrimaryKey(String id);

    int updateByExampleSelective(TestUser record,TestUserExample example);

    int updateByExample(TestUser record,TestUserExample example);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

}
