package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView textView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.t1);
        imageView1=findViewById(R.id.i1);
        imageView2=findViewById(R.id.i2);
        imageView3=findViewById(R.id.i3);
        imageView4=findViewById(R.id.i4);
        Bundle bundle=getIntent().getExtras();//getting data using bundles.
        String s1=bundle.getString("key1");
        int i5=bundle.getInt("key2");
        int i6=bundle.getInt("key3");
        int i7=bundle.getInt("key4");
        int i8=bundle.getInt("key5");
        textView.setText(s1);
        imageView1.setImageResource(i5);
        imageView2.setImageResource(i6);
        imageView3.setImageResource(i7);
        imageView4.setImageResource(i8);
    }
}
