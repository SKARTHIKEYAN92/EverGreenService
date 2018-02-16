package com.gsk.www.evergreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView tvs1,tvs2;
    Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main5);

        tvs1=(TextView)findViewById (R.id.textView1);
        tvs2=(TextView)findViewById (R.id.textView2);
        btn12=(Button)findViewById (R.id.button1);

        btn12.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent10 = new Intent (Main5Activity.this,Main2Activity.class);
                startActivity (myIntent10);
            }
        });

    }

}
