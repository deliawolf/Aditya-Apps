package com.example.adityaapps.model;

public class DailyActivity {
    /*  Nama    : Aditya Mr
        NIM     : 10116068
        Kelas   : AKB2
        Tanggal pengerjaan  : 21 April 2019
        Updated             : 5 Mei 2019
     */
    private String Name;
    private String Kegiatan;
    private int Photo;

    public DailyActivity(String name, String kegiatan, int photo) {
        Name = name;
        Kegiatan = kegiatan;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getKegiatan() {
        return Kegiatan;
    }

    public int getPhoto() {
        return Photo;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setKegiatan(String kegiatan) {
        Kegiatan = kegiatan;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
