package io.github.mayubao.kuaichuan.ui.view;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

/**
 * 测试Behavior的类

 */
public class MyFloatingButtonBehavior extends CoordinatorLayout.Behavior<AppCompatButton> {

    public MyFloatingButtonBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, AppCompatButton child, View dependency) {
//        return super.onDependentViewChanged(parent, child, dependency);
        if (dependency instanceof AppBarLayout) {

        }
        return false;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, AppCompatButton child, View dependency) {
//        return super.layoutDependsOn(parent, child, dependency);
        return dependency instanceof AppBarLayout;
    }
}
