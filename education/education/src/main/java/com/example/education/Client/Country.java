package com.example.education.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    public String countryname;
    public String capital;
    public String population;
    public String currency;
    public String gdp;
    public String currencyvalueusdollers ;


}
