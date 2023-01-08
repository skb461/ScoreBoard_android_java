package com.example.customlistview;

//import android.support.v7.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ListView list;


    String[] run ={
            "132","247",
            "141","153",
            "137","145"
    };

    String[] overWiket ={
            "32.4 || 7","32.3 || 7",
            "37.4 || 2","41.5 || 3",
            "25.4 || 0","30.1 || 9",
    };

    String[] ball ={
            "0 | 1 | 0 | 0 | 0 | 0","0 | 0 | 1 | 0 | 0 | 0",
            "0 | 0 | 0 | 1 | 0 | 0","0 | 0 | 0 | 0 | 1 | 0",
            "0 | 0 | 0 | 0 | 0 | 1","1 | 0 | 0 | 0 | 0| 0",
    };

    String[] runRate ={
            "CRR:- 3.20 | RRR:- 4.70","CRR:- 4.10 | RRR:- 5.30",
            "CRR:- 4.20 | RRR:- 3.70","CRR:- 2.50 | RRR:- 4.00",
            "CRR:- 4.20 | RRR:- 3.10","CRR:- 3.10 | RRR:- 7.00",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton button_1 = findViewById(R.id.buttonFloat);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_1 = new Intent(MainActivity.this,TeamView.class);
                startActivity(intent_1);
            }
        });

        MyListAdapter adapter=new MyListAdapter(this, run, overWiket,ball,runRate);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }

                else if(position == 1) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }

                else if(position == 2) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }
                else if(position == 3) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }
                else if(position == 4) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }
                else if(position == 5) {
                    Intent intent = new Intent(MainActivity.this,matchView.class);
                    startActivity(intent);
                }

            }
        });
    }
}