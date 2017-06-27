package com.it.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.it.entities.User;


public interface UserDAO {
	public User getUser(Integer id);

	public int insertUsedr(User user);

	public int updateUser(User user);

	public int deleteUser(Integer id);

	public List<User> findUsers(String userName, RowBounds rowBounds);
}
