package com.example.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    private CardView polygon_cv,red_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        blinding();
        polygon_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

polygon_cv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent=new Intent(Profile.this,Polygon.class);
        startActivity(intent);

    }
});
red_cv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent=new Intent(Profile.this,Red_profile.class);
        startActivity(intent);

    }
});


            }
        });
    }

    private void blinding() {
        polygon_cv =findViewById(R.id.polygon_cv);
        red_cv =findViewById(R.id.red_cv);
    }
}