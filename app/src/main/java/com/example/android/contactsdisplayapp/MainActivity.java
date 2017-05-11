package com.example.android.contactsdisplayapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact = (Button)findViewById(R.id.contacts);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myData = "content://contacts/people/";

                Intent myActivity2 = new Intent(Intent.ACTION_VIEW, Uri.parse( myData) );
                startActivity(myActivity2);
            }
        });

    }
}
