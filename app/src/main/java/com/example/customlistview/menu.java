package com.example.customlistview;

//import static com.example.customlistview.R.id.menuList;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class menu extends AppCompatActivity {
    ListView list;

    String[] menuName ={
            "Name: Sakib","Name: Hasan",
            "Name: IObrahim","Name: Ovi",
            "Name: Fahim",
    };

    Integer[] menuIcon={
            R.drawable.sakib_profile,R.drawable.sakib_profile,
            R.drawable.sakib_profile,R.drawable.sakib_profile,
            R.drawable.sakib_profile,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        MyListAdapterMenu adapter=new MyListAdapterMenu(this,menuIcon, menuName);
        list=(ListView)findViewById(R.id.menuList);
        list.setAdapter(adapter);


//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                if(position == 0) {
//                    Intent intent = new Intent(TeamView.this,prifile.class);
//                    startActivity(intent);
//                }
//
//                else if(position == 1) {
//                    Intent intent = new Intent(TeamView.this,prifile.class);
//                    startActivity(intent);
//                }
//
//                else if(position == 2) {
//                    Intent intent = new Intent(TeamView.this,prifile.class);
//                    startActivity(intent);
//                }
//                else if(position == 3) {
//                    Intent intent = new Intent(TeamView.this,prifile.class);
//                    startActivity(intent);
//                }
//                else if(position == 4) {
//                    Intent intent = new Intent(TeamView.this,prifile.class);
//                    startActivity(intent);
//                }
//
//            }
//        });
    }
}