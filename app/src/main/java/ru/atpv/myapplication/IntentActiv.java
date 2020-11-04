package ru.atpv.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActiv extends AppCompatActivity {
    private static final String emailString = "emailString";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_active);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.emailString);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewEmail.setText(message);

    }
}
