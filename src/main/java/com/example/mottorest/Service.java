package com.example.mottorest;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repositories repositories;
    @Autowired
    public Service(Repositories repositories){
        this.repositories=repositories;
    }
    public List<Mott> getMott(){
        return repositories.findAll();
    }
    public void addMott(Mott mott){
        repositories.save(mott);
    }




}
