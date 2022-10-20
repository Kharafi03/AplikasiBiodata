package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button setMaps, setPhone, setEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan button di xml dengan logic di java
        setPhone=findViewById(R.id.buttonTelepon);
        setEmail=findViewById(R.id.buttonEmail);
        setMaps=findViewById(R.id.buttonAlamat);

        //set onclicklistener untuk tiap button
        setMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmaps();
            }
        });

        setPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhone();
            }
        });

        setEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGmail();
            }
        });
    }

    //fungsi untuk membuka phone app menggunakan Implicit Intent
    public void openPhone(){
        Uri callNumber=Uri.parse("tel:082136676464");
        Intent callIntent=new Intent(Intent.ACTION_DIAL,callNumber);
        startActivity(callIntent);
    }

    //fungsi untuk membuka email app menggunakan Implicit Intent
    public void openGmail(){
        Uri tujuanEmail=Uri.parse("mailto:111202113496@mhs.dinus.ac.id");
        Intent callIntent=new Intent(Intent.ACTION_SENDTO,tujuanEmail);
        startActivity(callIntent);

    }

    //fungsi untuk membuka maps app menggunakan Implicit Intent
    public void openGmaps(){
        Uri locations = Uri.parse("https://goo.gl/maps/eYF4vu3t64senBrD9");
        Intent intentPeta = new Intent(Intent.ACTION_VIEW, locations);
        startActivity(intentPeta);
    }

}
