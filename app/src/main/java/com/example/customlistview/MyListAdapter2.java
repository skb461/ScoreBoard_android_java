package com.example.customlistview;

import static com.example.customlistview.R.id.profilePic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


        import android.app.Activity;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MyListAdapter2 extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[]  profilePic;
    private final String[] Name;
    private final String[] totalRun;
    private final String[] totalMatch;

    public MyListAdapter2(Activity context, Integer[] profilePic,String[] Name,String[] totalRun,String[] totalMatch) {
        super(context, R.layout.mylist2, Name);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.profilePic=profilePic;
        this.Name=Name;
        this.totalRun=totalRun;
        this.totalMatch=totalMatch;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist2, null,true);

        //ImageView imageView = (ImageView) rowView.findViewById(R.id.profilePic);
        TextView NameText = (TextView) rowView.findViewById(R.id.Name);
        TextView totalRunText = (TextView) rowView.findViewById(R.id.totalRun);
        TextView totalMatchText = (TextView) rowView.findViewById(R.id.totalMatch);

        //imageView.setImageResource(profilePic[position]);
        NameText.setText(Name[position]);
        totalRunText.setText(totalRun[position]);
        totalMatchText.setText(totalMatch[position]);

        return rowView;

    };
}
