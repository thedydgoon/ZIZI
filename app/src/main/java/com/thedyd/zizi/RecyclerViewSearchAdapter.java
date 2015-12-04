package com.thedyd.zizi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeon Sung Yong on 2015-12-02.
 */
public class RecyclerViewSearchAdapter extends RecyclerView.Adapter<RecyclerViewSearchAdapter.ViewHolder>  {


    private Context context;
    private ArrayList<SearchHash> searchHash;
    public RecyclerViewSearchAdapter(ArrayList<SearchHash> searchHash) {
        this.searchHash = searchHash;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageONE;
        private ImageView imageTWO;
        private ImageView imageTHREE;

        private TextView titleHASH;

        public ViewHolder(View itemView) {
            super(itemView);

            imageONE = (ImageView) itemView.findViewById(R.id.template_image_one);
            imageTWO = (ImageView) itemView.findViewById(R.id.template_image_two);
            imageTHREE = (ImageView) itemView.findViewById(R.id.template_image_three);

        }

        public ImageView getImageONE() {
            return imageONE;
        }



        public ImageView getImageTWO() {
            return imageTWO;
        }

        public ImageView getImageTHREE() {
            return imageTHREE;
        }


        /*
        public View view;
        public ViewHolder(View v) {
            super(v);
            view = v;
        }
        */
    }



    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerViewSearchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        switch(viewType){

            case 1:
                View viewONE =  LayoutInflater.from(parent.getContext()).inflate(R.layout.search_template_one, parent, false);
                RecyclerViewSearchAdapter.ViewHolder templcateONE = new RecyclerViewSearchAdapter.ViewHolder(viewONE);
                return templcateONE;

            case 2:
                View viewTWO =  LayoutInflater.from(parent.getContext()).inflate(R.layout.search_template_two, parent, false);
                RecyclerViewSearchAdapter.ViewHolder templcateTWO = new RecyclerViewSearchAdapter.ViewHolder(viewTWO);
                return templcateTWO;

            case 3:
                View viewTHREE =  LayoutInflater.from(parent.getContext()).inflate(R.layout.search_template_three, parent, false);
                RecyclerViewSearchAdapter.ViewHolder templcateTHREE = new RecyclerViewSearchAdapter.ViewHolder(viewTHREE);
                return templcateTHREE;
        }

        return null;
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_view, parent, false);
        //ViewHolder vh = new ViewHolder(v);
        //return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        SearchHash singleModel;
        final int pos = position * 3;
        singleModel = searchHash.get(pos);
        holder.getImageONE().setImageResource(singleModel.getLatestImage1());

        singleModel =  searchHash.get(pos + 1);
        holder.getImageTWO().setImageResource(singleModel.getLatestImage2());


        singleModel =  searchHash.get(pos + 2);
        holder.getImageTHREE().setImageResource(singleModel.getLatestImage3());



        /*TextView hashTitle = (TextView)holder.view.findViewById(R.id.hashTitle);
        TextView totalCount = (TextView)holder.view.findViewById(R.id.totalCount);
        ImageView imageView2 = (ImageView) holder.view.findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) holder.view.findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) holder.view.findViewById(R.id.imageView4);

        hashTitle.setText(searchHash.get(position).getHashTitle());
        totalCount.setText(String.valueOf(searchHash.get(position).getTotalCount()));
        imageView2.setImageResource(searchHash.get(position).getLatestImage1());
        imageView3.setImageResource(searchHash.get(position).getLatestImage2());
        imageView4.setImageResource(searchHash.get(position).getLatestImage3());*/

    }

    @Override
    public int getItemCount() {
        return searchHash.size()/3;
    }

    @Override
    public int getItemViewType(int position) {

        if(position % 3 == 0){
            return 1;
        }else  if(position % 2 == 0){
            return 2;
        }else {
            return 3;
        }
    }

    public ArrayList<SearchHash> getSearchHash() {
        return searchHash;
    }



}
