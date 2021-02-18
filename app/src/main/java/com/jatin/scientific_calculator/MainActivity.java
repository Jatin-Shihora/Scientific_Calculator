package com.jatin.scientific_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


TextView user_input,sign_Box;
Double num1,num2,answer;
String sign,val_1,val_2;
boolean has_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input=(TextView) findViewById(R.id.input_user);
        sign_Box=(TextView) findViewById(R.id.sign_user);

        has_dot=false;
    }

    public void btn_0(View view){ user_input.setText(user_input.getText()+"0"); }
    public void btn_1(View view){ user_input.setText(user_input.getText()+"1"); }
    public void btn_2(View view){ user_input.setText(user_input.getText()+"2"); }
    public void btn_3(View view){ user_input.setText(user_input.getText()+"3"); }
    public void btn_4(View view){ user_input.setText(user_input.getText()+"4"); }
    public void btn_5(View view){ user_input.setText(user_input.getText()+"5"); }
    public void btn_6(View view){ user_input.setText(user_input.getText()+"6"); }
    public void btn_7(View view){ user_input.setText(user_input.getText()+"7"); }
    public void btn_8(View view){ user_input.setText(user_input.getText()+"8"); }
    public void btn_9(View view){ user_input.setText(user_input.getText()+"9"); }

    public void btn_dot(View view)//if dot is not present than give 0. else give value_a.value_b
     {
        if(!has_dot){
            if(user_input.getText().equals("")){
                user_input.setText("0.");
            }else {
                user_input.setText(user_input.getText()+".");
            }
         has_dot=true;
        }
    }

    public void btn_add(View view){
        sign="+";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("+");
        has_dot=false;
    }

    public void btn_subtract(View view){
        sign="-";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("-");
        has_dot=false;
    }

    public void btn_multiply(View view){
        sign="X";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("X");
        has_dot=false;
    }

    public void btn_divide(View view){
        sign="%";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("%");
        has_dot=false;
    }

    public void btn_log(View view){
        sign="log";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("log");
        has_dot=false;
    }

    public void btn_ln(View view){
        sign="ln";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("ln");
        has_dot=false;
    }

    public void btn_power(View view){
        sign="power";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("xⁿ");
        has_dot=false;
    }

    public void btn_factorial(View view){
        sign="factorial";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("!");
        has_dot=false;
    }

    public void btn_sin(View view){
        sign="sin";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("sin");
        has_dot=false;
    }

    public void btn_cos(View view){
        sign="cos";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("cos");
        has_dot=false;
    }

    public void btn_tan(View view){
        sign="tan";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("tan");
        has_dot=false;
    }

    public void btn_root(View view){
        sign="root";
        val_1=user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("√");
        has_dot=false;
    }








}