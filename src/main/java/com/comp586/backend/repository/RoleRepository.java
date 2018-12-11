package com.comp586.backend.repository;

import java.util.Optional;

import com.comp586.backend.model.Role;
import com.comp586.backend.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}