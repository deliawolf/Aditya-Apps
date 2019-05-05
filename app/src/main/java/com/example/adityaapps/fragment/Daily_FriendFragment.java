package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.example.adityaapps.adapter.FriendAdapter;
import com.example.adityaapps.model.FriendActivity;
import com.example.adityaapps.presenter.FriendPresenter;
import com.example.adityaapps.presenter.FriendPresenterImpl;
import com.example.adityaapps.views.FriendView;

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
public class Daily_FriendFragment extends Fragment implements FriendView {

    private View v;
    private RecyclerView recyclerFriendsList;
    private List<FriendActivity> pictures = new ArrayList<>();
    private FriendAdapter friendsAdapter;
    private FriendPresenter friendPresenter;
    private AppCompatDialog dialog;

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_daily__friend, container, false);

        friendPresenter = new FriendPresenterImpl(this);

        recyclerFriendsList = v.findViewById(R.id.recycler_friend);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6, GridLayoutManager.VERTICAL, false);
        recyclerFriendsList.setLayoutManager(gridLayoutManager);

        friendsAdapter = new FriendAdapter(pictures);

        recyclerFriendsList.setAdapter(friendsAdapter);
        friendPresenter.load();
        friendsAdapter.setOnCallbackListener(new FriendAdapter.OnCallbackListener(){
            @Override
            public void onClick(FriendActivity image) {
                showDialog(image);
            }
        });

        return v;
    }



    @Override
    public void onLoad(List<FriendActivity> image) {
        pictures.clear();
        pictures.addAll(image);

        friendsAdapter.notifyDataSetChanged();

    }
    public void showDialog(final FriendActivity image){
        dialog = new AppCompatDialog(getActivity());
        dialog.setContentView(R.layout.friend_list_activity);

        final ImageView imageViewPicture = dialog.findViewById(R.id.friends_picture_dialog_image_view);
        final TextView textViewTitle = dialog.findViewById(R.id.friends_name_dialog_text);

        assert imageViewPicture != null;
        imageViewPicture.setImageResource(image.getImage());
        assert textViewTitle !=null;
        textViewTitle.setText(image.getTitle());

        if (!dialog.isShowing()){
            dialog.show();
        }
    }
}
