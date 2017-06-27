package com.it.services;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.it.entities.Role;

public interface RoleService {
	public int insertRole(Role role);

	public int updateRole(Role role);

	public int deleteRole(Integer id);

	public Role getRole(Integer id);

	public List<Role> findRoles(String roleName, int start, int limit);
}
