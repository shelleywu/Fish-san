package xiaoliwu.fish_san;


import android.support.v7.app.ActionBarActivity;
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

public class Enigma extends ActionBarActivity {
    ImageButton starter, bossMan, cat, fuufa, gremlin, globbie, enigma, plantea, robo;
    TextView quote;
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigma);
        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewEnigma);
        enigma = (ImageButton) findViewById(R.id.imageButtonEnigma);

        setupEnigma();

        //text and starter robo actions
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==enigma){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "Fear less, love more.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Frown less, smile more.";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "Talk less, listen more.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Judge less, accept more.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "Complain less, appreciate more.";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "Speak less, do more.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Doubt less, trust more.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });


    }

    private void setupEnigma(){

        //goes to plantea
        plantea = (ImageButton) findViewById(R.id.imageButtonTea);
        plantea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==plantea){
                    finish();
                    Intent intent = new Intent(Enigma.this, Plantea.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

        //goes to robo
        robo = (ImageButton) findViewById(R.id.imageButtonSake);
        robo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v == robo){
                    finish();
                    Intent intent = new Intent(Enigma.this, MainActivity.class);
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
                    Intent intent = new Intent(Enigma.this, Globbie.class);
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
                    Intent intent = new Intent(Enigma.this, GodlyGremlin.class);
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
                    Intent intent = new Intent(Enigma.this, Fuufa.class);
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
                    Intent intent = new Intent(Enigma.this, GalaxyCat.class);
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
                    Intent intent = new Intent(Enigma.this, BossMan.class);
                    startActivityForResult(intent,0);
                }
            }
        });
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
