package com.ssm.service.Impl;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 2018/8/29.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        userDao.insert(user);

    }

    @Override
    public User getUser(int id) {
        return userDao.selectById(id);
    }

    @Override
    public boolean updateById(User user) {
        return userDao.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean deleteById(int id) {
        return userDao.deletePrimaryKey(id) > 0;
    }
}
