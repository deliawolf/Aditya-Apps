package com.example.adityaapps.model;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
public class GalleryModel {
    private int picture;
    private String picTitle;

    public int getPicture() {
        return picture;
    }

    public GalleryModel() {
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getPicTitle() {
        return picTitle;
    }

    public void setPicTitle(String picTitle) {
        this.picTitle = picTitle;
    }
}
