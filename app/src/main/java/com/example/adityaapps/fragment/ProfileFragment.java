package com.example.adityaapps.fragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.adityaapps.R;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends DialogFragment {
    TextView t2;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        Button btnshowdialog=(Button) v.findViewById(R.id.showDialogBT);
        btnshowdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.adityaapps.fragment.DialogFragment simpleDialogFragment = new com.example.adityaapps.fragment.DialogFragment();
                ((DialogFragment) simpleDialogFragment).setCancelable(false);
                simpleDialogFragment.show(getFragmentManager(),"Simple dialog");
            }
        });
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView t2 = getView().findViewById(R.id.txt10);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
