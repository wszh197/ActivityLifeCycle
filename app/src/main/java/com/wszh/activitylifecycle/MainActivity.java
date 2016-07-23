package com.wszh.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String INFO_NAME="infoName";
    private Button mButton;
    private Button mButtonThird;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate执行了");
        mButton = (Button) findViewById(R.id.activity_main_button);
        final EditText mEditText = (EditText) findViewById(R.id.activity_main_textview);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                startActivity(intent);
                */
                //Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,ActivitySecond.class);
                //intent.putExtra("name", "MainActivity传过来的消息。");

                //intent.putExtra("name", editext.getText().toString());
                intent.putExtra(INFO_NAME, mEditText.getText().toString());
                //startActivity(intent);
                startActivityForResult(intent,0);
            }
        });

        mButtonThird = (Button) findViewById(R.id.activity_third_button);
        mButtonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String name = data.getStringExtra("thirdback");
        Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();

    }

    /*
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            String uName = data.getStringExtra("back");
            Toast.makeText(MainActivity.this, uName, Toast.LENGTH_SHORT).show();
        }
    */
    @Override
    protected void onStart() {
        super.onStart();
        //Log.d("MainActivity","onStart执行了。");
        Log.d(TAG, "onStart: 执行了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 执行了。");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 执行了 。");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 执行了。");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 执行了");
    }

}
