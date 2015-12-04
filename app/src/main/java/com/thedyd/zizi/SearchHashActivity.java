package com.thedyd.zizi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

/**
 * Created by Jeon Sung Yong on 2015-12-03.
 */
public class SearchHashActivity extends AppCompatActivity {


    /*해시 테이블*/
    private RecyclerView mRecyclerSearchHashView;
    private RecyclerViewSearchHashAdapter mRecyclerViewSearchHashAdapter;
    private RecyclerView.LayoutManager mLayoutHashManager;

    /*그리드*/
    private RecyclerView mRecyclerGridView;
    private RecyclerView.LayoutManager mLayoutGridManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hash);

        setupRecyclerGridView();


    }

    private void setupRecyclerGridView(){

        mLayoutGridManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerGridView = (RecyclerView) findViewById(R.id.masonry_grid);
        mRecyclerGridView.setLayoutManager(mLayoutGridManager);

        MasonryAdapter adapter = new MasonryAdapter(this);
        mRecyclerGridView.setAdapter(adapter);
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        mRecyclerGridView.addItemDecoration(decoration);


    }



}
