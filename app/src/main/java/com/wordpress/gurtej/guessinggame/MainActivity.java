package com.wordpress.gurtej.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view) {

        EditText guessEditText = (EditText) findViewById(R.id.guessEditTex);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber) {

            makeToast("ਤੁਹਾਡਾ ਆਂਕੜਾ ਵੱਡਾ ਹੈ! ਫਿਰ ਕੋਸ਼ਿਸ਼ ਕਰੋ");

        } else if (guessInt < randomNumber) {

            makeToast("ਤੁਹਾਡਾ ਆਂਕੜਾ ਛੋਟਾ ਹੈ! ਫਿਰ ਕੋਸ਼ਿਸ਼ ਕਰੋ");

        } else {

            makeToast("ਬਿਲਕੁਲ ਠੀਕ! ਨਵਾਂ ਆਂਕੜਾ ਸੋਚੋ!");

            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
}
