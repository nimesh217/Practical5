package com.kbs.practical5;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    SeekBar sred,sgreen,sblue;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sred=(SeekBar)findViewById(R.id.sbred);
        sgreen=(SeekBar)findViewById(R.id.sbgreen);
        sblue=(SeekBar)findViewById(R.id.sbblue);
        v =(View)findViewById(R.id.activity_main);

        sred.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                v.setBackgroundColor(Color.rgb(sred.getProgress(),sgreen.getProgress(),sblue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this,"RED = " + rv,Toast.LENGTH_SHORT).show();

            }
        });

        sgreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                v.setBackgroundColor(Color.rgb(sred.getProgress(),sgreen.getProgress(),sblue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this,"GREEN = " + gv,Toast.LENGTH_SHORT).show();

            }
        });

        sblue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                v.setBackgroundColor(Color.rgb(sred.getProgress(),sgreen.getProgress(),sblue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this,"BLUE = " + bv,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
