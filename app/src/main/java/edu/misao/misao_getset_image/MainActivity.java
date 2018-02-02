package edu.misao.misao_getset_image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgMain,imgJpn,imgIta,imgCan,imgFra,imgInd,imgGer,imgBra,imgSpa,imgThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        imgMain = findViewById( R.id.imgMain );
        imgJpn = findViewById( R.id.imgJpn );
        imgIta = findViewById( R.id.imgIta );
        imgCan = findViewById( R.id.imgCan );
        imgFra = findViewById( R.id.imgFra );
        imgInd = findViewById( R.id.imgInd );
        imgGer = findViewById( R.id.imgGer );
        imgBra = findViewById( R.id.imgBra );
        imgSpa = findViewById( R.id.imgSpa );
        imgThi = findViewById( R.id.imgThi );

        imgJpn.setOnClickListener( this );
        imgIta.setOnClickListener( this );
        imgCan.setOnClickListener( this );
        imgFra.setOnClickListener( this );
        imgInd.setOnClickListener( this );
        imgGer.setOnClickListener( this );
        imgBra.setOnClickListener( this );
        imgSpa.setOnClickListener( this );
        imgThi.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imgJpn:imgMain.setImageResource( R.drawable.japan );break;
            case R.id.imgIta:imgMain.setImageResource( R.drawable.italy );break;
            case R.id.imgCan:imgMain.setImageResource( R.drawable.canada );break;
            case R.id.imgFra:imgMain.setImageResource( R.drawable.france );break;
            case R.id.imgInd:imgMain.setImageResource( R.drawable.india );break;
            case R.id.imgGer:imgMain.setImageResource( R.drawable.germany );break;
            case R.id.imgBra:imgMain.setImageResource( R.drawable.brazil );break;
            case R.id.imgSpa:imgMain.setImageResource( R.drawable.spain );break;
            case R.id.imgThi:imgMain.setImageResource( R.drawable.thai );break;
        }

    }
}
