package com.example.parcelablemedium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Student student;
    EditText name,age,rollno;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.Ed_Name);
        age = findViewById(R.id.Ed_Age);
        rollno = findViewById(R.id.Ed_RollNo);
        button = findViewById(R.id.E_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              int x=Integer.parseInt(age.getText().toString());
              int y=Integer.parseInt(rollno.getText().toString());

              student=new Student(x,name.getText().toString(),y);
              Intent intent=new Intent(MainActivity.this,DetailActivity.class);
              intent.putExtra("Deta",student);
              startActivity(intent);
            }
        });
    }
}
