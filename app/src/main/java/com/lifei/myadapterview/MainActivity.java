package com.lifei.myadapterview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.listView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent();
                t.setClass(MainActivity.this,LVActivity.class);
                MainActivity.this.startActivity(t);
            }
        });
        b2 = (Button)findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent();
                t.setClass(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(t);
            }
        });
        b3 = (Button)findViewById(R.id.bt3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("能显示出来吗");
                Intent t = new Intent();
                Log.v("42行","到了");
                t.setClass(MainActivity.this,SVActivity.class);
                Log.v("44行","到了");
                MainActivity.this.startActivity(t);
            }
        });
    }
}
