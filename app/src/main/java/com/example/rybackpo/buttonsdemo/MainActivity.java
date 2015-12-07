package com.example.rybackpo.buttonsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button imageTextTopButton = (Button) findViewById(R.id.imagetextTop);
        imageTextTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "imageTextTopButton was clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        Button imageTextLeftButton = (Button) findViewById(R.id.imagetextLeft);
        imageTextLeftButton.setOnClickListener(buttonListener);

        Button imageTextRightButton = (Button) findViewById(R.id.imagetextRight);
        imageTextRightButton.setOnClickListener(buttonListener);

        Button imageTextBottomButton = (Button) findViewById(R.id.imagetextBottom);
        imageTextBottomButton.setOnClickListener(buttonListener);

    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), ((Button) v).getText() + " was clicked!", Toast.LENGTH_SHORT).show();
        }
    };

    public void onImageButton(View view){
        Toast.makeText(getBaseContext(), "ImageButton was clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onToggleButton(View view){
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + btn.isChecked(), Toast.LENGTH_SHORT).show();
    }
}
