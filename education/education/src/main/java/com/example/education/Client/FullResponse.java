package com.example.education.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public String university;
    public String countryname;

    public String worldranking;
    public String placementrecord;
    public int fees;
    public double acceptancerate;
    public String courses;
    public Country country;
}
