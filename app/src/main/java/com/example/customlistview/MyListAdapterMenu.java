package com.example.customlistview;

        import static com.example.customlistview.R.id.profilePic;

        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;


public class MyListAdapterMenu extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[]  menuIcon;
    private final String[] menuName;

    public MyListAdapterMenu(Activity context, Integer[] menuIcon,String[] menuName) {
        super(context, R.layout.mylistmenu, menuName);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.menuIcon=menuIcon;
        this.menuName=menuName;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylistmenu, null,true);

        //ImageView imageView = (ImageView) rowView.findViewById(R.id.menuIcon);
        TextView menuNameText = (TextView) rowView.findViewById(R.id.menuName);

        //imageView.setImageResource(profilePic[position]);
        menuNameText.setText(menuName[position]);

        return rowView;

    };
}
