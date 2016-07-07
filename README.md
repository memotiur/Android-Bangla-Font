### Android-Bangla-Font
Here is the example, how to use custom Bangla font in android apps.

```java
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
```
