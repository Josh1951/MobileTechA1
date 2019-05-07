package com.example.joshuaharveya1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.joshuaharveya1.R;

public class ContactActivity extends AppCompatActivity {

    private String contactName;
    private String contactEmail;
    private String contactMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        configureNextButton();
    }

    public void configureNextButton(){
        Button sendButton = (Button) findViewById(R.id.back_button);
        final EditText nameInput = findViewById(R.id.contactName);
        final EditText emailInput = findViewById(R.id.contactEmail);
        final EditText messageInput = findViewById(R.id.contactMessage);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactName = nameInput.getText().toString();
                contactEmail = emailInput.getText().toString();
                contactMessage = messageInput.getText().toString();
                Toast.makeText(ContactActivity.this, contactName + contactEmail + contactMessage, Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
