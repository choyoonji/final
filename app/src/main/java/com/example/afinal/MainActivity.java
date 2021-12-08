package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

import com.example.afinal.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickedGoogleBtn(View v){
        Intent  myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/"));
        startActivity(myIntent);
    }
    public void OnClickedCallBtn(View v){
        Intent  myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(myIntent);
    }
}

