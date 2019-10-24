package com.example.hw06;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayMyProfile extends Fragment {

    private MyProfile.OnFragmentInteractionListener mListener;

    public DisplayMyProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("demo","DisplayMyProfile: onCreateView");
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_display_my_profile, container, false);
        //define content below using view.findById
        view.findViewById(R.id.btn_edit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.gotoMyProfileFragment();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("demo","DisplayMyProfile: onResume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("demo","DisplayMyProfile: onCreate");
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        Log.d("demo","DisplayMyProfile: onAttach");
        try {
            mListener = (MyProfile.OnFragmentInteractionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("demo","DisplayMyProfile: onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("demo","DisplayMyProfile: onStart");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("demo","DisplayMyProfile: onDestroy");

    }


}

