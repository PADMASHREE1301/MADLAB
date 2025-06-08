package com.example.addition;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {
    EditText num1, num2;
    Button addBtn;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.addBtn);
        resultView = findViewById(R.id.resultView);

        addBtn.setOnClickListener(v -> {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            resultView.setText("Sum: " + (a + b));
        });
    }
}
