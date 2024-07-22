package com.example.education.Figen;

import com.example.education.Client.Country;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Component
@FeignClient(name="Country",url = "http://localhost:9091/country")

public interface  FigenClient {

    @GetMapping("/getcountry/{countryname}")
    public  Country getCountry(@PathVariable String countryname);
}