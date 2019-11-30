package applusiana.tulungagungtourism;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Wisata_Lainnya extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata__lainnya);

        text = findViewById(R.id.jatim);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void alamJatim (View theButton){
        Intent alam = new Intent(Wisata_Lainnya.this,AlamJatim.class);
        startActivity(alam);
    }

    public void sejarahJatim (View theButton){
        Intent sejarah = new Intent(Wisata_Lainnya.this,sejarahJatim.class);
        startActivity(sejarah);
    }

    public void buatanJatim (View theButton){
        Intent buatan = new Intent(Wisata_Lainnya.this,buatanJatim.class);
        startActivity(buatan);
    }
}
