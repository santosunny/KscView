package com.example.ksclyricview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class LyricView extends View {

    private String TAG = getClass().getSimpleName();

    private List<String> mLyrics;

    private TextPaint mTextPaint;
    private TextPaint mCurrentLineTextPaint;

    private int currentLineIndex = 0;

    private int colorBg = Color.parseColor("#000000");
    private int colorCurrentLine = Color.parseColor("#ff0033");
    private int colorOtherLines = Color.parseColor("#cc6699");

    private CountDownTimer countDownTimer;

    public void setLyrics(List<String> lyrics) {
        mLyrics.clear();
        mLyrics.addAll(lyrics);
        initCountDownTimer();
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
        mTextPaint.setStyle(Paint.Style.FILL);
        mTextPaint.setAntiAlias(true);
        mTextPaint.setColor(colorOtherLines);
        mTextPaint.setTextSize(50);

        mCurrentLineTextPaint = new TextPaint();
        mCurrentLineTextPaint.setStyle(Paint.Style.FILL);
        mCurrentLineTextPaint.setAntiAlias(true);
        mCurrentLineTextPaint.setColor(colorCurrentLine);
        mCurrentLineTextPaint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(colorBg);

        for (int i = 0; i < mLyrics.size(); i++) {
            String lyric = mLyrics.get(i);
            canvas.drawText(lyric, 100, i * 120 + 150,
                    currentLineIndex == i ? mCurrentLineTextPaint : mTextPaint);
        }

    }

    private void initCountDownTimer() {
        countDownTimer = new CountDownTimer(1000 * 60 * 10, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.e(TAG, millisUntilFinished + " ticked<<<");
                if (currentLineIndex <= mLyrics.size()) {
                    currentLineIndex++;
                } else {
                    currentLineIndex = 0;
                }
                Log.e(TAG, "current index is::" + currentLineIndex);
                postInvalidate();
            }

            @Override
            public void onFinish() {
            }
        };
        countDownTimer.start();
    }

}
