package com.example.gitgithubrepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.javalib.Jokes;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Jokes joke = new Jokes();
        String myJoke = joke.ajoke;

        Toast.makeText(MainActivity.this, myJoke, Toast.LENGTH_SHORT).show();


//Intent intent = new Intent(MainActivity.this);


    }
}
