package com.example.education.Controller;

import com.example.education.Client.FullResponse;
import com.example.education.Model.EduUni;
import com.example.education.Repository.EduRepo;
import com.example.education.Service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/education")
public class Controller {
    @Autowired
    EduService service;

    @PostMapping("/adddetails")
    public ResponseEntity<EduUni> addDetails(EduUni details)
    {
        return new ResponseEntity<EduUni>(service.addDetails(details), HttpStatus.CREATED);
    }
    @GetMapping("/top10")
    public ResponseEntity<List<EduUni>> getTop10Universities()
    {
        return new ResponseEntity<List<EduUni>>(service.getTop10Universities(), HttpStatus.OK);
    }
    @GetMapping("/accpetancerate")
    public ResponseEntity<List<EduUni>> getTop10AccpetanceRate()
    {
        return new ResponseEntity<List<EduUni>>(service.getTop10AccpetanceRate(), HttpStatus.OK);
    }
    @GetMapping("/completeinfo/{countryname}")
    public ResponseEntity<ArrayList<FullResponse>>getAllDetails(@PathVariable String countryname)
    {
        return new ResponseEntity <ArrayList<FullResponse>>(service.getAllDetails(countryname), HttpStatus.OK);
    }
    @GetMapping("/getuni/{universityname}")
    public ResponseEntity<EduUni> getUniversity(@PathVariable String universityname)
    {
        return new ResponseEntity<EduUni>(service.getUniName(universityname), HttpStatus.OK);
    }
}
