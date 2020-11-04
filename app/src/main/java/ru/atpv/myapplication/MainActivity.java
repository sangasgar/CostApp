package ru.atpv.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String STATUSAPP = MainActivity.class.getCanonicalName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast.show();
        Log.d(STATUSAPP, "onCreate");


    }

    public void Next(View view) {
        Toast toast = Toast.makeText(this, "onNext", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(STATUSAPP, "onNext");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this, "onResume", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(STATUSAPP, "onResume");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(STATUSAPP, "onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(this, "onPause", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(STATUSAPP, "onPause");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Toast toast = Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(STATUSAPP, "onSaveInstanceState");
    }

    public void Enter(View view) {
        Storage ms = Storage.Singleton();
        int info = ms.getOtherCost();
        System.out.println(info);
        Intent intent = new Intent(this, IntentActiv.class);
        TextView textCost = (TextView) findViewById(R.id.dayCost);
        CheckBox checkProduct = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox checkPetrol= (CheckBox) findViewById(R.id.checkBox6);
        CheckBox checkOther = (CheckBox) findViewById(R.id.checkBox7);


        try {
            int message = Integer.parseInt(textCost.getText().toString());
            if (checkProduct.isChecked()) {
                ms.INSTANCE.setProductCost(message);
            } else if (checkPetrol.isChecked()) {
                ms.INSTANCE.setPetrolCost(message);
            } else if (checkOther.isChecked()) {
                ms.INSTANCE.setOtherCost(message);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        startActivity(intent);
    }
}