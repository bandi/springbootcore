package com.ir.dao.impl;

import com.ir.dao.ApplicationUserRepository;
import com.ir.model.ApplicationUser;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class ApplicationUserRepositoryImpl implements ApplicationUserRepository {

    @Override
    public ApplicationUser findByUsername(String username) {
        return new ApplicationUser(1L,"tom","cat");
    }

    @Override
    public void save(ApplicationUser user) {
        //todo:save;
    }
}