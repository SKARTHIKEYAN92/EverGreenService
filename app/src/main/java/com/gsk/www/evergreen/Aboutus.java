package com.gsk.www.evergreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    TextView tvs1,tvs2;
    ImageView imv;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main3);

        tvs1=(TextView)findViewById (R.id.tvs1);
        tvs2=(TextView)findViewById (R.id.tvs2);
        btns= (Button)findViewById (R.id.btn3);

        btns.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent myIntent7 = new Intent(Aboutus.this,Main2Activity.class);
                startActivity (myIntent7);
                finish ();
            }
        });
    }
}
