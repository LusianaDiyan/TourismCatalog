package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class wisata_pacitan extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_pacitan);

        text = findViewById(R.id.pctn);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void airPacitan (View theButton){
        Intent air = new Intent(wisata_pacitan.this,air_pacitan.class);
        startActivity(air);
    }

    public void daratPacitan (View theButton){
        Intent darat = new Intent(wisata_pacitan.this,darat_pacitan.class);
        startActivity(darat);
    }
}
