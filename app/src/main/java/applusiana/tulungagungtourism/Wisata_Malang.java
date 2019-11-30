package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Wisata_Malang extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata__malang);

        text = findViewById(R.id.mlg);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void Kota (View theButton){
        Intent Kota = new Intent(Wisata_Malang.this,KotaMalang.class);
        startActivity(Kota);
    }

    public void Kabupaten (View theButton){
        Intent Kab = new Intent(Wisata_Malang.this,KabMalang.class);
        startActivity(Kab);
    }

    public void Batu (View theButton){
        Intent Batu = new Intent(Wisata_Malang.this,KotaBatu.class);
        startActivity(Batu);
    }
}
