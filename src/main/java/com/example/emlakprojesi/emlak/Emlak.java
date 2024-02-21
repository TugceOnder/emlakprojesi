package com.example.emlakprojesi.emlak;

import javax.persistence.*;

@Entity(name = "emlak")
@Table
public class Emlak {
    @Id
    @SequenceGenerator(name="emlak_sequence", sequenceName="emlak_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emlak_sequence")
    private Long id;
    @Column(name ="emlakBilgisi", nullable = false,columnDefinition = "TEXT")
    private String emlakBilgisi;
    @Column(name ="emlakTuru", nullable = false,columnDefinition = "TEXT")
     private String emlakTuru;

    @Column(name ="metrekare", nullable = false,columnDefinition = "NUMBER")
     private double metrekare;

    @Column(name ="odasayisi", nullable = false,columnDefinition = "TEXT")
    private String odasayisi;
    @Column(name ="kat", nullable = false,columnDefinition = "TEXT")
      private String kat;
    @Column(name ="ısınmaTuru", nullable = false,columnDefinition = "TEXT")
      private String ısınmaTuru;
    @Column(name ="Balkon", nullable = false,columnDefinition = "BOOLEAN")
private boolean Balkon;
    @Column(name ="siteIcersinde", nullable = false,columnDefinition = "BOOLEAN")
private boolean siteIcersinde;
    @Column(name ="esyali", nullable = false,columnDefinition = "BOOLEAN")
    private boolean esyali;
    @Column(name ="siteAdi", nullable = false,columnDefinition = "TEXT")
private  String siteAdi;

    public Emlak() {
    }

    public Emlak(String emlakBilgisi, String emlakTuru, double metrekare, String  odasayisi, String kat, String ısınmaTuru, boolean balkon, boolean siteIcersinde, boolean esyali, String siteAdi) {
        this.emlakBilgisi = emlakBilgisi;
        this.emlakTuru = emlakTuru;
        this.metrekare = metrekare;
        this.odasayisi = odasayisi;
        this.kat = kat;
        this.ısınmaTuru = ısınmaTuru;
        Balkon = balkon;
        this.siteIcersinde = siteIcersinde;
        this.esyali = esyali;
        this.siteAdi = siteAdi;
    }

    @Override
    public String toString() {
        return "Emlak{" +
                "id=" + id +
                ", emlakBilgisi='" + emlakBilgisi + '\'' +
                ", emlakTuru='" + emlakTuru + '\'' +
                ", metrekare=" + metrekare +
                ", odasayisi=" + odasayisi +
                ", kat='" + kat + '\'' +
                ", ısınmaTuru='" + ısınmaTuru + '\'' +
                ", Balkon=" + Balkon +
                ", siteIcersinde=" + siteIcersinde +
                ", esyali=" + esyali +
                ", siteAdi='" + siteAdi + '\'' +
                '}';
    }

    public String getEmlakBilgisi() {
        return emlakBilgisi;
    }

    public void setEmlakBilgisi(String emlakBilgisi) {
        this.emlakBilgisi = emlakBilgisi;
    }

    public String getEmlakTuru() {
        return emlakTuru;
    }

    public void setEmlakTuru(String emlakTuru) {
        this.emlakTuru = emlakTuru;
    }

    public double getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(double metrekare) {
        this.metrekare = metrekare;
    }

    public String getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(String odasayisi) {
        this.odasayisi = odasayisi;
    }

    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }

    public String getIsınmaTuru() {
        return ısınmaTuru;
    }

    public void setIsınmaTuru(String ısınmaTuru) {
        this.ısınmaTuru = ısınmaTuru;
    }

    public boolean isBalkon() {
        return Balkon;
    }

    public void setBalkon(boolean balkon) {
        Balkon = balkon;
    }

    public boolean isSiteIcersinde() {
        return siteIcersinde;
    }

    public void setSiteIcersinde(boolean siteIcersinde) {
        this.siteIcersinde = siteIcersinde;
    }

    public boolean isEsyali() {
        return esyali;
    }

    public void setEsyali(boolean esyali) {
        this.esyali = esyali;
    }

    public String getSiteAdi() {
        return siteAdi;
    }

    public void setSiteAdi(String siteAdi) {
        this.siteAdi = siteAdi;
    }
}
