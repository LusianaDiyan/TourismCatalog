package applusiana.tulungagungtourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSurabayaClick (View theButton){
        Intent surabaya = new Intent(MainActivity.this,wisata_surabaya.class);
        startActivity(surabaya);
    }

    public void onMalangClick (View theButton){
        Intent malang = new Intent(MainActivity.this,Wisata_Malang.class);
        startActivity(malang);
    }

    public void onTulungagungClick (View theButton){
        Intent tulungagung = new Intent(MainActivity.this,kategori_wisata_TA.class);
        startActivity(tulungagung);
    }

    public void onMagetanClick (View theButton){
        Intent magetan = new Intent(MainActivity.this,wisata_magetan.class);
        startActivity(magetan);
    }

    public void onBanyuwangiClick (View theButton){
        Intent banyu = new Intent(MainActivity.this,wisata_banyuwangi.class);
        startActivity(banyu);
    }

    public void onPacitanClick (View theButton){
        Intent pacitan = new Intent(MainActivity.this,wisata_pacitan.class);
        startActivity(pacitan);
    }

    public void onOtherClick (View theButton){
        Intent other = new Intent(MainActivity.this,Wisata_Lainnya.class);
        startActivity(other);
    }

    public void onExitClick(View theButton){
        finish();
    }


}
