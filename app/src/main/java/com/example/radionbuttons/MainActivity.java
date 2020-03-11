package com.example.radionbuttons;

import androidx.annotation.ColorLong;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton blue,green,red;
    ConstraintLayout clayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red=findViewById(R.id.red);
        blue=findViewById(R.id.blue);
        green=findViewById(R.id.green);
        clayout=findViewById(R.id.clayout);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clayout.setBackgroundColor(Color.RED);

            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clayout.setBackgroundColor(Color.BLUE);

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clayout.setBackgroundColor(Color.GREEN);

            }
        });


    }
    public void myweb(View view){
        openUrl("https://www.google.com");
    }
    public void myweb1(View view){
        openUrl1("https://www.yahoo.com");
    }
    private void openUrl(String url) {
        Uri uri=Uri.parse(url);
        Intent Launchweb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Launchweb);

    }

    private void openUrl1(String url1) {
        Uri uri=Uri.parse(url1);
        Intent Launchweb1=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Launchweb1);

    }
}
