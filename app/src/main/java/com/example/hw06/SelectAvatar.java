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
public class SelectAvatar extends Fragment {

    private MyProfile.OnFragmentInteractionListener mListener;
    public SelectAvatar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("demo","SelectedAvatar: onCreateView");

        View view = inflater.inflate(R.layout.fragment_select_avatar, container, false);
        //define content below using view.findById
        //TEMPORARY LOGIC: replace selected_image with the value of the image selected
        view.findViewById(R.id.iv_avatar_f_1).setOnClickListener(new View.OnClickListener() {
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
        Log.d("demo","SelectAvatar: onResume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("demo","SelectAvatar: onCreate");
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        Log.d("demo","SelectAvatar: onAttach");
        try {
            mListener = (MyProfile.OnFragmentInteractionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("demo","SelectAvatar: onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("demo","SelectAvatar: onStart");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("demo","SelectAvatar: onDestroy");

    }

}
