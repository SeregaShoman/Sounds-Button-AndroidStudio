package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
                            implements SoundPool.OnLoadCompleteListener{
    private SoundPool mSoundPool;
    private  int mClapSound, mVoiceSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, O);
        mSoundPool.setOnLoadCompleteListener(this);

        mVoiceSound = mSoundPool.load(this, R.raw.kamera-motor, 1);
        mClapSound = mSoundPool.load(this, R.raw.O5O62, 1);
    }


    public void onClick (View view) {
        mSoundPool.play(mVoiceSound, 1, 1, 0, 0, 1);
        mSoundPool.play(mClapSound, 1, 1, 0, 0, 1);
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int i, int i1) {

    }
}