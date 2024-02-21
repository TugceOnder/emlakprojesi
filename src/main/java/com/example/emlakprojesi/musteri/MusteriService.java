package com.example.emlakprojesi.musteri;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusteriService    {

    @Autowired
    private MusteriRepository musteriRepository;

    public List<Musteri> getAllCustomers() {
        return musteriRepository.findAll();
    }

    public Musteri getCustomerById(Long id) {
        return musteriRepository.findById(id).orElse(null);
    }

    public Musteri createCustomer(Musteri customer) {
        return musteriRepository.save(customer);
    }

    public Musteri updateCustomer(Long id, Musteri customerDetails) {
        Musteri customer = musteriRepository.findById(id).orElse(null);
        if (customer != null) {
            // Güncelleme işlemleri yapılır
            customer.setAdi(customerDetails.getAdi());
            customer.setSoyadi(customerDetails.getSoyadi());
            customer.setEposta(customerDetails.getEposta());
            customer.setCepNo(customerDetails.getCepNo());
            // Diğer alanlar da güncellenir...
            return musteriRepository.save(customer);
        }
        return null;
    }

    public void deleteCustomer(Long id) {
        musteriRepository.deleteById(id);
    }

}
