package com.ust.Tourism.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TouristPlace {
    @Id
   public  String name;
   public String countryname;
   public String university;
   public double expenseinusd;


}
