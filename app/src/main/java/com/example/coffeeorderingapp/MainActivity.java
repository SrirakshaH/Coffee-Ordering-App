package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView value;
    int count=0;


    @Override
protected void oncreate(Bundle savedInstanceState){
    super.oncreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    value=(TextView)findViewById(R.id.value);
    }
    public void increment(View v) {
        count++;
        value.setText("" + count);
    }
    public void decrement(View v){
        if(count<=0) count=0;
        else count--;

        value.setText("" +count);
        AdapterView.OnItemClickListener itemClickListener =new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent = new Intent(MainActivity.this, CoffeeCategoryActivity, class);
                    startActivity(intent);
                }
            }
            private void startActivity(Intent intent){

            }
            /* public void OnItemClick(AdapterView<?> listView,View v,int position,LOng id) {

             */
        };
        ListView listView =(ListView) findViewById(R.id.List_options);
        listView.setOnClickListener(itemClickListener);
    }
}


