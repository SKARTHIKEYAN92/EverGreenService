package com.gsk.www.evergreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView  tv1,tv2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main6);

        tv1=(TextView)findViewById (R.id.textView1);
        tv2=(TextView)findViewById (R.id.textView2);
        btn=(Button)findViewById (R.id.buton);

        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                //Toast.makeText (EditText.g)

                Intent myIntent = new Intent (Main6Activity.this,Main2Activity.class);
                startActivity (myIntent);
                finish ();

            }
        });

    }
}
