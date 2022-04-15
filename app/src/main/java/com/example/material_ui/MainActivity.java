package com.example.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CardView form_cv, profile_cv, verification_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();


        form_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Form.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "Form", Toast.LENGTH_SHORT).show();
            }
        });
        profile_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void blinding() {

        form_cv = findViewById(R.id.form_cv);
        profile_cv = findViewById(R.id.profile_cv);
        verification_cv = findViewById(R.id.verification_cv);
    }
}