package com.example.emlakprojesi.isyeri;

import org.springframework.beans.factory.annotation.Autowired;

public class IsyeriService {

    @Autowired
    private IsyeriRepository isletmeRepository;

    public Isyeri createIsletme(Isyeri isletme) {
        return isletmeRepository.save(isletme);
    }

    public Isyeri getIsletmeById(Long id) {
        return isletmeRepository.findById(id).orElse(null);
    }

}
