package com.example.administrator.sildingmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2015/11/12.
 */
public class SlidingMenu extends HorizontalScrollView {

    private int mScreenWidth;
    private int mMenuRightPadding =50;
    private int mMenuWidth;
    private int mHalfMenuWidth;
    private boolean once;

    public SlidingMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
//        mScreenWidth = Screenu
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!once) {
            LinearLayout wrapper = (LinearLayout) getChildAt(0);
            ViewGroup menu = (ViewGroup) wrapper.getChildAt(0);
            ViewGroup content = (ViewGroup) wrapper.getChildAt(1);

//            mMenuRightPadding=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,m)
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
