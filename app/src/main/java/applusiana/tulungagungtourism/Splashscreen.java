package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {

    TextView atas, bawah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        atas = findViewById(R.id.welcome);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/Bintar Regular.otf");
        atas.setTypeface(customfont);

        bawah = findViewById(R.id.east);
        Typeface customatas = Typeface.createFromAsset(getAssets(),"font/JMH THE SPIDER bold.otf");
        bawah.setTypeface(customatas);

        Thread timerThread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(Splashscreen.this,
                            MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }
}
