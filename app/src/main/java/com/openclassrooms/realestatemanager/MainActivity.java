package com.openclassrooms.realestatemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;
    private TextView textViewQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crash n° 1 caused by : an item from another layout referenced here
        //activity_second_activity_text_view_main only exists in the layout for the second activity
        //fixed by : changing the text view reference according to the corresponding view
        this.textViewMain = findViewById(R.id.activity_main_activity_text_view_main);
        //ORIGINAL LINE
        //this.textViewMain = findViewById(R.id.activity_second_activity_text_view_main);
        this.textViewQuantity = findViewById(R.id.activity_main_activity_text_view_quantity);

        this.configureTextViewMain();
        this.configureTextViewQuantity();
    }

    private void configureTextViewMain() {
        //CRASH N°1
        this.textViewMain.setTextSize(15);
        this.textViewMain.setText("Le premier bien immobilier enregistré vaut ");
    }

    private void configureTextViewQuantity() {

        //crash n° 2 caused by a resource not found
        //when using an int for a setText, it refers to resource id
        //fixed by : converting our variable to string by adding ""
        String quantity = Utils.convertDollarToEuro(100) + "";
        //ORIGINAL LINE
        //int quantity = Utils.convertDollarToEuro(100);
        this.textViewQuantity.setTextSize(20);
        //CRASH N°2
        this.textViewQuantity.setText(quantity);
    }
}
