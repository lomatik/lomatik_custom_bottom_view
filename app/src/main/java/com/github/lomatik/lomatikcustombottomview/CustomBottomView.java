package com.github.lomatik.lomatikcustombottomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class CustomBottomView extends View {
    Button button1;
    Button button2;
    Paint paint = new Paint();
    public CustomBottomView(Context context) {
        super(context);
    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs,
                R.styleable.CustomBottomView);
        int center_size = typedArray.getInt(R.styleable.CustomBottomView_centralsize,0);
        typedArray.recycle();
        int width;

    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomBottomView(Context context, @Nullable AttributeSet attrs,
                            int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int radius = y;

        paint.setColor(Color.parseColor("#FFFFFFBB"));
        canvas.drawCircle(x,y,radius,paint);
    }
}
