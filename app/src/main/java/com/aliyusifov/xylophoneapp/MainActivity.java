package com.aliyusifov.xylophoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);

        mCSoundId = soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mASoundId = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = soundPool.load(getApplicationContext(),R.raw.note7_b,1);
        mESoundId = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mESoundId = soundPool.load(getApplicationContext(),R.raw.note3_e,1);

    }

    public void playC(View view) {
        soundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        soundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        soundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        soundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        soundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        soundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        soundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME  ,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}