package com.gymtic.gymsedesms.controllers;

import com.gymtic.gymsedesms.exceptions.CampusNotFoundException;
import com.gymtic.gymsedesms.models.Campus;
import com.gymtic.gymsedesms.repositories.CampusRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CampusController {
 private final CampusRepository campusRepository;

    public CampusController(CampusRepository campusRepository) {
        this.campusRepository = campusRepository;
    }
    @GetMapping("/campus/{name}")
    Campus getCampus(@PathVariable String name){
        return campusRepository.findById(name)
                .orElseThrow(()->new CampusNotFoundException("no se Encontro una sede llamada"
                        +name));

    }
    @PostMapping("/campus")
    Campus newCampus(@RequestBody Campus campus){
        return campusRepository.save(campus);
    }
}
