package com.example.emlakprojesi.emlak;

import com.example.emlakprojesi.isyeri.Isyeri;
import com.example.emlakprojesi.isyeri.IsyeriRepository;
import com.example.emlakprojesi.musteri.Musteri;
import com.example.emlakprojesi.musteri.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmlakService {
@Autowired
    private final EmlakRepository emlakRepository;
    @Autowired
    private IsyeriRepository isletmeRepository;

    @Autowired
    private MusteriRepository musteriRepository;
    @Autowired
    public EmlakService(EmlakRepository emlakRepository) {
        this.emlakRepository = emlakRepository;
    }


    public List<Emlak> getAllEmlak() {
        return emlakRepository.findAll();
    }


    public Emlak getEmlakById(Long id) {
        return emlakRepository.findById(id).orElse(null);
    }

    // Yeni bir emlak oluşturan metot
    public Emlak createEmlak(@RequestBody Emlak emlak) {
        return emlakRepository.save(emlak);
    }

    // Belirli bir emlakı güncelleyen metot
    public Emlak updateEmlak(Long id, Emlak emlakDetails) {
        Emlak emlak = emlakRepository.findById(id).orElse(null);
        if (emlak != null) {
            // Güncelleme işlemleri
            emlak.setEmlakBilgisi(emlakDetails.getEmlakBilgisi());
            emlak.setEmlakTuru(emlakDetails.getEmlakTuru());
            emlak.setKat(emlakDetails.getKat());
            emlak.setIsınmaTuru(emlakDetails.getIsınmaTuru());
            emlak.setMetrekare(emlakDetails.getMetrekare());
            emlak.setSiteAdi(emlakDetails.getSiteAdi());
            emlakDetails.setOdasayisi(emlakDetails.getOdasayisi());
        }
        return emlakRepository.save(emlak);
    }

    // Belirli bir emlakı silen metot
    public void deleteEmlak(Long id) {
        emlakRepository.deleteById(id);
    }

//Emlak işletmesinin kaydı alınır.
    public Isyeri createIsletme(Isyeri isletme) {
        return isletmeRepository.save(isletme);
    }
// bir müşteri kaydı alınır
    public Musteri createMusteri(Musteri musteri) {
        return musteriRepository.save(musteri);
    }


}

