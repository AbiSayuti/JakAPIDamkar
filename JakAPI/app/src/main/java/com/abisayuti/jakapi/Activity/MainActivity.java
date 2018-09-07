package com.abisayuti.jakapi.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.abisayuti.jakapi.Adapter.CustomAdapter;
import com.abisayuti.jakapi.Model.DataItem;
import com.abisayuti.jakapi.Model.ResponsePostDamkar;
import com.abisayuti.jakapi.Network.ApiService;
import com.abisayuti.jakapi.Network.InstanceRetrofit;
import com.abisayuti.jakapi.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.RcViewDakar)
    RecyclerView RcViewDakar;
    private String token = "ljLu2zZ5/QYExUMVGhIKehc0btcIkAVpgDCYkPzTMoHHl9Mi0s9ZZAiYXD9v3sEH";
    List<DataItem> dataPos;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
        RcViewDakar = (RecyclerView) findViewById(R.id.RcViewDakar);
        getDakar();
    }

    private void getDakar() {
        ApiService api = InstanceRetrofit.getInstance();
        Call<ResponsePostDamkar> call = api.requestPostPemadam(token);
        call.enqueue(new Callback<ResponsePostDamkar>() {
            @Override
            public void onResponse(Call<ResponsePostDamkar> call, Response<ResponsePostDamkar> response) {
                if (response.body().getStatus().equals("success")) {
                    if (response.body().getStatus().equals("success")) {
                        dataPos = response.body().getData();
                        adapter = new CustomAdapter(MainActivity.this, dataPos);
                        RcViewDakar.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        RcViewDakar.setAdapter(adapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponsePostDamkar> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
