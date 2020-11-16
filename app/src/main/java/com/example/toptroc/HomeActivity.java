package com.example.toptroc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.toptroc.Fragments.HomeFragment;
import com.example.toptroc.Fragments.MessagesFragment;
import com.example.toptroc.Fragments.NotificationsFragment;
import com.example.toptroc.Fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    
    BottomNavigationView bottomNavigation;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Cacher la barre de statut //
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
        {
            Window w =getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigation);

        // Fragment par défaut //
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigation =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.home:
                            selectedFragment = new HomeFragment();
                            break;

                        case R.id.notifications:
                            selectedFragment = new NotificationsFragment();
                            break;

                        case R.id.messages:
                            selectedFragment = new MessagesFragment();
                            break;

                        case R.id.profile:
                            selectedFragment = new ProfileFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,
                            selectedFragment).commit();
                    return true;
                }
            };
}