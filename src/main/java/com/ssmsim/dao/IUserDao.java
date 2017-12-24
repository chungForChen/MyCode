package com.ssmsim.dao;

import com.ssmsim.model.User;

public interface IUserDao {

    User selectUser(long id);

}