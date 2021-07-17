package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tx_names;
    private EditText tx_lnames;
    private EditText tx_mail;
    private EditText tx_pwd;
    private CheckBox chk_terminos;
    private TextView act_terminos;
    private Button btn_enviar;
    private Activity mySelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx_names = findViewById(R.id.tx_names);
        tx_lnames = findViewById(R.id.tx_lname);
        tx_mail =   findViewById(R.id.tx_email);
        tx_pwd = findViewById(R.id.tx_pwd);
        chk_terminos = findViewById(R.id.chk_terminos);
        act_terminos = findViewById(R.id.Act_Terminos);
        btn_enviar = findViewById((R.id.btn_enviar));
        mySelf = this;

        act_terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent terminos = new Intent(mySelf, TermCond.class);
                startActivity((terminos));

                chk_terminos.setEnabled(true);


            }
        });

        chk_terminos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    btn_enviar.setEnabled(true);
                }
                else{
                    btn_enviar.setEnabled(false);
                }
            }
        });



    }

    /*private void activarEnviar () {
        if (chk_terminos.isChecked()){
            btn_enviar.setEnabled(true);
        }
        else {
            btn_enviar.setEnabled(false);
        }
    }*/





}