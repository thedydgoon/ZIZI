package com.thedyd.zizi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MypageFragment extends Fragment{

    private RecyclerView mRecyclerMyGalleryView;
    private RecyclerViewMyGalleryAdapter mRecyclerViewMyGalleryAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    public MypageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mypage, container, false);

        setupRecyclerMyGalleryView(v);

        // Inflate the layout for this fragment
        return v;
    }

    private void setupRecyclerMyGalleryView(View v) {

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerMyGalleryView = (RecyclerView) v.findViewById(R.id.mypage_gallery_list);
        mRecyclerMyGalleryView.setHasFixedSize(true);
        mRecyclerMyGalleryView.setLayoutManager(mLayoutManager);

        ArrayList<MyGallery> myGallery = new ArrayList<MyGallery>();

        for( int i=0; i<5; i++){

            myGallery.add( new MyGallery(
                    "갤러리Title"+i,
                    "서브갤러리Title"+i,
                    R.drawable.gallery_photo
            ));

        }

        mRecyclerViewMyGalleryAdapter = new RecyclerViewMyGalleryAdapter(myGallery);
        mRecyclerMyGalleryView.setAdapter(mRecyclerViewMyGalleryAdapter);
        mRecyclerViewMyGalleryAdapter.notifyDataSetChanged();


    }

}
