package com.ust.Country.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    @Id
    public String countryname;
    public String capital;
    public String population;
    public String currency;
    public String gdp;
    public String currencyvalueusdollers ;
}
