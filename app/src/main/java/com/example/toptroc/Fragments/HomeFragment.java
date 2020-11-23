package com.example.toptroc.Fragments;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toptroc.LoginActivity;
import com.example.toptroc.ObjectDepositActivity;
import com.example.toptroc.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.material.navigation.NavigationView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    DrawerLayout drawerLayout;
    ImageView navigationBar;
    NavigationView navigationView;
    private View view;
    private RelativeLayout LoginSignUp,Ad,Search,Selection,Contact;
    TextView Historical,FeedBack,FAQ;
    ImageView imageViewDeposit;
    SearchView searchViewObject;
    ImageButton imageButtonLocation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        imageViewDeposit = (ImageView) view.findViewById(R.id.imageViewDeposit);
        imageViewDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ObjectDepositActivity.class);
                startActivity(intent);
            }
        });

        searchViewObject = (SearchView) view.findViewById(R.id.searchViewObject);
        searchViewObject.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        imageButtonLocation = (ImageButton) view.findViewById(R.id.imageButtonLocation);
        imageButtonLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Localisation",Toast.LENGTH_SHORT).show();
            }
        });

        onSetNavigationDrawerEvents();
        return view;
    }
    private void onSetNavigationDrawerEvents() {
        drawerLayout = (DrawerLayout) view.findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) view.findViewById(R.id.navigationView);
        navigationBar = (ImageView) view.findViewById(R.id.navigationBar);

        LoginSignUp = (RelativeLayout) view.findViewById(R.id.relativeLayoutLoginSignUp);
        Ad = (RelativeLayout) view.findViewById(R.id.relativeLayoutAd);
        Search = (RelativeLayout) view.findViewById(R.id.relativeLayoutSearch);
        Selection = (RelativeLayout) view.findViewById(R.id.relativeLayoutSelection);
        Contact = (RelativeLayout) view.findViewById(R.id.relativeLayoutContact);

        Historical = (TextView) view.findViewById(R.id.historical);
        FeedBack = (TextView) view.findViewById(R.id.feedback);
        FAQ = (TextView) view.findViewById(R.id.FAQ);

        navigationBar.setOnClickListener(this);

        LoginSignUp.setOnClickListener(this);
        Ad.setOnClickListener(this);
        Search.setOnClickListener(this);
        Selection.setOnClickListener(this);
        Contact.setOnClickListener(this);

        Historical.setOnClickListener(this);
        FeedBack.setOnClickListener(this);
        FAQ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Fragment selectedFragment = null;
        switch (v.getId()){
            case R.id.navigationBar:
                drawerLayout.openDrawer(navigationView, true);
                break;
            case R.id.relativeLayoutLoginSignUp:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.relativeLayoutAd:
                Toast.makeText(getContext(),"Annonces",Toast.LENGTH_SHORT).show();
                break;
            case R.id.relativeLayoutSearch:
                Toast.makeText(getContext(),"Recherche",Toast.LENGTH_SHORT).show();
                break;
            case R.id.relativeLayoutSelection:
                Toast.makeText(getContext(),"Ma sélecion",Toast.LENGTH_SHORT).show();
                break;
            case R.id.relativeLayoutContact:
                Toast.makeText(getContext(),"Contact",Toast.LENGTH_SHORT).show();
                break;
            case R.id.historical:
                Toast.makeText(getContext(),"Historique de TopTroc",Toast.LENGTH_SHORT).show();
                break;
            case R.id.feedback:
                Toast.makeText(getContext(),"Feedback",Toast.LENGTH_SHORT).show();
                break;
            case R.id.FAQ:
                Toast.makeText(getContext(),"FAQ",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}