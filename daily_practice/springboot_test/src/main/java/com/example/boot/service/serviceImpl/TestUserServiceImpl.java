package com.example.boot.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.boot.domain.TestUser;
import com.example.boot.dao.TestUserMapper;
import com.example.boot.domain.TestUserExample;
import com.example.boot.service.TestUserService;
@Service
public class TestUserServiceImpl implements TestUserService{

    @Resource
    private TestUserMapper testUserMapper;

    @Override
    public long countByExample(TestUserExample example) {
        return testUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TestUserExample example) {
        return testUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return testUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestUser record) {
        return testUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TestUser record) {
        return testUserMapper.insertSelective(record);
    }

    @Override
    public List<TestUser> selectByExample(TestUserExample example) {
        return testUserMapper.selectByExample(example);
    }

    @Override
    public TestUser selectByPrimaryKey(String id) {
        return testUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TestUser record,TestUserExample example) {
        return testUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TestUser record,TestUserExample example) {
        return testUserMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TestUser record) {
        return testUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestUser record) {
        return testUserMapper.updateByPrimaryKey(record);
    }

}
