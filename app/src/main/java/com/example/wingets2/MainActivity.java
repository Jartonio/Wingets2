package com.example.wingets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup miRadioGroup = (RadioGroup) findViewById(R.id.rg_todos);

        TextView display = (TextView) findViewById(R.id.display);


        miRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton pulsado = (RadioButton) findViewById(checkedId);

                //display.setText(pulsado.getText());

                switch (pulsado.getId()) {
                    case R.id.rb_hombre:
                        display.setText(pulsado.getText());
                        break;
                    case R.id.rb_mujer:
                        display.setText(pulsado.getText());
                        break;
                    case R.id.rb_LGTBI:
                        display.setText(pulsado.getText());
                        break;
                    default:
                        break;
                }

            }
        });


    }
}