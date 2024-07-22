package com.example.education.Service;

import com.example.education.Client.Country;
import com.example.education.Client.FullResponse;
import com.example.education.Figen.FigenClient;
import com.example.education.Model.EduUni;
import com.example.education.Repository.EduRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EduService {
    @Autowired
   public EduRepo er;

    @Autowired
    public FigenClient f;


    public EduUni addDetails(EduUni ed)
    {
        return er.save(ed);
    }

    public List<EduUni> getTop10Universities() {

        return er.findByOrderByWorldrankingDesc();
    }

    public List<EduUni> getTop10AccpetanceRate() {
        return er.findAllByOrderByAcceptancerateDesc();
    }

    public ArrayList<FullResponse> getAllDetails(String countryname)
    {
        ArrayList<FullResponse> ff = new ArrayList<>();
        List<EduUni> unis = (List<EduUni>) er.findByCountryname(countryname); // Assuming findByCountryname returns a List<EduUni>
        Country country = f.getCountry(countryname); // Assuming getCountry returns a Country object

        for (EduUni uni : unis) {
            FullResponse fr = new FullResponse();
            fr.setUniversity(uni.getUniversity());
            fr.setCountryname(uni.getCountryname());
            fr.setWorldranking(uni.getWorldranking());
            fr.setPlacementrecord(uni.getPlacementrecord());
            fr.setFees(uni.getFees());
            fr.setAcceptancerate(uni.getAcceptancerate());
            fr.setCourses(uni.getCourses());
            fr.setCountry(country);
            ff.add(fr);
        }

        return ff;

    }

    public EduUni getUniName(String universityname) {
        return er.findById(universityname).orElse(null);
    }
}
