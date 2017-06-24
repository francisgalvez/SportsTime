/*
 * Copyright (c) 2017 by Francis Gálvez
 */

package com.example.android.sportstime;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class NewsAdapter extends ArrayAdapter<News> {
    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of News, which is the data source of the adapter
     */
    NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of news.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;

        ViewHolder holder;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);

            holder = new ViewHolder();

            // Find the TextView with view ID title
            holder.titleView = (TextView) listItemView.findViewById(R.id.title);

            // Find the TextView with view ID author
            holder.sectionView = (TextView) listItemView.findViewById(R.id.section);

            // Find the TextView with view ID author
            holder.dateView = (TextView) listItemView.findViewById(R.id.date);

            listItemView.setTag(holder);
        } else {
            // view already exists, get the holder instance from the view
            holder = (ViewHolder) listItemView.getTag();
        }

        // Find the book at the given position in the list of News
        News currentNews = getItem(position);

        // Display the title of the current book in that TextView
        holder.titleView.setText(currentNews.getHeadline());

        // Display the author of the current book in that TextView
        holder.sectionView.setText(currentNews.getSection());

        // Display the publisher of the current book in that TextView
        holder.dateView.setText(currentNews.getDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    private static class ViewHolder {
        TextView titleView;
        TextView sectionView;
        TextView dateView;
    }
}
