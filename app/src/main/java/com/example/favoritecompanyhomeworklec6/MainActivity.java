package com.example.favoritecompanyhomeworklec6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.favoritecompanyhomeworklec6.models.Drinks;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Drinks> drinks;

    Button btnCokeAbout;
    Button btnPepsiAbout;
    Button btnSchweppesAbout;
    Button btnDrPepperAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupData();

        findViews();
        setListeners();


        // Find the recycleView
        RecyclerView recyclerView = findViewById(R.id.recycleView);

        // Create my Adapter...
        DrinksAdapter adapter = new DrinksAdapter(drinks);
        recyclerView.setAdapter(adapter);
        // set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void findViews() {
        btnCokeAbout = findViewById(R.id.btn_about_coke);
        btnPepsiAbout = findViewById(R.id.btn_about_pepsi);
        btnSchweppesAbout = findViewById(R.id.btn_about_schweppes);
        btnDrPepperAbout = findViewById(R.id.btn_about_dr_pepper);

    }


    private void setListeners() {
        btnCokeAbout.setOnClickListener(v -> {

            Intent intent = new Intent(this, ResultActivityCoke.class);
            startActivity(intent);
        });
        btnPepsiAbout.setOnClickListener(v -> {

            Intent intent = new Intent(this, ResultActivityPepsi.class);
            startActivity(intent);
        });
        btnSchweppesAbout.setOnClickListener(v -> {

            Intent intent = new Intent(this, ResultActivitySchweppes.class);
            startActivity(intent);
        });
        btnDrPepperAbout.setOnClickListener(v -> {

            Intent intent = new Intent(this, ResultActivityDrPepper.class);
            startActivity(intent);
        });

    }


    private void setupData() {
        drinks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Drinks drink = new Drinks("coke", "pepsi", "schweppes", "drPepper");
            drinks.add(drink);

        }
    }
}