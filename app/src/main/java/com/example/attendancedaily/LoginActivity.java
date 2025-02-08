package com.example.attendancedaily;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    TextView textView,textView1;
    EditText editText,editText1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView9);
        textView1=findViewById(R.id.textView10);
        editText=findViewById(R.id.editText1);
        editText1=findViewById(R.id.editText2);
        btn=findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=textView.getText().toString();
                String password = textView1.getText().toString();
                Intent intent=new Intent(getApplicationContext(), AttendanceActivity.class);
                startActivity(intent);
            }
        });



    }
}