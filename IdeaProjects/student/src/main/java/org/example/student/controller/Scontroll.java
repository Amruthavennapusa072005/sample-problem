package org.example.student.controller;


import org.example.student.Service.Sservice;
import org.example.student.entity.Sentity;
//import org.example.student.Service.Sservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    public class Scontroll {

        @Autowired
        private Sservice ser;

        @PostMapping("/add")
        public Sentity add(@RequestBody Sentity s)
        {
            return  ser.storeData(s);
        }
        @GetMapping("/getAll")
        public List< Sentity> getAll()
        {
            return ser.getAll();
        }
    }

