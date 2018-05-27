package magtu.com.example.alphabet;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import magtu.com.example.alphabet.R;

public class HelloSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_splash_screen);

        ImageView background = findViewById(R.id.background),
                icon_a = findViewById(R.id.splash_a),
                icon_b = findViewById(R.id.splash_l);
        background.setColorFilter(Color.argb(200,0,0,0),
                PorterDuff.Mode.SRC_ATOP);

        Animation a = AnimationUtils.loadAnimation(this, R.anim.splash_a),
                b = AnimationUtils.loadAnimation(this, R.anim.splash_b),
                splash = AnimationUtils.loadAnimation(this, R.anim.splash);

        background.startAnimation(splash);
        icon_a.startAnimation(a);
        icon_b.startAnimation(b);
        hideUI();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(HelloSplashScreen.this,
                        MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, 3500);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideUI();
    }

    @Override
    protected void onPause() {
        super.onPause();
        hideUI();
    }

    private void hideUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
