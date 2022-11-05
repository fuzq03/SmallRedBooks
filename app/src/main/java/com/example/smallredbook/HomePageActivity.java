package com.example.smallredbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Here", "2222222222222222222");
        setContentView(R.layout.activity_home_page);
        Log.d("Here", "1111111111111111111");

        //获取navController
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);


    }
}