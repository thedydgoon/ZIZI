package com.thedyd.zizi;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewMyGalleryAdapter extends RecyclerView.Adapter<RecyclerViewMyGalleryAdapter.ViewHolder> {

    private Context context;
    private ArrayList<MyGallery> myGallery;
    public RecyclerViewMyGalleryAdapter(ArrayList<MyGallery> myGallery) {

        this.myGallery = myGallery;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mygalleryProfile;

        public View view;
        public ViewHolder(View v) {
            super(v);

            mygalleryProfile = (ImageView) v.findViewById(R.id.mygallery_profile);


            view = v;
        }

        public ImageView getMygalleryProfile() {
            return mygalleryProfile;
        }

    }

    @Override
    public RecyclerViewMyGalleryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mygallery_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.getMygalleryProfile().setImageResource(myGallery.get(position).getGalleryProfile());

        TextView galleryTitle = (TextView)holder.view.findViewById(R.id.mygallery_title);
        TextView gallerySubTitle = (TextView)holder.view.findViewById(R.id.mygallery_sub_title);

        galleryTitle.setText(String.valueOf(myGallery.get(position).getGalleryTitle()));
        gallerySubTitle.setText(String.valueOf(myGallery.get(position).getGallerySubtitle()));

       if(position==0){
           holder.view.setBackgroundColor(Color.WHITE);
       }

       /* switch( position ){
            case 0 :
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION0));
                break;
            case 1 :
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION1));
                break;
            case 2 :
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION2));
                break;
            case 3 :
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION3));
                break;
            case 4 :
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION4));
                break;
            default:
                holder.view.setBackgroundColor(Integer.parseInt(CM_MYGALLERY_POSITION0));
                break;
        }*/

    }


    @Override
    public int getItemCount() {
        return myGallery.size();
    }


}
