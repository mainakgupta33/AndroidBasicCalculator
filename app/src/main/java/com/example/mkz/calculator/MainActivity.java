package com.example.mkz.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float op1=0 ,op2=0;
    boolean add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1=(EditText)findViewById(R.id.et1);
        final TextView tv2=(TextView)findViewById(R.id.tv2);


        Button bttn1=(Button)findViewById(R.id.bttn1);
        Button bttn2=(Button)findViewById(R.id.bttn2);
        Button bttn3=(Button)findViewById(R.id.bttn3);
        Button bttn4=(Button)findViewById(R.id.bttn4);
        Button bttn5=(Button)findViewById(R.id.bttn5);
        Button bttn6=(Button)findViewById(R.id.bttn6);
        Button bttn7=(Button)findViewById(R.id.bttn7);
        Button bttn8=(Button)findViewById(R.id.bttn8);
        Button bttn9=(Button)findViewById(R.id.bttn9);
        Button bttn0=(Button)findViewById(R.id.bttn0);
        Button bttnCE=(Button)findViewById(R.id.bttnCE);
        final Button bttnequals=(Button)findViewById(R.id.bttnequals);
        Button bttnplus=(Button)findViewById(R.id.bttnplus);
        Button bttnminus=(Button)findViewById(R.id.bttnminus);
        Button bttndiv=(Button)findViewById(R.id.bttndiv);
        Button bttnmul=(Button)findViewById(R.id.bttnmul);




        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "1");
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"2");
            }
        });

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"3");
            }
        });

        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"4");
            }
        });

        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"5");
            }
        });

        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"6");
            }
        });

        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"7");
            }
        });

        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"8");
            }
        });

        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"9");
            }
        });

        bttn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"0");
            }
        });

        bttnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });

        bttnplus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(et1.getText()==null)
                {
                    et1.setText(0+"");
                    tv2.setText(0+"");
                    add=true;

                }
                else {
                    op1 = Float.parseFloat(et1.getText() + "");
                    add=true;
                    et1.setText(null);
                    tv2.setText(op1 + "+");

                   // bttnequals.performClick();

                }
            }
        });

        bttnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText()==null)
                {
                    et1.setText("");
                }
                else
                {
                    op1=Float.parseFloat(et1.getText()+"");
                    sub=true;
                    et1.setText(null);
                    tv2.setText(op1 + "-");
                }
            }
        });

        bttnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText()==null)
                {
                    et1.setText("");
                }
                else
                {
                    op1=Float.parseFloat(et1.getText()+"");
                    mul=true;
                    et1.setText(null);
                    tv2.setText(op1 + "*");
                    bttnequals.callOnClick();
                }
            }


        });

        bttndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText()==null)
                {
                    et1.setText("");
                }
                else
                {
                    op1=Float.parseFloat(et1.getText()+"");
                    div=true;
                    et1.setText(null);
                    tv2.setText(op1 + "/");
                }
            }
        });

        bttnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op2=Float.parseFloat(et1.getText()+"");
                tv2.setText(null);
                float res;
                if(add==true)
                {    res=op1+op2;
                    tv2.setText(res+"");
                    et1.setText(res+"");
                    add=false;
                }
                else if (sub==true)
                {
                    res=op1-op2;
                    tv2.setText(res+"");
                    et1.setText(res+"");
                    sub=false;
                }
                else if (mul==true)
                {   res=op1*op2;
                    tv2.setText(res+"");
                    et1.setText(res+"");
                    mul=false;
                }
                else //if (div==true)
                {
                    res=op1/op2;
                    tv2.setText(res+"");
                    et1.setText(op1/op2+"");
                    div=false;
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
