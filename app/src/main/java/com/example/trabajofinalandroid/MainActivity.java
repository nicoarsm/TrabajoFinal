package com.example.trabajofinalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.empresa);

        final Button botonSandwiches = (Button) findViewById(R.id.sandwichesBoton);
        botonSandwiches.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SandwichesActivity.class);
                startActivity(intent);
            }
        });
        final Button botonSobre = (Button) findViewById(R.id.sobreBoton);
        botonSobre.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(intent);
            }
        });


    }
}
