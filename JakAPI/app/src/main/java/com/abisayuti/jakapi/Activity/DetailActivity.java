package com.abisayuti.jakapi.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.abisayuti.jakapi.R;

public class DetailActivity extends AppCompatActivity {
    TextView dtlname,dtlalamat,dtlRTRW,dtllat,dtllong,dtkelurahan;
    String names,alamats,kelurahans,RtRws,lats,longs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dtlalamat = (TextView)findViewById(R.id.txtDetailAlamat);
        dtlname = (TextView)findViewById(R.id.txtDetailNamaPos);
        dtkelurahan = (TextView)findViewById(R.id.txtDetaiKelurahan);
        dtlRTRW = (TextView)findViewById(R.id.txtDetailRtRw);
        dtllat = (TextView)findViewById(R.id.txtDetailLat);
        dtllong = (TextView)findViewById(R.id.txtDetailLong);

        Intent aa = getIntent();
        names = aa.getStringExtra("pos");
        alamats = aa.getStringExtra("alamat");
        kelurahans = aa.getStringExtra("kelurahan");
        RtRws = aa.getStringExtra("RtRW");
        lats = aa.getStringExtra("lat");
        longs = aa.getStringExtra("long");

        dtlname.setText("Nama Pos "+ names);
        dtlalamat.setText("Alamat "+alamats);
        dtlRTRW.setText("RT RW "+RtRws);
        dtkelurahan.setText("Kelurahan "+kelurahans);
        dtllat.setText(lats);
        dtllong.setText(longs);

    }
}
