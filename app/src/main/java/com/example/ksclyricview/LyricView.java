package com.example.ksclyricview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class LyricView extends View {

    private TextPaint mTextPaint;

    private List<String> mLyrics;

    public void setLyrics(List<String> lyrics) {
        mLyrics.clear();
        mLyrics.addAll(lyrics);
    }

    public LyricView(Context context) {
        this(context, null);
    }

    public LyricView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        mLyrics = new ArrayList<>();

        mTextPaint = new TextPaint();
        mTextPaint.setStyle(Paint.Style.STROKE);
        mTextPaint.setAntiAlias(true);
        mTextPaint.setColor(Color.CYAN);
        mTextPaint.setTextSize(80);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.DKGRAY);

        String s = mLyrics.get(0);
        canvas.drawText(s, 100, 200, mTextPaint);
    }

}
