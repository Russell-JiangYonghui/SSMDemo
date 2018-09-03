package com.ssm.service;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by mac on 2018/8/29.
 */
@Repository
public interface UserService {
    void save(User user);
    User getUser(int id);
    boolean updateById(User user);
    boolean deleteById(int id);
}
