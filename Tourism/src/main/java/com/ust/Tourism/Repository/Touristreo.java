package com.ust.Tourism.Repository;

import com.ust.Tourism.Model.TouristPlace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Touristreo extends JpaRepository<TouristPlace, String> {
    List<TouristPlace> findByCountryname(String country);
}
