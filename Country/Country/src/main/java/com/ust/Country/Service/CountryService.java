package com.ust.Country.Service;

import com.ust.Country.Model.Country;
import com.ust.Country.Repository.CountryRepo;
import com.ust.Country.dto.Countrydto;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CountryService {

@Autowired
private CountryRepo repo;
    public Country addCountry(@Valid Countrydto ct) {
        Country c =Country.builder()
                .countryname(ct.getCountryname())
                .capital(ct.getCapital())
                .population(ct.getPopulation())
                .currency(ct.getCurrency())
                .gdp(ct.getGdp())
                .currencyvalueusdollers(ct.getCurrencyvalueusdollers())

                .build();
        return repo.save(c);
    }

    public Country getCountry(String c) {
        return repo.findByCountryname(c);
    }

    public List<Country> getCountryGDP() {
        return repo.findAllByOrderByGdpDesc();
    }

    public Country updateCountry(String countryname, String dollars) {
        Country c = repo.findByCountryname(countryname);
        if (c == null) {
            return null;
        }
        c.setCurrencyvalueusdollers(dollars);
        return repo.save(c);
    }
    @Transactional
    public void deleteCountryByName(String countryName) {
       repo.deleteByCountryname(countryName);
    }

}
