package com.iam9091107.escoladeltreball.org.lifecycledemo1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = "MainActivity";

    private Button button;
    //private CheckBox checkBox;
    private RadioButton suma;
    private RadioButton prod;
    private EditText op1;
    private EditText op2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG, "onCreate()");

        button = (Button) findViewById(R.id.calc);
        //checkBox = (CheckBox) findViewById(R.id.checkBox);
        suma = (RadioButton) findViewById(R.id.suma);
        prod = (RadioButton) findViewById(R.id.prod);
        op1 = (EditText) findViewById(R.id.op1);
        op2 = (EditText) findViewById(R.id.op2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcula();
                // check();
            }
        };
        button.setOnClickListener(listener);

    }

    private void calcula() {

        if (suma.isChecked()){
            double resultat = Double.parseDouble(op1.getText().toString()) + Double.parseDouble(op2.getText().toString());
            Toast.makeText(this, Double.valueOf(resultat).toString(), Toast.LENGTH_LONG).show();
        }else{
            double resultat = Double.parseDouble(op1.getText().toString()) * Double.parseDouble(op2.getText().toString());
            Toast.makeText(this, Double.valueOf(resultat).toString(), Toast.LENGTH_LONG).show();
        }

    }

   /* private void check() {
        checkBox.setChecked(!checkBox.isChecked());

    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "onRestart()");
    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        Log.d(LOG, "onConfiguration()");
//    }



}
