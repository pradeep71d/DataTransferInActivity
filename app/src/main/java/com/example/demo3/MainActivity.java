package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1="this is text moving";
                int i1=R.drawable.iiii;
                int i2=R.drawable.bbb;
                int i3=R.drawable.fff;
                int i4=R.drawable.mmm;
                Intent intent=new Intent(MainActivity.this,Second.class);
                intent.putExtra("key1",s1);//putting data in key and value form.
                intent.putExtra("key2",i1);
                intent.putExtra("key3",i2);
                intent.putExtra("key4",i3);
                intent.putExtra("key5",i4);
                startActivity(intent);
                //here we are transfering data from one activity to another activity.
            }
        });
    }
}
