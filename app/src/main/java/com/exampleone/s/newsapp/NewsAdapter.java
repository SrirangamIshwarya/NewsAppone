package com.exampleone.s.newsapp;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        super(context, 0, newsArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView sectionTV = (TextView) convertView.findViewById(R.id.section);
        TextView dateTV = (TextView) convertView.findViewById(R.id.date);
        TextView titleTV = (TextView) convertView.findViewById(R.id.title);
        TextView authorTV = (TextView) convertView.findViewById(R.id.author);
        sectionTV.setText(news.getSection());
        dateTV.setText(news.getDate());
        titleTV.setText(news.getTitle());
        authorTV.setText(news.getAuthor());
        return convertView;
    }
}