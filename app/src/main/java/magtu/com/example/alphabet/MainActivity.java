package magtu.com.example.alphabet;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.widget.*;

import java.util.Locale;

/**
 * Main menu activity
 */
public class MainActivity extends AppCompatActivity {

    // Header text
    TextView text_title;

    // Main menu buttons
    Button letters_button, about_button;

    // Google TTS engine
    TextToSpeech textToSpeech;

    // Background image
    ImageView background;

    // Language set up for TTS
    int language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_title = findViewById(R.id.text_title);
        background = findViewById(R.id.background);

        letters_button = findViewById(R.id.letters_button);
        about_button = findViewById(R.id.about_button);

        Animation enlarge = AnimationUtils.loadAnimation(this, R.anim.enlarge),
            back = AnimationUtils.loadAnimation(this, R.anim.background);

        // Google TTS engine set up
        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    language = textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(getApplicationContext(), "Not Supporting",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Copyright: Rerikh AVB-16-2. \n" +
                                "2018.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Hide all ui and go into fullscreen
        hideUI();
        // Start animations
        animate();

        letters_button.startAnimation(enlarge);
        about_button.startAnimation(enlarge);
        background.startAnimation(back);
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

    // Google TTS engine
    public void voice(View view) {
        switch (view.getId()) {
            case R.id.text_title:
                if (language == TextToSpeech.LANG_NOT_SUPPORTED
                        || language == TextToSpeech.LANG_MISSING_DATA)
                    Toast.makeText(getApplicationContext(), "Not Supporting",
                            Toast.LENGTH_SHORT).show();
                textToSpeech.setSpeechRate(0.7f);
                textToSpeech.speak(text_title.getText().toString(),
                        TextToSpeech.QUEUE_FLUSH, null, null);
                break;
        }
    }

    // Animate function
    private void animate() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.scaling);
        text_title.startAnimation(anim);
        background.startAnimation(anim);
    }

    // Touch listener for initialize letters menu activity
    public void MainActivityButtons(View view) {
        switch (view.getId()) {
            case R.id.letters_button:
                Intent intent = new Intent(this, LettersMenu.class);
                startActivity(intent);
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
