package com.github.lomatik.lomatikcustombottomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class CustomBottomView extends View {
    Button button1;
    Button button2;

    public CustomBottomView(Context context) {
        super(context);
    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


}
