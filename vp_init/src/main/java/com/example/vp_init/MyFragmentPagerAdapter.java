package com.example.vp_init;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import java.util.List;

// 同学们： 这就是为了给ViewPager显示的 适配器，来适配显示Fragment的Item页面数据
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = MyFragmentPagerAdapter.class.getSimpleName();

    private List<Fragment> fragmentList;

    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> flist) {
        super(fm);
        fragmentList = flist;
    }

    @Override
    public Fragment getItem(int i) {
        Log.v(TAG, "getItem: " + i);
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    // 早期 Android   监听 ViewPager 的 Item  什么时候移除  记录下标
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
