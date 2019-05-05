package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adityaapps.R;
import com.example.adityaapps.adapter.GalleryAdapter;
import com.example.adityaapps.model.GalleryModel;
import com.example.adityaapps.presenter.GalleryPresenter;
import com.example.adityaapps.presenter.GalleryPresenterImpl;
import com.example.adityaapps.views.GalleryView;

import java.util.ArrayList;
import java.util.List;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment implements GalleryView {

    private View v;
    private RecyclerView recyclerGallery;
    private List<GalleryModel> pictures = new ArrayList<>();
    private GalleryAdapter galleryAdapter;
    private GalleryPresenter galleryPresenter;
    private int numberOfColumns = 2;
    private AppCompatDialog dialog;


    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_gallery, container, false);

        galleryPresenter = new GalleryPresenterImpl(this);

        recyclerGallery = v.findViewById(R.id.recycler_view_gallery);
        recyclerGallery.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));

        galleryAdapter = new GalleryAdapter(pictures);

        recyclerGallery.setAdapter(galleryAdapter);

        galleryPresenter.load();

        galleryAdapter.setOnCallbackListener(new GalleryAdapter.OnCallbackListener() {
            @Override
            public void onClick(GalleryModel picture) {
                showDialog(picture);
            }
        });

        return v;

    }
    @Override
    public void onLoad(List<GalleryModel> picture) {
        pictures.clear();
        pictures.addAll(picture);

        galleryAdapter.notifyDataSetChanged();
    }
    public void showDialog(final GalleryModel picture) {
        dialog = new AppCompatDialog(getActivity());
        dialog.setContentView(R.layout.gallery_fragment_activity);

        final ImageView imageViewPicture = dialog.findViewById(R.id.picture_dialog_image_view);
        final TextView textViewPicTitle = dialog.findViewById(R.id.title_dialog_text);

        assert imageViewPicture != null;
        imageViewPicture.setImageResource(picture.getPicture());
        assert textViewPicTitle != null;
        textViewPicTitle.setText(picture.getPicTitle());

        if (!dialog.isShowing()) {
            dialog.show();
        }

    }

}
