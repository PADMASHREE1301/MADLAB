package com.example.gem;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView t1;
    float fontSize = 20;
    int colorIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.TextView1);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setTextSize(fontSize);
                fontSize += 4;
                if (fontSize == 40) fontSize = 20;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (colorIndex) {
                    case 1:
                        t1.setTextColor(Color.BLUE);
                        break;
                    case 2:
                        t1.setTextColor(Color.RED);
                        break;
                    case 3:
                        t1.setTextColor(Color.MAGENTA);
                        break;
                    case 4:
                        t1.setTextColor(Color.GREEN);
                        break;
                    default:
                        t1.setTextColor(Color.BLACK);
                        break;
                }
                colorIndex++;
                if (colorIndex > 4) colorIndex = 1;
            }
        });
    }
}
