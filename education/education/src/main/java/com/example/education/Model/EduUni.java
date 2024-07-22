package com.example.education.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="university")
public class EduUni {

    @Id
    public String university;
    public String countryname;

    public String worldranking;
    public String placementrecord;
    public int fees;
    public double acceptancerate;
    public String courses;

}
