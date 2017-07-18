package com.aldofieuw.android.newsapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        String formatdate = formatDate(currentNews.getDate());
        date.setText(formatdate);

        return listItemView;
    }

    private String formatDate(String date) {
        String unformattedDate = date;
        String subDate = unformattedDate.substring(0,10);
        String subTime = unformattedDate.substring(11,16);
        return subDate + "\n" + subTime;
    }
}
