package org.example.votingcalc.controller;

import org.example.votingcalc.entity.Ventity;
import org.example.votingcalc.service.Vservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vcontroll {
    @Autowired
    private Vservice ser;

    @PostMapping("/add")
    public Ventity add(@RequestBody Ventity v)
    {
        return ser.storeData(v);
    }

}
