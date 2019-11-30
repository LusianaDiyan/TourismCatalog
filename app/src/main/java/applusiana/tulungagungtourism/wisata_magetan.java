package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class wisata_magetan extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_lamongan);

        text = findViewById(R.id.mgt);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void SejarahMagetan (View theButton){
        Intent sejarah = new Intent(wisata_magetan.this,sejarah_magetan.class);
        startActivity(sejarah);
    }

    public void AlamMagetan (View theButton){
        Intent alam = new Intent(wisata_magetan.this,alam_magetan.class);
        startActivity(alam);
    }

    public void BuatanMagetan (View theButton){
        Intent buatan = new Intent(wisata_magetan.this,buatan_magetan.class);
        startActivity(buatan);
    }
}
