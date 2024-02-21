package com.example.emlakprojesi.musteri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MusteriController {
    @Autowired
    private MusteriService musteriService;

    @GetMapping("/")
    public List<Musteri> getAllCustomers() {
        return musteriService.getAllCustomers();
    }
    @PostMapping("/")
    public Musteri createCustomer(@RequestBody Musteri customer) {
        return musteriService.createCustomer(customer);
    }

    @PutMapping("/{customerId}")
    public Musteri updateCustomer(@PathVariable Long customerId, @RequestBody Musteri customer) {
        return musteriService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        musteriService.deleteCustomer(customerId);
    }
}
