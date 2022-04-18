package com.example.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verification extends AppCompatActivity {

    private CardView phone_cv,code_cv,image_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        blinding();
phone_cv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Verification.this,Phone_veri.class);
        startActivity(intent);
    }
});
code_cv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Verification.this,Code_veri.class);
        startActivity(intent);
    }
});

    }

    private void blinding() {
        phone_cv=findViewById(R.id.phone_cv);
        code_cv=findViewById(R.id.code_cv);
        image_cv=findViewById(R.id.image_cv);
    }
}