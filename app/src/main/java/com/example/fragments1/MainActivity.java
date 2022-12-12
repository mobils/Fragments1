package com.example.fragments1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment1.OnButtonSelectedListener {

    Button boto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boto1 = findViewById(R.id.botoActivity1);
        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Inflar el fragment 1


                FragmentManager fm = getSupportFragmentManager();
                //if (fm.findFragmentById(R.id.contenidor1) == null) {  //Opcional si fem replace
                    Fragment1 fragment1 = new Fragment1();
                    fm.beginTransaction().replace(R.id.contenidor1, fragment1).commit();
                //}


            }
        });
    }

    @Override
    public void onButtonSelected(String str) {
        //TODO: Aqui arribarem quan el fragment cliqui el botó

        Toast.makeText(this,"Ha clicat al fragment1" + str, Toast.LENGTH_SHORT).show();

    }
}