package ru.atpv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String emailString = "emailString";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next(View view) {
        Intent intent = new Intent(this, IntentActiv.class);
        TextView textEmail = (TextView) findViewById(R.id.textEmail);
        String emailmessage = textEmail.getText().toString();
        intent.putExtra(emailString, emailmessage);
        System.out.println(emailmessage);
        startActivity(intent);
    }
}