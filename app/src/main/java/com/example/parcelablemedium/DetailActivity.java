package com.example.parcelablemedium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView G_Name,G_Age,G_RollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        G_Age = findViewById(R.id.D_Age);
        G_Name = findViewById(R.id.D_Name);
        G_RollNo = findViewById(R.id.D_Roll);

        Intent intent=getIntent();
        Student student=intent.getParcelableExtra("Deta");

        int age=student.getAge();
        String name=student.getName();
        int rollno=student.getRollno();

        G_Name.setText(name);
        G_Age.setText(age);
        G_RollNo.setText(rollno);
    }
}
