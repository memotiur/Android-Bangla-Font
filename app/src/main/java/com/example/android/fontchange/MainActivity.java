package com.example.android.fontchange;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int fontSize=20,fontHeader=24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void increment(View v){
        TextView txt=(TextView)findViewById(R.id.headLine);
        TextView txt2=(TextView)findViewById(R.id.paragraph);
        fontSize=fontSize+2;
        fontHeader+=2;
        txt2.setTextSize(fontSize);
        txt.setTextSize(fontHeader);
    }
    public void decrement(View v){
        TextView txt=(TextView)findViewById(R.id.headLine);
        TextView txt2=(TextView)findViewById(R.id.paragraph);
        fontSize=fontSize-2;
        fontHeader-=2;
        txt2.setTextSize(fontSize);
        txt.setTextSize(fontHeader);
    }
    public void changeFont(View v){
        TextView txt=(TextView)findViewById(R.id.headLine);
        TextView txt2=(TextView)findViewById(R.id.paragraph);
        Typeface font= Typeface.createFromAsset(getAssets(), "durga.ttf");
        txt.setTypeface(font);
        txt2.setTypeface(font);
    }

}
