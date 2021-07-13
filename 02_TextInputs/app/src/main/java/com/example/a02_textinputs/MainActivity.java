package com.example.a02_textinputs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterClicked(View view) {
        EditText fin = findViewById(R.id.firstNameInput);
        EditText lin = findViewById(R.id.lastNameInput);
        EditText ein = findViewById(R.id.emailInput);

        TextView firstName = findViewById(R.id.firstNameOutput);
        TextView lastName = findViewById(R.id.lastNameOutput);
        TextView email = findViewById(R.id.emailOutput);

        firstName.setText("First Name: "+ fin.getText().toString());
        lastName.setText("Last Name: "+ lin.getText().toString());
        email.setText("E-mail: "+ ein.getText().toString());
    }
}