package com.example.login;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LoginButtons;
        final EditText NameEdit;
        final EditText PasswordText;
        NameEdit = findViewById(R.id.Login);
        LoginButtons = findViewById(R.id.Zaloguj);
        PasswordText = findViewById(R.id.Haslo);


        LoginButtons.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Wpisany login: " + NameEdit.getText().toString() + "\r\nWpisane hasło: " + PasswordText.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
