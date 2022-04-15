package com.example.material_ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {

    private TextView gender_txt, age_txt;
    String[] age = {"<17", "17-25", "26-40", "40<"};
    String[] gender = {"Male", "Female", "Other"};
    private ImageView notification_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        blinding();


        age_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog();

            }
        });

        gender_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdialog();

            }
        });
        notification_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Sign_up.this, "Notification", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void blinding() {

        gender_txt = findViewById(R.id.gender_txt);
        age_txt = findViewById(R.id.age_txt);
        notification_img = findViewById(R.id.notification_img);
    }

    public void dialog() {

        AlertDialog alertDialog = new AlertDialog.Builder(Sign_up.this)
                .setTitle("Age")
                .setSingleChoiceItems(age, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Sign_up.this, "age" + age[i], Toast.LENGTH_SHORT).show();
//                        alertDialog.dismiss();
                    }
                })
                .create();

        alertDialog.show();

    }
    public void showdialog() {

        AlertDialog alertDialog = new AlertDialog.Builder(Sign_up.this)
                .setTitle("Gender")
                .setSingleChoiceItems(gender, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Sign_up.this, "gender" + gender[i], Toast.LENGTH_SHORT).show();
//                        alertDialog.dismiss();
                    }
                })
                .create();

        alertDialog.show();

    }

}