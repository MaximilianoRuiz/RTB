package com.example.maxi.rtb;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PrincipalMenu extends ActionBarActivity {

    ActionBar actionBar;
    Button btnGastronomia, btnOcio, btnIndumentaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));

        Toolbar actionBarToolbar = (Toolbar)findViewById(R.id.action_bar);
        actionBarToolbar.setTitleTextColor(Color.parseColor("#000000"));

        btnGastronomia = (Button) findViewById(R.id.btnGastronomia);
        btnOcio = (Button) findViewById(R.id.btnOcio);
        btnIndumentaria = (Button) findViewById(R.id.btnIndumentaria);


    }

    public void makeToast(View v){
        Toast.makeText(this, "Boton Clickeado", Toast.LENGTH_LONG).show();
    }

    public void upGastronomia(View v){
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }
}
