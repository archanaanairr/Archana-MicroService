package com.ust.Tourism.Controller;

import com.ust.Tourism.Client.FullResponse;
import com.ust.Tourism.Model.TouristPlace;
import com.ust.Tourism.Service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourist")
    public class Controller {
    @Autowired
    TService s;

    @PostMapping("/add")
    public ResponseEntity<TouristPlace> add(@RequestBody TouristPlace place) {
        return new ResponseEntity<TouristPlace>(s.addTourist(place), HttpStatus.OK);
    }

    @GetMapping("/getbycountry/{country}")
    public ResponseEntity<List<FullResponse>> getTouristByCountry(@PathVariable String country) {
        return new ResponseEntity<List<FullResponse>>(s.getTouristbyCountry(country), HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<TouristPlace>> getAllTourist() {
        return new ResponseEntity<List<TouristPlace>>(s.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getSpots/{universityname}")
    public ResponseEntity<List<TouristPlace>> getTouristByUniversity(@PathVariable String universityname) {
        {
            return new ResponseEntity<List<TouristPlace>>(s.getTouristByUniversity(universityname), HttpStatus.OK);
        }
    }
}