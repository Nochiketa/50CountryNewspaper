package com.example.nochiketa.grid;

/**
 * Created by Nochiketa on 7/9/2017.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListViewImageAdapter extends ArrayAdapter<String> {

    private final Activity con;
    private final String[] names;
    private final Integer[] img;

    public ListViewImageAdapter(Activity con, String[] names, Integer[] img) {
        super(con, R.layout.item_image, names);
        this.con = con;
        this.names = names;
        this.img = img;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_image, null, true);

        TextView textView = (TextView) rowView.findViewById(R.id.textViewList);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.ImageViewList);

        textView.setText(names[position]);
        imageView.setImageResource(img[position]);

        return rowView;
    }
}
