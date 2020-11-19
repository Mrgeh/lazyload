package com.xtjc.lazyload.vp2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiangxue.derry.lazyload.FragmentDelegater;
import com.xiangxue.derry.lazyload.R;
import com.xiangxue.derry.lazyload.base.LazyFragment5;

public class Fragment2_vp_4 extends LazyFragment5 {

    public static Fragment newIntance() {
        Fragment2_vp_4 fragment = new Fragment2_vp_4();
        fragment.setFragmentDelegater(new FragmentDelegater(fragment));
        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_vp_4;
    }

    @Override
    protected void initView(View view) { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
