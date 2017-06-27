package com.it.services.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.it.dao.RoleDAO;
import com.it.entities.Role;
import com.it.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDAO roleDAO;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int insertRole(Role role) {
		return this.roleDAO.insertRole(role);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateRole(Role role) {
		// TODO Auto-generated method stub
		return this.roleDAO.updateRole(role);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteRole(Integer id) {
		// TODO Auto-generated method stub
		return this.roleDAO.deleteRole(id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public Role getRole(Integer id) {
		// TODO Auto-generated method stub
		return this.roleDAO.getRole(id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public List<Role> findRoles(String roleName, int start, int limit) {
		// TODO Auto-generated method stub
		return this.roleDAO.findRoles(roleName, new RowBounds(start,limit));
	}

}
