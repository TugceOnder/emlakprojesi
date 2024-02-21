package com.example.emlakprojesi.isyeri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class IsyeriController {

    @Autowired
    private IsyeriService isletmeService;

    @PostMapping("/create")
    public ResponseEntity<?> createIsletme(@RequestBody Isyeri isletme) {
        Isyeri createdIsletme = isletmeService.createIsletme(isletme);
        return new ResponseEntity<>(createdIsletme, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getIsletmeById(@PathVariable Long id) {
        Isyeri isletme = isletmeService.getIsletmeById(id);
        if (isletme != null) {
            return new ResponseEntity<>(isletme, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Isletme not found", HttpStatus.NOT_FOUND);
        }
    }
}
