package com.example.myinsta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myinsta.Adapter.ViewPagerChatAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainChatActivity extends AppCompatActivity {

    private TabLayout mTablayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);

        mTablayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        ViewPagerChatAdapter viewPagerChatAdapter = new ViewPagerChatAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerChatAdapter);

        mTablayout.setupWithViewPager(viewPager);


    }
}