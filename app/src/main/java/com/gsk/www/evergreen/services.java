package com.gsk.www.evergreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class services extends AppCompatActivity {

    TextView tvx;
    Button btns1,btns2,btns3,btns4,btns5,btns6,btns7,btns8,btns9,btns10,btns11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main4);
        tvx=(TextView)findViewById (R.id.tv);
        btns1=(Button)findViewById (R.id.Button1);
        btns2=(Button)findViewById (R.id.Button2);
        btns3=(Button)findViewById (R.id.Button3);
        btns4=(Button)findViewById (R.id.Button4);
        btns5=(Button)findViewById (R.id.Button5);
        btns6=(Button)findViewById (R.id.Button6);
        btns7=(Button)findViewById (R.id.Button7);
        btns8=(Button)findViewById (R.id.Button8);
        btns9=(Button)findViewById (R.id.Button9);
        btns10=(Button)findViewById (R.id.Button10);
        btns11=(Button)findViewById (R.id.Button11);

        btns1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse ("https://quickbooks.intuit.com/in/resources/gst-center/file-gst-returns/"));
                startActivity (a);
            }
        });

        btns2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent b = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://cleartax.in/s/eway-bill-gst-rules-compliance"));
                startActivity (b);
            }
        });
        btns3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent c = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://www.profitbooks.net/what-is-hsn-code-under-gst/"));
                startActivity (c);
            }
        });

        btns4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent d = new Intent (Intent.ACTION_VIEW,Uri.parse ("http://164.100.128.144:8100/CRS_NEW/"));
                startActivity (d);
                    
            }
        });

        btns5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent e = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://www.icegate.gov.in/expimport.html/"));
                startActivity (e);
            }
        });

        btns6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent f = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://cleartax.in/s/gst-payments-and-refunds"));
                startActivity (f);
            }
        });

        btns7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent g = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://incometaxindiaefiling.gov.in/downloads/schema?lang=eng"));
                startActivity (g);
            }
        });
        btns8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent h = new Intent (Intent.ACTION_VIEW,Uri.parse ("http://www.cbec.gov.in/htdocs-cbec/whoweare/whoweare"));
                startActivity (h);
            }
        });
        btns9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Intent.ACTION_VIEW,Uri.parse ("https://udyogaadhaar.gov.in/UA/UAM_Registration.aspx"));
                startActivity (i);
            }
        });
        btns10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent j = new Intent (Intent.ACTION_VIEW,Uri.parse ("http://www.aepcindia.com/node"));
                startActivity (j);
            }
        });
        btns11.setOnClickListener (new View.OnClickListener () {
            public void onClick(View view) {
                Intent k = new Intent (services.this,Main2Activity.class);
                startActivity (k);
            }
        });




    }
}
