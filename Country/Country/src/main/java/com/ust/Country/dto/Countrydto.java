package com.ust.Country.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Countrydto {

    @NotNull(message = "country name cant be null")
    @NotEmpty(message="country name cant be empty")
    public String countryname;
    public String capital;
    public String population;
    public String currency;
    public String gdp;
    public String currencyvalueusdollers ;
}
