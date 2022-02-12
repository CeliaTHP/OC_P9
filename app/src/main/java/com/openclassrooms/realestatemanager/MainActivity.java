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


        //references a item from another layout not declared
        //activity_second_activity_text_view_main is refered in the layout for the second activity
        this.textViewMain = findViewById(R.id.activity_main_activity_text_view_main);
        //ORIGINAL LINE
        //this.textViewMain = findViewById(R.id.activity_second_activity_text_view_main);

        this.textViewQuantity = findViewById(R.id.activity_main_activity_text_view_quantity);

        this.configureTextViewMain();
        this.configureTextViewQuantity();
    }

    private void configureTextViewMain(){
        //crash here
        this.textViewMain.setTextSize(15);
        this.textViewMain.setText("Le premier bien immobilier enregistré vaut ");
    }

    private void configureTextViewQuantity(){
        //also crashes here
        //ORIGINAL LINE
        //int quantity = Utils.convertDollarToEuro(100);
        String quantity = Utils.convertDollarToEuro(100)+ "";
        this.textViewQuantity.setTextSize(20);
        this.textViewQuantity.setText(quantity);
    }
}
