package com.example.emlakprojesi.musteri;

import jakarta.annotation.Generated;

import javax.persistence.*;

@Entity(name = "musteri")
@Table(name ="musteri", uniqueConstraints = {
        @UniqueConstraint(name ="musteri_unique",columnNames = "email")
})
public class Musteri {

    @Id
    @SequenceGenerator(name="musteri_sequence", sequenceName="musteri_sequence",allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "musteri_sequence")
    private Long id;
    @Column(name ="adi", nullable = false,columnDefinition = "TEXT")
private String adi;
    @Column(name ="soyadi", nullable = false,columnDefinition = "TEXT")
private String soyadi;
    @Column(name ="cepNo", nullable = false,columnDefinition = "TEXT")
    private String cepNo;
    @Column(name ="eposta", nullable = false,columnDefinition = "TEXT")
    private  String eposta;


    public Musteri( String adi, String soyadi, String cepNo, String eposta) {

        this.adi = adi;
        this.soyadi = soyadi;
        this.cepNo = cepNo;
        this.eposta = eposta;
    }

    public Musteri() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getCepNo() {
        return cepNo;
    }

    public void setCepNo(String cepNo) {
        this.cepNo = cepNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", cepNo='" + cepNo + '\'' +
                ", eposta='" + eposta + '\'' +
                '}';
    }
}
