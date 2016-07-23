package com.wszh.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ActivitySecond extends AppCompatActivity {
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String inforContent = intent.getStringExtra(MainActivity.INFO_NAME);
        Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
        textview = (TextView) findViewById(R.id.activity_second_textview);
        textview.setText(inforContent);
    }
}
