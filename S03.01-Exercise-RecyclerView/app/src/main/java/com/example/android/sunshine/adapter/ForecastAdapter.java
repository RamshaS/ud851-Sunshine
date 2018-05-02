package com.example.android.sunshine.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

/**
 * Created by RamSl-la Saeed on 02-May-18.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    private String[] mWeatherData;

    public void setmWeatherData(String[] mWeatherData) {
        this.mWeatherData = mWeatherData;
        notifyDataSetChanged();
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int mWeatherLayoutRes = R.layout.forecast_list_item;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        boolean attachToParent = false;
        View mWeatherView = layoutInflater.inflate(mWeatherLayoutRes, parent, attachToParent);
        ForecastAdapterViewHolder forecastAdapterViewHolder = new ForecastAdapterViewHolder(mWeatherView);
        return forecastAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    @Override
    public int getItemCount() {
        return mWeatherData != null ? mWeatherData.length : 0;
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }

}
