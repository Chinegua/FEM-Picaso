package com.example.chinegua.fem_picaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.ivContenidoTarea);

        Picasso.with(getApplicationContext()).load("https://loremflickr.com/400/400").into(imageView);
        // Picasso.with(this).load("https://loremflickr.com/400/400").into(imageView);




    }


}

