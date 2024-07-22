package com.ust.Country.Controller;

import com.netflix.discovery.converters.Auto;
import com.ust.Country.Model.Country;
import com.ust.Country.Service.CountryService;
import com.ust.Country.dto.Countrydto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    public CountryService cs;

    @PostMapping("/addCountry")
    public ResponseEntity<Country> addCountry(@RequestBody @Valid Countrydto ctd)
    {
        return new ResponseEntity<Country>(cs.addCountry(ctd), HttpStatus.CREATED);
    }
    @GetMapping("/getcountry/{countryname}")
    public ResponseEntity<Country> getCountry(@PathVariable String countryname)
    {
        return new ResponseEntity<Country>(cs.getCountry(countryname), HttpStatus.OK);
    }
    @GetMapping("/getCountrygdp")
    public ResponseEntity<List<Country>> getCountryGDP()
    {
        return new ResponseEntity<List<Country>>(cs.getCountryGDP(), HttpStatus.OK);
    }

    @PutMapping("/updateCountry/{countryname}")
    public ResponseEntity<Country> updatecurrencytousdollers(@PathVariable String countryname,@RequestBody String dollars){
        return new ResponseEntity<Country>(cs.updateCountry(countryname,dollars), HttpStatus.OK);
    }
    @DeleteMapping("/deleteCountry/{countryname}")
    public ResponseEntity<Void> deleteCountryByName(@PathVariable String countryname) {
        cs.deleteCountryByName(countryname);
        return ResponseEntity.noContent().build();
    }


}
