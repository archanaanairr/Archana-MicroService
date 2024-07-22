package com.ust.Tourism.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class EduUni {


    public String university;
    public String countryname;

    public String worldranking;
    public String placementrecord;
    public int fees;
    public double acceptancerate;
    public String courses;

}
