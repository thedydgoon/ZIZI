package com.thedyd.zizi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    private RecyclerView mRecyclerSearchView;
    private RecyclerViewSearchAdapter mRecyclerViewSearchAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ImageView zizi_search;
    ImageView hash_tag_image;

    public SearchFragment() {
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
        View v = inflater.inflate(R.layout.fragment_search,container,false);

        //지지검색
        zizi_search = (ImageView) v.findViewById(R.id.zizi_search);
        zizi_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);

            }
        });

        //태그클릭
        hash_tag_image = (ImageView) v.findViewById(R.id.hash_tag_image);
        hash_tag_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SearchHashActivity.class);
                startActivity(intent);

            }
        });



        setupRecyclerSearchView(v);

        return v;
    }

    private void setupRecyclerSearchView(View v){

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerSearchView = (RecyclerView) v.findViewById(R.id.search_recycler_view);
        mRecyclerSearchView.setHasFixedSize(true);
        mRecyclerSearchView.setLayoutManager(mLayoutManager);

        ArrayList<SearchHash> searchHash = new ArrayList<SearchHash>();

        for( int i=0; i<18; i++){

            searchHash.add( new SearchHash(

                    "Title"+i,
                    i,
                    R.drawable.test1,
                    R.drawable.test1,
                    R.drawable.test1

            ));

        }

        mRecyclerViewSearchAdapter = new RecyclerViewSearchAdapter(searchHash);
        mRecyclerSearchView.setAdapter(mRecyclerViewSearchAdapter);
        mRecyclerViewSearchAdapter.notifyDataSetChanged();

    }

}
