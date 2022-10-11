package com.instant.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mainViewPager;
    private MainViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();

    }

    private void initViewPager(){
        viewPagerAdapter=new MainViewPagerAdapter(getSupportFragmentManager(),
                this.getLifecycle(),3);
        mainViewPager=findViewById(R.id.view_pager);
        mainViewPager.setAdapter(viewPagerAdapter);
        tabLayout=findViewById(R.id.tab_layout);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mainViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        mainViewPager.registerOnPageChangeCallback(onPageChangeCallback);
    }

    private ViewPager2.OnPageChangeCallback onPageChangeCallback=new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            tabLayout.selectTab(tabLayout.getTabAt(position));
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainViewPager.unregisterOnPageChangeCallback(onPageChangeCallback);
    }
}