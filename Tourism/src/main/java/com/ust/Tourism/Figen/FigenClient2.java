package com.ust.Tourism.Figen;

import com.ust.Tourism.Client.Country;
import com.ust.Tourism.Client.EduUni;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="education",url = "http://localhost:9089/education")
public interface FigenClient2 {
    @GetMapping("/getuni/{universityname}")
    public EduUni getUniversity(@PathVariable String universityname);

}
