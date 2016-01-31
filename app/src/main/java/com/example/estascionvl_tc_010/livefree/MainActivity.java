package com.example.estascionvl_tc_010.livefree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, sub, mul, div;
    TextView answer;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        answer = (TextView) findViewById(R.id.answer);
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);

        add.setOnClickListener(this); // alt+enter
        sub.setOnClickListener(this); // alt+enter
        mul.setOnClickListener(this); // alt+enter
        div.setOnClickListener(this); // alt+enter

        Log.i("cicloVida","Entro en onCreate");
    }

    //region Ciclo de vida

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("cicloVida", "Entro en onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("cicloVida", "Entro en onResume");
    }

    @Override
    protected void onPause(){
        Log.i("cicloVida", "Entro en onDestroy");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.i("cicloVida", "Entro en onStop");
        super.onStop();

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("cicloVida", "Entro en onRestart");
    }

    @Override
    protected void onDestroy(){
        Log.i("cicloVida", "Entro en onDestroy");
        super.onDestroy();

    }
    //endregion

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);
        int r = 0;

        switch (v.getId()){

          case R.id.add:
                  r = ni1 + ni2;
              break;
          case R.id.sub:
              r = ni1 - ni2;
              break;
          case R.id.mul:
              r = ni1 * ni2;
              break;
          case R.id.div:
              r = ni1 / ni2;
              break;

      }

        answer.setText(""+r);

    }



}
