package com.thedyd.zizi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeon Sung Yong on 2015-12-03.
 */
public class RecyclerViewSearchHashAdapter extends RecyclerView.Adapter<RecyclerViewSearchHashAdapter.ViewHolder> {


    private Context context;
    private ArrayList<SearchHashTag> searchHashTag;
    public RecyclerViewSearchHashAdapter(ArrayList<SearchHashTag> searchHashTag) {
        this.searchHashTag = searchHashTag;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public ViewHolder(View v) {
            super(v);
            view = v;
        }

    }

    @Override
    public RecyclerViewSearchHashAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_hash_horizontal_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TextView latest_hash_tag = (TextView)holder.view.findViewById(R.id.latest_hash_tag);
        latest_hash_tag.setText(searchHashTag.get(position).getHashTag());

    }

    @Override
    public int getItemCount() {
        return searchHashTag.size();
    }



}
