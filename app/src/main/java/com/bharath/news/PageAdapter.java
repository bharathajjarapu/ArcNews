package com.bharath.news;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.bharath.news.category.Healths;
import com.bharath.news.category.Home;
import com.bharath.news.category.Entertainment;
import com.bharath.news.category.Science;
import com.bharath.news.category.Sports;
import com.bharath.news.category.Technology;

public class PageAdapter extends FragmentPagerAdapter {
    int tabCount;
    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Home();

            case 1:
                return new Sports();

            case 2:
                return new Healths();

            case 3:
                return new Science();

            case 4:
                return new Entertainment();

            case 5:
                return new Technology();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
