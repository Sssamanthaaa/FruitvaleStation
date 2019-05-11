package com.wolf.android.fruitvalestation;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class TrainAdapter extends ArrayAdapter<Train> {

    Context context;
    ArrayList<Train>trainslist;

    public TrainAdapter(Context context, ArrayList<Train>trainslist) {
        super(context, 0, trainslist);
    }
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.train_list_item, parent, false);
        Train currentCategoryItem = getItem(position);
        TextView trainTime= convertView.findViewById(R.id.train_time);
        trainTime.setText(currentCategoryItem.getTrainMinutes());
        TextView trainColor= convertView.findViewById(R.id.train_color);
        trainColor.setText(currentCategoryItem.getTrainColor());
        TextView trainPlatform= convertView.findViewById(R.id.train_platform);
        trainPlatform.setText(currentCategoryItem.getTrainPlatform());

        return convertView;
    }
    }