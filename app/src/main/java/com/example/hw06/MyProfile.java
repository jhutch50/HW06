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
public class MyProfile extends Fragment {

    private OnFragmentInteractionListener mListener;

    public MyProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("demo","MyProfile: onCreateView");

        View view = inflater.inflate(R.layout.fragment_my_profile, container, false);

        //define content below using view.findById
        view.findViewById(R.id.iv_my_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.gotoSelectAvatarFragment();
            }
        });

        view.findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.gotoDisplayMyProfileFragment();
            }
        });



        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("demo","MyProfile: onResume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("demo","MyProfile: onCreate");
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        Log.d("demo","MyProfile: onAttach");
        try {
            mListener = (OnFragmentInteractionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("demo","MyProfile: onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("demo","MyProfile: onStart");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("demo","MyProfile: onDestroy");

    }

    public interface OnFragmentInteractionListener{
        public void gotoSelectAvatarFragment();
        public void gotoDisplayMyProfileFragment();
        public void gotoMyProfileFragment();
    }


}
