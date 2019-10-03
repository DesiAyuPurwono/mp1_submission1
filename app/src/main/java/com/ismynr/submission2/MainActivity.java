package com.ismynr.submission2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ImageView transport,gofood,shopping,instantcourier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transport = findViewById(R.id.transport);
        gofood = findViewById(R.id.go_food);
        shopping = findViewById(R.id.shopping);
        instantcourier = findViewById(R.id.instant_courier);

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ini adalah transport",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(MainActivity.this,transport.class);
                startActivity(m);
            }
        });

        gofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ini adalah gofood",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(MainActivity.this,go_food.class);
                startActivity(m);
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ini adalah shopping",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(MainActivity.this,shopping.class);
                startActivity(m);
            }
        });
        instantcourier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"ini adalah instantcourier",Toast.LENGTH_SHORT).show();
                Intent m = new Intent(MainActivity.this,instant_courier.class);
                startActivity(m);
            }
        });

    }
}
