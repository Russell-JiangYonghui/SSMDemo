package com.ssm.dao;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int deletePrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}

