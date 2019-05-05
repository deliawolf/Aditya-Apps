package com.example.adityaapps.presenter;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
import com.example.adityaapps.R;
import com.example.adityaapps.model.GalleryModel;
import com.example.adityaapps.views.GalleryView;

import java.util.ArrayList;
import java.util.List;

public class GalleryPresenterImpl implements GalleryPresenter {
    private GalleryView galleryView;

    private List<GalleryModel> pictures = new ArrayList<>();

    public GalleryPresenterImpl(GalleryView galleryView) {
        this.galleryView = galleryView;
        setData();
    }

    private void setData() {
        GalleryModel picture = new GalleryModel();
        picture.setPicture(R.drawable.gallery1);
        picture.setPicTitle("SMK Drama");
        pictures.add(picture);

        GalleryModel picture1 = new GalleryModel();
        picture1.setPicture(R.drawable.gallery2);
        picture1.setPicTitle("Pas SD");
        pictures.add(picture1);

        GalleryModel picture2 = new GalleryModel();
        picture2.setPicture(R.drawable.gallery3);
        picture2.setPicTitle("AMD Bandung");
        pictures.add(picture2);

        GalleryModel picture3 = new GalleryModel();
        picture3.setPicture(R.drawable.gallery4);
        picture3.setPicTitle("Event Wibu");
        pictures.add(picture3);

        GalleryModel picture4 = new GalleryModel();
        picture4.setPicture(R.drawable.gallery5);
        picture4.setPicTitle("Lomba Poster");
        pictures.add(picture4);

        GalleryModel picture5 = new GalleryModel();
        picture5.setPicture(R.drawable.gallery6);
        picture5.setPicTitle("Pramuka SMK");
        pictures.add(picture5);

        GalleryModel picture6 = new GalleryModel();
        picture6.setPicture(R.drawable.gallery7);
        picture6.setPicTitle("Event Wibu 2");
        pictures.add(picture6);

        GalleryModel picture7 = new GalleryModel();
        picture7.setPicture(R.drawable.gallery8);
        picture7.setPicTitle("Event Wiu 3");
        pictures.add(picture7);

        GalleryModel picture8 = new GalleryModel();
        picture8.setPicture(R.drawable.gallery9);
        picture8.setPicTitle("Event Nerd 1");
        pictures.add(picture8);

        GalleryModel picture9 = new GalleryModel();
        picture9.setPicture(R.drawable.gallery10);
        picture9.setPicTitle("Event Nerd 2");
        pictures.add(picture9);



    }

    @Override
    public void load() {
        galleryView.onLoad(pictures);
    }

}
