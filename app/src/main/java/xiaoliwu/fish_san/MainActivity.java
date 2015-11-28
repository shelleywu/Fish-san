package xiaoliwu.fish_san;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ImageButton starter, bossMan, cat, fuufa, gremlin, globbie, enigma, plantea;
    TextView quote;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewStart);
        starter = (ImageButton) findViewById(R.id.imageButtonStart);

        setupBossMan();

        //text and starter robo actions
        starter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==starter){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "Your presence can make someone’s day a little bit better.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Sometimes being selfish is okay, you can’t always let people have their way.";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "Not everyone likes the things you do, and that’s okay.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Smiling makes you feel better and also makes the people around you feel better too.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "Those people aren’t judging you, stop being so hard on yourself.";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "Best to know for sure than letting your imagination run wild.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Don't be sorry for your own feelings.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });

    }

    private void setupBossMan(){

        //goes to plantea
        plantea = (ImageButton) findViewById(R.id.imageButtonTea);
        plantea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==plantea){
                    finish();
                    Intent intent = new Intent(MainActivity.this, Plantea.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(MainActivity.this, Enigma.class);
                    startActivityForResult(intent, 0);
                }

            }
        });


        //goes to globbie
        globbie = (ImageButton) findViewById(R.id.imageButtonRamen);
        globbie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==globbie){
                    finish();
                    Intent intent = new Intent(MainActivity.this, Globbie.class);
                    startActivityForResult(intent, 0);
                }

            }
        });


        //goes to Gremlin
        gremlin = (ImageButton)findViewById(R.id.imageButtonLeaf);
        gremlin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==gremlin)
                {
                    finish();
                    Intent intent = new Intent(MainActivity.this, GodlyGremlin.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

        //goes to fuufa
        fuufa = (ImageButton) findViewById(R.id.imageButtonSushi);
        fuufa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==fuufa){
                    finish();
                    Intent intent = new Intent(MainActivity.this, Fuufa.class);
                    startActivityForResult(intent, 0);
                }
            }
        });


        //goes to cat
        cat = (ImageButton) findViewById(R.id.imageButtonCatFish);
        cat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==cat){
                    finish();
                    Intent intent = new Intent(MainActivity.this, GalaxyCat.class);
                    startActivityForResult(intent,0);
                }
            }
        });

        //second activity boss man
        bossMan = (ImageButton) findViewById(R.id.imageButtonBossMan);
        bossMan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==bossMan){
                    finish();
                    Intent intent = new Intent(MainActivity.this, BossMan.class);
                    startActivityForResult(intent,0);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
