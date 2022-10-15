package com.usa.misiontic.masterclass3.controller;

import com.usa.misiontic.masterclass3.entities.Farm;
import com.usa.misiontic.masterclass3.service.FarmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/Farm")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @GetMapping("/all")
    public List<Farm> getAll(){
        return farmService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Farm save(@RequestBody  Farm c){
        return farmService.save(c);
    }
}
