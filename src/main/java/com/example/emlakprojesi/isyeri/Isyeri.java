package com.example.emlakprojesi.isyeri;

import javax.persistence.*;

@Entity(name = "isyeri")
@Table
public class Isyeri {
    @Id
    @SequenceGenerator(name="isyeri_sequence", sequenceName="isyeri_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "isyeri_sequence")
    private Long id;

    @Column(name ="adi", nullable = false,columnDefinition = "TEXT")
    private String adi;
    @Column(name ="adres", nullable = false,columnDefinition = "TEXT")
    private String adres;
    @Column(name ="telefon", nullable = false,columnDefinition = "TEXT")

    private  String telefon;

}
