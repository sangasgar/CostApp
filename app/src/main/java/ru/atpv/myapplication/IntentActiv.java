package ru.atpv.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActiv extends AppCompatActivity {
    private static final String emailString = "emailString";
    private static final String valute = " руб." ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_active);
       Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.costString);
//       TextView textViewEmail = (TextView) findViewById(R.id.petrolLabel);
//        textViewEmail.setText(message);
        Storage st = Storage.Singleton();
        TextView infoProduct = (TextView) findViewById(R.id.infoProduct);
        TextView infoPetrol = (TextView) findViewById(R.id.infoPetrol);
        TextView infoOther = (TextView) findViewById(R.id.infoOther);
        String ms = String.valueOf(st.getProductCost());
        String ms1 = String.valueOf(st.getPetrolCost());
        String ms2 = String.valueOf(st.getOtherCost());
        infoProduct.setText(ms + valute);
        infoPetrol.setText(ms1 + valute);
        infoOther.setText(ms2 + valute);
    }


}
