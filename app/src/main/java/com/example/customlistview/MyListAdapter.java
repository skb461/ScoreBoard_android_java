package com.example.customlistview;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] run;
    private final String[] overWiket;
    private final String[] ball;
    private final String[] runRate;

    public MyListAdapter(Activity context, String[] run,String[] overWiket,String[] ball,String[] runRate) {
        super(context, R.layout.mylist, run);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.run=run;
        this.overWiket=overWiket;
        this.ball=ball;
        this.runRate=runRate;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView runText = (TextView) rowView.findViewById(R.id.run);
        TextView overWiketText = (TextView) rowView.findViewById(R.id.overWiket);
        TextView ballText = (TextView) rowView.findViewById(R.id.ball);
        TextView runRateText = (TextView) rowView.findViewById(R.id.runRate);

        runText.setText(run[position]);
        overWiketText.setText(overWiket[position]);
        ballText.setText(ball[position]);
        runRateText.setText(runRate[position]);

        return rowView;

    };
}
