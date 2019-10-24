package com.example.hw06;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements  MyProfile.OnFragmentInteractionListener {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("demo", "MainActivity: onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("demo", "MainActivity: onCreate before inflating layout");
        setContentView(R.layout.activity_main);
        Log.d("demo", "MainActivity: onCreate after inflating layout");

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MyProfile(), "tag_myprofile")
                .commit();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("demo", "MainActivity: onDestroy");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("demo", "MainActivity: onResume");
    }


    @Override
    public void gotoSelectAvatarFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SelectAvatar(),"tag_selectavatar")
                .commit();
    }

    @Override
    public void gotoDisplayMyProfileFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DisplayMyProfile(),"tag_displaymyprofile")
                .commit();
    }

    @Override
    public void gotoMyProfileFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MyProfile(), "tag_myprofile")
                .commit();
    }

    @Override
    public void onBackPressed(){
        if(getSupportFragmentManager().getBackStackEntryCount() > 0){
            getSupportFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }
}
