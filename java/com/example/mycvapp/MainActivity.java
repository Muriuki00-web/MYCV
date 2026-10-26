package com.example.mycvapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycvapp.R;

public class MainActivity extends AppCompatActivity {

    TextView txtSkills;
    Button btnSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtSkills = findViewById(R.id.txtSkills);
        btnSkills = findViewById(R.id.btnSkills);


        btnSkills.setOnClickListener(v -> {
            txtSkills.setText(
                    "MY ICT SKILLS\n\n" +
                            "• Computer Applications\n" +
                            "• HTML and CSS Basics\n" +
                            "• Java Programming Basics\n" +
                            "• Android Studio\n" +
                            "• Database Management\n" +
                            "• Computer Maintenance\n" +
                            "• Problem Solving"
            );
        });
    }
    public void Opening(View V)
    {
        Toast.makeText(MainActivity.this,"Openinig",Toast.LENGTH_LONG).show();
    }
}