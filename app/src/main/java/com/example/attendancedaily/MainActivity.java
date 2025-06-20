package com.example.attendancedaily;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    RadioButton button,button1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.radioButton);
        button1=findViewById(R.id.radioButton2);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.isChecked()) {
                    // If Admin radio button is selected, pass Admin info
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    intent.putExtra("userType", "admin");
                    startActivity(intent);
                } else if (button1.isChecked()) {
                    // If Employee radio button is selected, pass Employee info
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    intent.putExtra("userType", "employee");
                    startActivity(intent);
                } else {
                    // If neither is selected, show a message (optional)
                    textView.setText("Please select a user type.");
                }
            }
        });



    }
}