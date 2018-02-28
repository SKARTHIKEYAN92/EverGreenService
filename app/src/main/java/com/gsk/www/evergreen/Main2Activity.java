package com.gsk.www.evergreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3 ;
    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        tv1=(TextView)findViewById (R.id.TextView01);
        tv2=(TextView)findViewById (R.id.TextView02);
        tv3=(TextView)findViewById (R.id.TextView03);
        btn1=(Button)findViewById (R.id.Button1);
        btn2=(Button)findViewById (R.id.Button2);
        btn3=(Button)findViewById (R.id.Button3);
        btn4=(Button)findViewById (R.id.Button4);
        btn5=(Button)findViewById (R.id.Button5);


        btn1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent (Main2Activity.this,Aboutus.class);
                startActivity (myIntent2);
            }

        });

        btn2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent3 =new Intent(Main2Activity.this,services.class);
                startActivity (myIntent3);
            }
        });


        btn3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent4 =new Intent(Main2Activity.this,Main5Activity.class);
                startActivity (myIntent4);
            }
        });

        btn4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myInt5 =new Intent(Main2Activity.this,Main6Activity.class);
                startActivity (myInt5);
            }
        });
        btn5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent6 =new Intent(Main2Activity.this,Main7Activity.class);
                startActivity (myIntent6);
            }
        });


    }
}
