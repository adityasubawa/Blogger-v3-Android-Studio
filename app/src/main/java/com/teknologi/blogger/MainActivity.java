package com.teknologi.blogger;

/*
 * Created by Aditya Subawa
 * Product: Teknologi Informasi based on Blogger API v3
 * 13 Okt 2020, Denpasar, Bali - Indonesia
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import com.teknologi.adapter.PostAdapter;
import com.teknologi.api.PostList;
import com.teknologi.api.Api;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.postList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getData();

    }

    private void getData() {
        Call<PostList> postList = Api.getService().getPostList();
        postList.enqueue(new Callback<PostList>() {
            @Override
            public void onResponse(Call<PostList> call, Response<PostList> response) {
                PostList list = response.body();
                recyclerView.setAdapter(new PostAdapter(MainActivity.this, list.getItems()));

            }

            @Override
            public void onFailure(Call<PostList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error Occured Here", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
