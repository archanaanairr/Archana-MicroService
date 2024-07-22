package com.example.education.Repository;

import com.example.education.Model.EduUni;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EduRepo extends JpaRepository<EduUni,String> {



    List<EduUni> findByOrderByWorldrankingDesc();


    List<EduUni> findAllByOrderByAcceptancerateDesc();

   List< EduUni > findByCountryname(String countryname);
}
