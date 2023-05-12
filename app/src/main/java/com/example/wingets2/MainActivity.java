package com.example.wingets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.nio.file.WatchEvent;


public class MainActivity extends AppCompatActivity {

    private int sexo = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup miRadioGroup = findViewById(R.id.rg_todos);


        miRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton pulsado = findViewById(checkedId);
                TextView display = findViewById(R.id.display);

                display.setText(pulsado.getText());

                switch (pulsado.getId()) {
                    case R.id.rb_hombre:
                        sexo = 1;
                        break;
                    case R.id.rb_mujer:
                        sexo = 2;
                        break;
                    case R.id.rb_LGTBI:
                        sexo = 3;
                        break;
                }

            }
        });


        Switch miSwich = findViewById(R.id.switch1);
        miSwich.setText("RadioGroup activado");
        miSwich.setChecked(true);

        miSwich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    miSwich.setText("RadioGroup activado");
                    miRadioGroup.setVisibility(View.VISIBLE);
                }else{
                    miSwich.setText("RacioGrupop desactivado");
                    miRadioGroup.setVisibility(View.INVISIBLE);
                }
            }
        });

        WebView miWebView = findViewById(R.id.webView);
        miWebView.loadUrl("https://www.google.es");


    }
}