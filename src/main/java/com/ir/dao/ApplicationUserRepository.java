package com.ir.dao;

import com.ir.model.ApplicationUser;

public interface ApplicationUserRepository {//extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);

    void save(ApplicationUser user);
}
