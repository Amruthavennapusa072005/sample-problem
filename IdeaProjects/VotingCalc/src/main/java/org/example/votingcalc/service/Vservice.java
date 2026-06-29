package org.example.votingcalc.service;

import org.example.votingcalc.Repo.VRepo;
import org.example.votingcalc.entity.Ventity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Vservice {

    @Autowired
    private VRepo repo;

    public Ventity storeData(Ventity v)
    {
        if(v.getAge()>=18)
        {
            v.setEligible(true);
        }
        return repo.save(v);
    }

}
