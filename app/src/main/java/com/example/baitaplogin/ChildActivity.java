package com.example.baitaplogin;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.baitaplogin.adapter.CustomAdapter;
import com.example.baitaplogin.model.Coffee;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ChildActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        ArrayList<Coffee> arrayList = new ArrayList<>();
        lv = (ListView) findViewById(R.id.lv);
        Coffee coffee1 = new Coffee(Color.parseColor("#e7008a"),"Coffee Đen Đá","8.000 đ");
        Coffee coffee2 = new Coffee(Color.parseColor("#e7008a"),"Coffee Sữa Đá","10.000 đ");
        Coffee coffee3 = new Coffee(Color.parseColor("#e7008a"),"Coffee Đen sài gòn","13.000 đ");
        Coffee coffee4 = new Coffee(Color.parseColor("#e7008a"),"Coffee Cốt dừa","15.000 đ");
        Coffee coffee5 = new Coffee(Color.parseColor("#e7008a"),"Coffee Sương sáo","15.000 đ");
        Coffee coffee6 = new Coffee(Color.parseColor("#e7008a"),"Coffee Sữa sài gòn","15.000 đ");
        Coffee coffee7 = new Coffee(Color.parseColor("#e7008a"),"Trà chanh gừng xã","15.000 đ");
        Coffee coffee8 = new Coffee(Color.parseColor("#e7008a"),"Trà ô long đào","15.000 đ");
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.item_listview,arrayList);
        arrayList.add(coffee1);
        arrayList.add(coffee2);
        arrayList.add(coffee3);
        arrayList.add(coffee4);
        arrayList.add(coffee5);
        arrayList.add(coffee6);
        arrayList.add(coffee7);
        arrayList.add(coffee8);
        lv.setAdapter(customAdapter);


        //bottom nav
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.ic_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        return  true;
                    case R.id.ic_contact:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
