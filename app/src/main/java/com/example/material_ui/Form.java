package com.example.material_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Form extends AppCompatActivity {

    private CardView Sign_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        blinding();

Sign_cv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent= new Intent(Form.this,Sign_up.class);
        startActivity(intent);
    }
});

    }

    private void blinding() {
        Sign_cv=findViewById(R.id.Sign_cv);
    }
}