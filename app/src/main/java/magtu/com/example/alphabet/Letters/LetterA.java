package magtu.com.example.alphabet.Letters;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

import java.util.Locale;
import magtu.com.example.alphabet.R;

public class LetterA extends AppCompatActivity {

    ImageView image_touch;
    TextToSpeech textToSpeech;
    int language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_a);
        hideUI();

        image_touch = findViewById(R.id.image_touch);
        Animation mEnlargeAnimation = AnimationUtils.loadAnimation(this, R.anim.touch_up);

        image_touch.startAnimation(mEnlargeAnimation);

        // Voice recognition
        textToSpeech = new TextToSpeech(LetterA.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    language = textToSpeech.setLanguage(Locale.US);
                } else {
                    Toast.makeText(getApplicationContext(), "Not Supporting",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        hideUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideUI();
    }

    public void voiceLetterA(View view) {
        switch (view.getId()) {
            case R.id.image_apple_phonetic:
                if (language == TextToSpeech.LANG_NOT_SUPPORTED
                        || language == TextToSpeech.LANG_MISSING_DATA)
                    Toast.makeText(getApplicationContext(), "Not Supporting",
                            Toast.LENGTH_SHORT).show();
                textToSpeech.setSpeechRate(0.6f);
                textToSpeech.speak("Apple", TextToSpeech.QUEUE_FLUSH,
                        null, null);
                break;

            case R.id.xcross:
                finish();
                break;
        }
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
