package com.c436.astropinkrobotburritorecords;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DrumMachine extends AppCompatActivity {

    SoundPool sp1;
    int idKick,idSnare,idHighHat,idTom,idTom2,idTom3,idShake,idLaugh,idBam,idBam2,idWeird,idWeird2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum_machine);

        sp1 = new SoundPool(12, AudioManager.STREAM_MUSIC,1);

        idKick = sp1.load(this,R.raw.kick,1);
        idSnare = sp1.load(this,R.raw.snare,1);
        idHighHat = sp1.load(this,R.raw.highhat,1);
        idTom = sp1.load(this,R.raw.tom,1);
        idTom2 = sp1.load(this,R.raw.tom2,1);
        idTom3 = sp1.load(this,R.raw.tom3,1);
        idShake = sp1.load(this,R.raw.shaker,1);
        idLaugh = sp1.load(this,R.raw.laugh,1);
        idBam = sp1.load(this,R.raw.bam,1);
        idBam2 = sp1.load(this,R.raw.bam2,1);
        idWeird = sp1.load(this,R.raw.weird,1);
        idWeird2 = sp1.load(this,R.raw.weird2,1);


    }

    public void triggerSound(View v) {
        switch (v.getId()) {
            case R.id.kick:
                sp1.play(idKick, 1, 1, 0, 0, 1);
                break;
            case R.id.snare:
                sp1.play(idSnare, 1, 1, 0, 0, 1);
                break;
            case R.id.highHat:
                sp1.play(idHighHat, 1, 1, 0, 0, 1);
                break;
            case R.id.tom1:
                sp1.play(idTom, 1, 1, 0, 0, 1);
                break;
            case R.id.tom2:
                sp1.play(idTom2, 1, 1, 0, 0, 1);
                break;
            case R.id.tom3:
                sp1.play(idTom3, 1, 1, 0, 0, 1);
                break;
            case R.id.shake:
                sp1.play(idShake, 1, 1, 0, 0, 1);
                break;
            case R.id.laugh:
                sp1.play(idLaugh, 1, 1, 0, 0, 1);
                break;
            case R.id.bam:
                sp1.play(idBam, 1, 1, 0, 0, 1);
                break;
            case R.id.bam2:
                sp1.play(idBam2, 1, 1, 0, 0, 1);
                break;
            case R.id.weird:
                sp1.play(idWeird, 1, 1, 0, 0, 1);
                break;
            case R.id.wierd2:
                sp1.play(idWeird2, 1, 1, 0, 0, 1);
                break;
        }
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        sp1.release();
        sp1 = null;
    }



}
