package com.example.mottorest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="cytaty")
public class Controller {
    private final Service service;
    @Autowired
    public Controller(Service service){
        this.service = service;
    }
    @GetMapping
    public List<Mott> getMott(){
        return service.getMott();
    }
    @PostMapping
    public void addMott(@RequestBody Mott mott){
        service.addMott(mott);
    }





}
