package com.jbk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbk.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Long> {

}
