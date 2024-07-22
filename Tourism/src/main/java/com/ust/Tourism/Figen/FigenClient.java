package com.ust.Tourism.Figen;

import com.ust.Tourism.Client.Country;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="Country",url = "http://localhost:9091/country")
public interface FigenClient {

    @GetMapping("/getcountry/{countryname}")
    public Country getCountry(@PathVariable String countryname);
}
