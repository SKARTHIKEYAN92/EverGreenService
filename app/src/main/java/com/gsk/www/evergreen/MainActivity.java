package com.gsk.www.evergreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        tv = (TextView) findViewById (R.id.tv1);
        btn = (Button) findViewById (R.id.btnmain);

        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent (MainActivity.this,Main2Activity.class);
                startActivity (myIntent);
            }
        });


    }
}
