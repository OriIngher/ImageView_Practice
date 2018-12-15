package com.example.oriin_bsqgiqy.imageview_practice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Random rnd = new Random();
ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView)findViewById(R.id.iv1);
    }

    public void go(View view) {
        int x = rnd.nextInt()%3;
        switch (x)
        {
            case 0:
                iv1.setImageResource(R.drawable.a1);
                break;

            case 1:
                iv1.setImageResource(R.drawable.a2);
                break;

            case 2:
                iv1.setImageResource(R.drawable.a3);
                break;

        }
    }
}

