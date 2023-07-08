package com.drivenet.rsa.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;


import com.drivenet.rsa.ui.login.welcomelogin;

public class welcomeFragment extends Fragment
{
    private static int TIMEOUT =1000;

    private MainActivity mainActivity = new MainActivity();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_maina, container, false);
        updateDetail();
        return view;
    }
    public void updateDetail() {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                MainActivity.fragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).replace(R.id.fragment_container, new welcomelogin()).commit();
            }
        },TIMEOUT);
    }
    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
        requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
        requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}