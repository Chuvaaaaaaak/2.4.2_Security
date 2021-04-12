package com.dao;

import com.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public void saveRole(Role role) {

    }

    @Override
    public void updateRole(Role updateRole, Long id) {

    }

    @Override
    public Role getRoleById(Long id) {
        return null;
    }

    @Override
    public void deleteRole(Long id) {

    }
}
