package applusiana.tulungagungtourism;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class kategori_wisata_TA extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_wisata__t);

        text = findViewById(R.id.ta);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"font/JMH Zarracena Alt.otf");
        text.setTypeface(customfont);
    }

    public void alamTulungagung (View theButton){
        Intent alam = new Intent(kategori_wisata_TA.this,alam_tulungagung.class);
        startActivity(alam);
    }

    public void BuatanTulungagung (View theButton){
        Intent buatan = new Intent(kategori_wisata_TA.this,buatan_tulungagung.class);
        startActivity(buatan);
    }

    public void KampungTulungagung (View theButton){
        Intent kampung = new Intent(kategori_wisata_TA.this,kampung_tulungagung.class);
        startActivity(kampung);
    }

    public void SejarahTulungagung (View theButton){
        Intent sejarah = new Intent(kategori_wisata_TA.this,sejarah_tulungagung.class);
        startActivity(sejarah);
    }
}

/*public class kategori_wisata_TA extends ListActivity {
    String[] pilihan = {
            "Wisata Alam",
            "Wisata Buatan",
            "Wisata Sejarah",
            "Wisata Kampung"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_wisata__t);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, pilihan));
    }
    public void onListItemClick(ListView parent, View v, int urutan, long id){
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="Wisata Alam")
        {
            i = new Intent(kategori_wisata_TA.class)
        }
    }
}*/
