package com.example.awsyogya.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.awsyogya.R;
import com.example.awsyogya.model.ApiResponse;

import java.util.ArrayList;

/**
 * Created by JhonDev on 07/10/2016.
 */

public class list_array_adapter extends ArrayAdapter<ApiResponse> {

    private ArrayList<ApiResponse> list;
    private LayoutInflater inflater;
    private int res;

    public list_array_adapter(Context context, int resource, ArrayList<ApiResponse> list) {
        super(context, resource, list);
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        MyHolder holder = null;


        if (convertView == null) {

            convertView = inflater.inflate(res, parent, false);

            holder = new MyHolder();

            holder.rain = (TextView) convertView.findViewById(R.id.rain_rain);
            holder.evaporation = (TextView) convertView.findViewById(R.id.rain_evaporation);
            holder.surface = (TextView) convertView.findViewById(R.id.rain_surface);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

//        holder.rain.setText(""+list.get(position).getRr());
//        holder.evaporation.setText(""+list.get(position).getWl());
//        holder.surface.setText(""+list.get(position).getTt_wl());

        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(ApiResponse object) {
        super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static class MyHolder {

        TextView rain;
        TextView evaporation;
        TextView surface;


    }
}

