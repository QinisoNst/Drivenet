package com.drivenet.rsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.drivenet.rsa.fragments.welcomeFragment;
import com.drivenet.rsa.profile.Profile;

import com.drivenet.rsa.homefragments.HomeFragment1;
import com.drivenet.rsa.search.Search;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";

    public static FragmentManager fragmentManager;
    private static BottomNavigationView bottomNav;
    private static Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace
                    (
                            R.id.fragment_container, new welcomeFragment()
                    ).commit();
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus)
            {

            }
        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public static void hideBottomNav()
    {
        bottomNav.setVisibility(View.GONE);
    }
    public void showBottomNav()
    {
        bottomNav.setVisibility(View.VISIBLE);
    }

    public static void hidetoolbar()
    {
        toolbar.setVisibility(View.GONE);
    }
    public void showtoolbar()
    {
        toolbar.setVisibility(View.VISIBLE);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener()
            {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId())
                    {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment1();
                            break;
                        case R.id.nav_settings:
                            selectedFragment = new SettingFragment();
                            break;
                        case R.id.nav_user:
                            selectedFragment = new Profile();
                            break;
                        case R.id.nav_Search:
                            selectedFragment = new Search();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).replace(R.id.fragment_container, selectedFragment).addToBackStack(null).commit();
                    return true;
                }
            };


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
   }
