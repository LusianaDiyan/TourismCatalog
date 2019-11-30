package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class wisata_surabaya extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_surabaya);

        text = findViewById(R.id.sby);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void sejarahSby (View theButton){
        Intent sejarah = new Intent(wisata_surabaya.this,sejarah_sby.class);
        startActivity(sejarah);
    }

    public void hiburanSby (View theButton){
        Intent hiburan = new Intent(wisata_surabaya.this,hiburan_sby.class);
        startActivity(hiburan);
    }
}
