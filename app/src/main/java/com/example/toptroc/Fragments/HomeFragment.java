package com.example.toptroc.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toptroc.ObjectDepositActivity;
import com.example.toptroc.R;
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
    private TextView Historical,FeedBack,Playstore;
    ImageView imageViewDeposit;

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
        Playstore = (TextView) view.findViewById(R.id.playstore);

        navigationBar.setOnClickListener(this);

        LoginSignUp.setOnClickListener(this);
        Ad.setOnClickListener(this);
        Search.setOnClickListener(this);
        Selection.setOnClickListener(this);
        Contact.setOnClickListener(this);

        Historical.setOnClickListener(this);
        FeedBack.setOnClickListener(this);
        Playstore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.navigationBar:
                drawerLayout.openDrawer(navigationView, true);
                break;
            case R.id.relativeLayoutLoginSignUp:
                Toast.makeText(getContext(),"Connexion ou Inscripition",Toast.LENGTH_SHORT).show();
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
            case R.id.playstore:
                Toast.makeText(getContext(),"Playstore",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}