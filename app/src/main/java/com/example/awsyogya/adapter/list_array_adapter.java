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

