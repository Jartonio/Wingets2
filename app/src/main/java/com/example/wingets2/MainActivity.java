package com.example.wingets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int sexo = 1;

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


    }
}