package com.example.toptroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.toptroc.Adaptaters.ObjectAdaptater;
import com.example.toptroc.Models.ObjectModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ObjectModel> objectModelList;
    private ObjectAdaptater objectAdaptater;
    private LinearLayout linearLayoutConnexion;
    private LinearLayout linearLayoutInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Couleur de la barre de statut
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        linearLayoutConnexion = (LinearLayout) findViewById(R.id.linearLayoutConnexion);
        linearLayoutInscription = (LinearLayout) findViewById(R.id.linearLayoutInscription);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setKeepScreenOn(true);
        recyclerView.setHasFixedSize(true);

        objectModelList = new ArrayList<>();
        objectModelList.add(new ObjectModel(R.drawable.maintroc));

        objectAdaptater = new ObjectAdaptater(objectModelList,this);
        recyclerView.setAdapter(objectAdaptater);
        objectAdaptater.notifyDataSetChanged();

        // autoScrool();

        //Passage au formulaire d'authentification//
        linearLayoutConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        //Passage au formulaire d'inscription//
        linearLayoutInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
    // Méthode de Défilement des images //
    public void autoScrool(){
        final int speeScroll = 0;
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            @Override
            public void run() {
                if (count == objectAdaptater.getItemCount())
                    count=0;
                if (count < objectAdaptater.getItemCount())
                {
                    recyclerView.smoothScrollToPosition(++count);
                    handler.postDelayed(this,speeScroll);
                }
            }
        };
        handler.postDelayed(runnable,speeScroll);
    }

    public void goToHomePage(View view) {
        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}