//package com.example.blinkin;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.List;
//
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        DatabaseHandler db = new DatabaseHandler(this);
//
//        // Inserting Contacts
//        Log.d("Insert: ", "Inserting ..");
//        db.addContact(new User(1,"Ravi","ravi@gmail.com" ,"9100000000"));
//        db.addContact(new User(2,"Srinivas","sri@gmail.com","9199999999"));
//        db.addContact(new User(3,"Tommy","tom@gmail.com", "9522222222"));
//        db.addContact(new User(4,"Karthik","kartik@gmail.com", "9533333333"));
//
//        // Reading all contacts
//        Log.d("Reading: ", "Reading all contacts..");
//        List<User> contacts = db.getAllContacts();
//
//        for (User cn : contacts) {
//            String log = "Id: " + cn.getId() + " ,Name: " + cn.getName() + " ,Email: " +
//                    cn.getEmail()+"Password: " + cn.getPassword() ;
//            // Writing Contacts to log
//            Log.d("Name: ", log);
//        }
//    }
//}
//
