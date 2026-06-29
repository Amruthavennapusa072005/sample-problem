package org.example.student.Service;


import org.example.student.entity.Sentity;
import org.example.student.repo.Srepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class Sservice {

        @Autowired
        private Srepo repo;

        public Sentity storeData(Sentity s)
        {
            if(s.getAge()>0)
            {
                return repo.save(s);
            }
            return null;
        }
        public List<Sentity> getAll()
        {
            return repo.findAll();
        }
    }



