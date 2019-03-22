package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.utils.AppConstant;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private TextView mTvH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTvH= findViewById(R.id.tvH);

        Intent mIntent= getIntent();
        if(mIntent!=null){
            mTvH.setText(((Intent) mIntent).getStringExtra(AppConstant.TEXT_KEY));
        }
    }
}
