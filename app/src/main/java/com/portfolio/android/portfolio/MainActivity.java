package com.portfolio.android.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMovies(View view) {
        //Send Movies
        Toast.makeText(this, "This will launch Movie App", Toast.LENGTH_SHORT).show();
    }
    public void sendHawk(View view) {
        //Stock Hawk
        Toast.makeText(this, "This will launch Stock Hawk App", Toast.LENGTH_SHORT).show();
    }
    public void sendBib(View view) {
        //Build it Bigger
        Toast.makeText(this, "This will launch Build it Bigger App", Toast.LENGTH_SHORT).show();
    }
    public void sendMakeApp(View view) {
        //Make Your App Material
        Toast.makeText(this, "This will launch Make your App Material", Toast.LENGTH_SHORT).show();
    }
    public void sendUbiq(View view) {
        //Find Go Ubiquitous
        Toast.makeText(this, "This will launch Movie App", Toast.LENGTH_SHORT).show();
    }
    public void sendCap(View view) {
        //Send Capstone
        Toast.makeText(this, "This will launch my Captsone App", Toast.LENGTH_SHORT).show();
    }

}
