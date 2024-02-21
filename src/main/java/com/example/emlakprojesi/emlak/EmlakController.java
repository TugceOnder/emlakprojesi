package com.example.emlakprojesi.emlak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emlak")
public class EmlakController {

    private final EmlakService emlakService;

    @Autowired
    public EmlakController(EmlakService emlakService) {
        this.emlakService = emlakService;
    }

    @GetMapping("/")
    public List<Emlak> getAllEmlak() {
        return emlakService.getAllEmlak();
    }

    @GetMapping("/{id}")
    public Emlak getEmlakById(@PathVariable Long id) {
        return emlakService.getEmlakById(id);
    }

    @PostMapping("/")
    public Emlak createEmlak(@RequestBody Emlak emlak) {
        return emlakService.createEmlak(emlak);
    }

    @PutMapping("/{id}")
    public Emlak updateEmlak(@PathVariable Long id, @RequestBody Emlak emlakDetails) {
        return emlakService.updateEmlak(id, emlakDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmlak(@PathVariable Long id) {
        emlakService.deleteEmlak(id);
    }

}

