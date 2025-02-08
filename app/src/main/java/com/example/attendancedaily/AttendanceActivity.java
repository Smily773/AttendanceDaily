package com.example.attendancedaily;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_attendance2);

        // Get the TextViews and Button by ID
        TextView textViewDate = findViewById(R.id.textViewDate); // TextView for date
        TextView textViewTime = findViewById(R.id.textViewTime); // TextView for time
        TextView textViewEmployeeId = findViewById(R.id.textViewEmployeeId); // TextView for employee ID
        Button submitButton = findViewById(R.id.button5); // Submit Button

        // Set the current date
        String currentDate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        textViewDate.setText(currentDate);

        // Set the current time
        String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        textViewTime.setText(currentTime);

        // Set the employee ID (this can be dynamic, but here is a hardcoded example)
        String employeeId = "EMP12345"; // Replace with actual logic to get employee ID
        textViewEmployeeId.setText(employeeId);

        // Optional: Apply system bar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set up button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when the button is clicked
                Toast.makeText(AttendanceActivity.this, "Submission Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
