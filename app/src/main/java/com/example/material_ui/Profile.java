package com.example.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    private CardView polygon_cv, red_cv, blueappbar_cv,fabmenu_cv,cardheader_cv,cardimage_cv,cardoverlap_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        blinding();

        polygon_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Polygon.class);
                startActivity(intent);

            }
        });
        red_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Red_profile.class);
                startActivity(intent);

            }
        });
        blueappbar_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Blue_Appbar.class);
                startActivity(intent);

            }
        });
        fabmenu_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Fab_Menu.class);
                startActivity(intent);

            }
        });
        cardheader_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Card_Header.class);
                startActivity(intent);

            }
        });
        cardimage_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Card_Header_Images.class);
                startActivity(intent);

            }
        });
        cardoverlap_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Profile.this, Card_Overlap_profile.class);
                startActivity(intent);

            }
        });

    }

    private void blinding() {
        polygon_cv = findViewById(R.id.polygon_cv);
        red_cv = findViewById(R.id.red_cv);
        blueappbar_cv = findViewById(R.id.blueappbar_cv);
        fabmenu_cv = findViewById(R.id.fabmenu_cv);
        cardheader_cv = findViewById(R.id.cardheader_cv);
        cardimage_cv = findViewById(R.id.cardimage_cv);
        cardoverlap_cv = findViewById(R.id.cardoverlap_cv);
    }
}