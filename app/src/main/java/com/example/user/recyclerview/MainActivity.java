package com.example.user.recyclerview;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private MyAdapter mAdapter;
    private int sortType = CityRepository.WITHOUT_ORDER;
    private String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        final RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MyAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_azsort:
                sortType = CityRepository.AZ_ORDER;
                break;
            case R.id.menu_popsort:
                sortType = CityRepository.HZ_ORDER;
                break;
            case R.id.menu_randsort:
                sortType = CityRepository.WITHOUT_ORDER;
                break;
        }
        updateList();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.setmDataset(CityRepository.getInstance().getCities(sortType));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(state, sortType);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        sortType = savedInstanceState.getInt(state);
    }

    private void updateList() {
        mAdapter.setmDataset(CityRepository.getInstance().getCities(sortType));
        mAdapter.notifyDataSetChanged();
    }
}
