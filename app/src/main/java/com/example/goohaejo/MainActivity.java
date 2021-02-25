package com.example.goohaejo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView iv_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home :
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        //인텐트 실행
                        startActivity(intent);
                        break;
                    case R.id.action_leave:
                        Intent intent1 = new Intent(MainActivity.this,MainLeave.class);
                        //인텐트 실행
                        startActivity(intent1);
                        break;
                    case R.id.action_chat :
                        Intent intent2 = new Intent(MainActivity.this,MainChat.class);
                        //인텐트 실행
                        startActivity(intent2);
                        break;
                    case R.id.action_setting :
                        Intent intent3 = new Intent(MainActivity.this,MainMypage.class);
                        //인텐트 실행
                        startActivity(intent3);
                        break;

                }
                return true;
            }
        });

        iv_add = findViewById(R.id.iv_add);
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //어디에서 어디로
                Intent intent = new Intent(MainActivity.this,RegiPostGuham.class);
                	//인텐트 실행
                	startActivity(intent);
            }
        });


    }

}