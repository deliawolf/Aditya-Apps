package com.example.adityaapps.presenter;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
import com.example.adityaapps.R;
import com.example.adityaapps.model.FriendActivity;
import com.example.adityaapps.views.FriendView;

import java.util.ArrayList;
import java.util.List;

public class FriendPresenterImpl implements FriendPresenter{

    private FriendView friendView;

    private List<FriendActivity> picture = new ArrayList<>();
    public FriendPresenterImpl(FriendView friendView){
        this.friendView = friendView;
        setData();
    }

    private void setData() {
        FriendActivity image = new FriendActivity();
        image.setImage(R.drawable.id_kur);
        image.setTitle("Kurniawan");
        picture.add(image);
        FriendActivity image2 = new FriendActivity();
        image2.setImage(R.drawable.ic_anjas);
        image2.setTitle("Anjas");
        picture.add(image2);
        FriendActivity image3 = new FriendActivity();
        image3.setImage(R.drawable.ic_anggi);
        image3.setTitle("Anggi");
        picture.add(image3);
        FriendActivity image4 = new FriendActivity();
        image4.setImage(R.drawable.ic_aldino);
        image4.setTitle("Aldino");
        picture.add(image4);
        FriendActivity image5 = new FriendActivity();
        image5.setImage(R.drawable.ic_fajar);
        image5.setTitle("Fajar");
        picture.add(image5);
    }

    @Override
    public void load() {
        friendView.onLoad(picture);

    }
}
