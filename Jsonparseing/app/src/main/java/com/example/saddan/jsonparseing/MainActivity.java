package com.example.saddan.jsonparseing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{    ArrayList<String> flowerList;
   ListView flowerNameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit= new Retrofit.Builder().
        baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        flowerNameTV=findViewById(R.id.ListViewTV);

        Api api=retrofit.create(Api.class);

        Call<ArrayList<Flower>> call=api.getFlowerList();

        call.enqueue(new Callback<ArrayList<Flower>>() {
            @Override
            public void onResponse(Call<ArrayList<Flower>> call, Response<ArrayList<Flower>> response)
            {
                ArrayList<Flower> flowerArrayList=response.body();

                Toast.makeText(getApplicationContext(), flowerArrayList.size()+"", Toast.LENGTH_SHORT).show();
                for(Flower flower:flowerArrayList)
                {
                    flowerList.add(flower.getName());
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,flowerList);
               flowerNameTV.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Flower>> call, Throwable throwable) {
                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
