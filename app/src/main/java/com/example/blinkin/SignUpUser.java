package com.example.blinkin;


import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.List;

public class SignUpUser extends AppCompatActivity {

    EditText fullName;
    EditText email;
    EditText password;
    Button register;
    DatabaseHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
db= new DatabaseHandler(this);
        fullName = findViewById(R.id.fullname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        register = findViewById(R.id.Registerbtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
               // insertRecord();
            }
        });
    }

//    private void insertRecord() {
//
//        Log.d("Insert: ", "Inserting ..");
//        db.addContact(new User());
//
//        // Reading all contacts
//        Log.d("Reading: ", "Reading all contacts..");
//        List<User> contacts = db.getAllContacts();
//
//        for (User cn : contacts) {
//            String log = "Id: " + cn.getId() + " ,Name: " + cn.getName() + " ,Phone: " +
//                    cn.getEmail();
//            // Writing Contacts to log
//            Log.d("Name: ", log);
//        }
//    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(fullName)) {
            Toast t = Toast.makeText(this, "You must enter name to register!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmpty(email)) {
            email.setError("Email is required!");
        }

        if (isEmail(email) == false) {
            email.setError("Enter valid email!");
        }

    }
}

