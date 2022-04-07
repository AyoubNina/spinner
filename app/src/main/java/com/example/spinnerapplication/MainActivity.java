package com.example.spinnerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner s ,s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.pays);
        //pour récuper les infos de la liste pa
        ArrayAdapter<CharSequence> adp1 = ArrayAdapter.createFromResource(this,R.array.liste_pays, android.R.layout.simple_expandable_list_item_1);
        s.setAdapter(adp1);//pour prendre les info de l'adaptateur et l'integre ds le spinner
        //seconde méthode
        String str[]={"a" ,"b"};
        s1 = findViewById(R.id.liste);
        ArrayAdapter<String> adp2 = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,str);
        s1.setAdapter(adp2);


    }
}