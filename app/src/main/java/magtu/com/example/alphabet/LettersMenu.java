package magtu.com.example.alphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import magtu.com.example.alphabet.Letters.*;

/**
 * Menu letters activity
 */
public class LettersMenu extends AppCompatActivity {

    // Letter buttons
    ImageButton a, b, c, d, e, f, g, h, i, j, k, l, m, n,
                o, p, q, r, s, t, u, v, w, x, y, z;

    // Background image
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters_menu);
        hideUI();

        a = findViewById(R.id.buttonA);
        b = findViewById(R.id.buttonB);
        c = findViewById(R.id.buttonC);
        d = findViewById(R.id.buttonD);
        e = findViewById(R.id.buttonE);
        f = findViewById(R.id.buttonF);
        g = findViewById(R.id.buttonG);
        h = findViewById(R.id.buttonH);
        i = findViewById(R.id.buttonI);
        j = findViewById(R.id.buttonJ);
        k = findViewById(R.id.buttonK);
        l = findViewById(R.id.buttonL);
        m = findViewById(R.id.buttonM);
        n = findViewById(R.id.buttonN);
        o = findViewById(R.id.buttonO);
        p = findViewById(R.id.buttonP);
        q = findViewById(R.id.buttonQ);
        r = findViewById(R.id.buttonR);
        s = findViewById(R.id.buttonS);
        t = findViewById(R.id.buttonT);
        u = findViewById(R.id.buttonU);
        v = findViewById(R.id.buttonV);
        w = findViewById(R.id.buttonW);
        x = findViewById(R.id.buttonX);
        y = findViewById(R.id.buttonY);
        z = findViewById(R.id.buttonZ);

        background = findViewById(R.id.background_letter_menu);

        Animation mEnlargeAnimation = AnimationUtils.loadAnimation(this, R.anim.enlarge),
                back = AnimationUtils.loadAnimation(this, R.anim.background);

        a.startAnimation(mEnlargeAnimation);
        b.startAnimation(mEnlargeAnimation);
        c.startAnimation(mEnlargeAnimation);
        d.startAnimation(mEnlargeAnimation);
        e.startAnimation(mEnlargeAnimation);
        f.startAnimation(mEnlargeAnimation);
        g.startAnimation(mEnlargeAnimation);
        h.startAnimation(mEnlargeAnimation);
        i.startAnimation(mEnlargeAnimation);
        j.startAnimation(mEnlargeAnimation);
        k.startAnimation(mEnlargeAnimation);
        l.startAnimation(mEnlargeAnimation);
        m.startAnimation(mEnlargeAnimation);
        n.startAnimation(mEnlargeAnimation);
        o.startAnimation(mEnlargeAnimation);
        p.startAnimation(mEnlargeAnimation);
        q.startAnimation(mEnlargeAnimation);
        r.startAnimation(mEnlargeAnimation);
        s.startAnimation(mEnlargeAnimation);
        t.startAnimation(mEnlargeAnimation);
        u.startAnimation(mEnlargeAnimation);
        v.startAnimation(mEnlargeAnimation);
        w.startAnimation(mEnlargeAnimation);
        x.startAnimation(mEnlargeAnimation);
        y.startAnimation(mEnlargeAnimation);
        z.startAnimation(mEnlargeAnimation);
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

    // Touch listener to image buttons
    public void letters_menu_buttons(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.buttonA:
                intent = new Intent(this, LetterA.class);
                startActivity(intent);
                break;
            case R.id.buttonB:
                intent = new Intent(this, LetterB.class);
                startActivity(intent);
                break;
            case R.id.buttonC:
                intent = new Intent(this, LetterC.class);
                startActivity(intent);
                break;
            case R.id.buttonD:
                intent = new Intent(this, LetterD.class);
                startActivity(intent);
                break;
            case R.id.buttonE:
                intent = new Intent(this, LetterE.class);
                startActivity(intent);
                break;
            case R.id.buttonF:
                intent = new Intent(this, LetterF.class);
                startActivity(intent);
                break;
            case R.id.buttonG:
                intent = new Intent(this, LetterG.class);
                startActivity(intent);
                break;
            case R.id.buttonH:
                intent = new Intent(this, LetterH.class);
                startActivity(intent);
                break;
            case R.id.buttonI:
                intent = new Intent(this, LetterI.class);
                startActivity(intent);
                break;
            case R.id.buttonJ:
                intent = new Intent(this, LetterJ.class);
                startActivity(intent);
                break;
            case R.id.buttonK:
                intent = new Intent(this, LetterK.class);
                startActivity(intent);
                break;
            case R.id.buttonL:
                intent = new Intent(this, LetterL.class);
                startActivity(intent);
                break;
            case R.id.buttonM:
                intent = new Intent(this, LetterM.class);
                startActivity(intent);
                break;
            case R.id.buttonN:
                intent = new Intent(this, LetterN.class);
                startActivity(intent);
                break;
            case R.id.buttonO:
                intent = new Intent(this, LetterO.class);
                startActivity(intent);
                break;
            case R.id.buttonP:
                intent = new Intent(this, LetterP.class);
                startActivity(intent);
                break;
            case R.id.buttonQ:
                intent = new Intent(this, LetterQ.class);
                startActivity(intent);
                break;
            case R.id.buttonR:
                intent = new Intent(this, LetterR.class);
                startActivity(intent);
                break;
            case R.id.buttonS:
                intent = new Intent(this, LetterS.class);
                startActivity(intent);
                break;
            case R.id.buttonT:
                intent = new Intent(this, LetterT.class);
                startActivity(intent);
                break;
            case R.id.buttonU:
                intent = new Intent(this, LetterU.class);
                startActivity(intent);
                break;
            case R.id.buttonV:
                intent = new Intent(this, LetterV.class);
                startActivity(intent);
                break;
            case R.id.buttonW:
                intent = new Intent(this, LetterW.class);
                startActivity(intent);
                break;
            case R.id.buttonX:
                intent = new Intent(this, LetterX.class);
                startActivity(intent);
                break;
            case R.id.buttonY:
                intent = new Intent(this, LetterY.class);
                startActivity(intent);
                break;
            case R.id.buttonZ:
                intent = new Intent(this, LetterZ.class);
                startActivity(intent);
                break;
            case R.id.back_button:
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
