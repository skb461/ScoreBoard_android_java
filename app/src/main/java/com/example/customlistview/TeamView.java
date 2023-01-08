package com.example.customlistview;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class TeamView extends AppCompatActivity {
    ListView list;

    String[] Name ={
            "Name: Sakib","Name: Hasan",
            "Name: IObrahim","Name: Ovi",
            "Name: Fahim",
    };

    String[] totalRun ={
            "Total Run: 1392","Total Run: 2300",
            "Total Run: 7000","Total Run: 2404",
            "Total Run: 1600",
    };

    String[] totalMatch ={
            "Total Match: 12","Total Match: 17",
            "Total Match: 30","Total Match: 10",
            "Total Match: 11",
    };

    Integer[] profilePic={
            R.drawable.sakib_profile,R.drawable.sakib_profile,
            R.drawable.sakib_profile,R.drawable.sakib_profile,
            R.drawable.sakib_profile,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_view);

        MyListAdapter2 adapter=new MyListAdapter2(this,profilePic, Name, totalRun,totalMatch);
        list=(ListView)findViewById(R.id.teamList);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    Intent intent = new Intent(TeamView.this,prifile.class);
                    startActivity(intent);
                }

                else if(position == 1) {
                    Intent intent = new Intent(TeamView.this,prifile.class);
                    startActivity(intent);
                }

                else if(position == 2) {
                    Intent intent = new Intent(TeamView.this,prifile.class);
                    startActivity(intent);
                }
                else if(position == 3) {
                    Intent intent = new Intent(TeamView.this,prifile.class);
                    startActivity(intent);
                }
                else if(position == 4) {
                    Intent intent = new Intent(TeamView.this,prifile.class);
                    startActivity(intent);
                }

            }
        });
    }
}