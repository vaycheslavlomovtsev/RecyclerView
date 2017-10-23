package com.example.user.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private CityAdapter Adapter;
    private int sortType = CityRepository.WITHOUT_ORDER;
    private String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar Toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(Toolbar);

        final RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        Adapter = new CityAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(Adapter);
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
        updateList();
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
        Adapter.setDataset(CityRepository.getInstance().getCities(sortType));

    }

}
