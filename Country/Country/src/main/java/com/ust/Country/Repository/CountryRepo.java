package com.ust.Country.Repository;

import com.ust.Country.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepo extends JpaRepository<Country,String> {
    Country findByCountryname(String c);

    List<Country> findAllByOrderByGdpDesc();

    void deleteByCountryname(String countryname);
}
