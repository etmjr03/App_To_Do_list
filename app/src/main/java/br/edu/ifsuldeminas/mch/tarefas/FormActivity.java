package br.edu.ifsuldeminas.mch.tarefas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    @Override
    public void onCleate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOpitionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
