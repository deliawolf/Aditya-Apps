package com.example.adityaapps.model;

public class DailyActivity {

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
