package com.dao;

import com.model.Role;

import java.util.List;

public interface RoleDAO {

     List<Role> getAllRoles();

     void saveRole(Role role);

     void updateRole(Role updateRole, Long id);

     Role getRoleById(Long id);

     void deleteRole(Long id);

}
