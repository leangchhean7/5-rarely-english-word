package com.example.jupitercls.finalappslc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by JupiterCls on 4/29/16.
 */
public class details_activitys extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_view);
        TextView textView = (TextView) findViewById(R.id.txtContent);
        TextView txtDes = (TextView) findViewById(R.id.txtDes);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("EXTRA_SESSION_ID");
            String des = extras.getString("Description_ID");
            textView.setText(value + ":");
            txtDes.setText(des);

        }



    }
}
