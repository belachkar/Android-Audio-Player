package io.github.belachkar.audioplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        mp = MediaPlayer.create(this, R.raw.la_victoire);
    }

    public void play(View view) {
        mp.start();
    }

    public void pause(View view) {
        mp.pause();
    }
}
