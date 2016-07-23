package com.wszh.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {
    private TextView mTextView;
    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent=getIntent();
        String inforContent = intent.getStringExtra(MainActivity.INFO_NAME);
        Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
        mTextView = (TextView) findViewById(R.id.activity_second_textview);
        mTextView.setText(inforContent);

        mEditText = (EditText) findViewById(R.id.activity_second_edittext);

        mButton = (Button) findViewById(R.id.activity_second_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("back", mEditText.getText().toString());
                setResult(RESULT_OK,intent1);
                finish();
            }
        });


    }
}
