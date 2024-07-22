package com.ust.Tourism.Service;

import com.ust.Tourism.Client.Country;
import com.ust.Tourism.Client.FullResponse;
import com.ust.Tourism.Figen.FigenClient;
import com.ust.Tourism.Model.TouristPlace;
import com.ust.Tourism.Repository.Touristreo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TService {
    @Autowired
    private Touristreo t;
    @Autowired
    FigenClient  f;
    public TouristPlace addTourist(TouristPlace place)
    {
        return t.save(place);
    }

    public List<FullResponse> getTouristbyCountry(String country)
    {
        List<FullResponse> f1 = new ArrayList<FullResponse>();
        Country c =f.getCountry(country);
        List<TouristPlace> t1= t.findByCountryname(country);
        for(TouristPlace tt:  t1)
        {
            FullResponse f2 = new FullResponse();
            f2.name = tt.getName();
            f2.countryname = tt.getCountryname();
            f2.university = tt.getUniversity();
            f2.expenseinusd = tt.getExpenseinusd();
            f2.country = c;
            f1.add(f2);
        }

            return f1;

    }

    public List<TouristPlace> findAll() {
        return t.findAll();
    }

    public List<TouristPlace> getTouristByUniversity(String universityname) {
        return t.findAll().stream().filter(t -> t.getUniversity().equals(universityname)).collect(Collectors.toList());
    }
}
