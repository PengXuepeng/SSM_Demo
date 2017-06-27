package com.it.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.it.entities.Role;

@Repository
public interface RoleDAO {
	public int insertRole(Role role);

	public int updateRole(Role role);

	public int deleteRole(Integer id);

	public Role getRole(Integer id);

	public List<Role> findRoles(String roleName, RowBounds rowBounds);

}
