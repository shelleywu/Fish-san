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

public class Fuufa extends ActionBarActivity {
    ImageButton gremlin, bossMan, cat, fuufa, robo, globbie, enigma, plantea;
    TextView quote;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuufa);
        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewFuufa);
        fuufa = (ImageButton) findViewById(R.id.imageButtonFuufa);

        setupFuufa();

        //text and starter robo actions
        fuufa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==fuufa){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "Dream on, and dream big.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Make sure to sleep 8-9 hours, you'll thank me!";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "During sleep, your body does its best to heal you.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Sleep is nice. You're nice. You deserve some niceness, so go to sleep.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "ZZzzZZZZZZ....";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "If you ccan dream it, you can do it!";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Live your dreams~~~.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });


    }

    private void setupFuufa(){

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(Fuufa.this, Enigma.class);
                    startActivityForResult(intent, 0);
                }

            }
        });

        //goes to plantea
        plantea = (ImageButton) findViewById(R.id.imageButtonTea);
        plantea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==plantea){
                    finish();
                    Intent intent = new Intent(Fuufa.this, Plantea.class);
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
                    Intent intent = new Intent(Fuufa.this, Globbie.class);
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
                    Intent intent = new Intent(Fuufa.this, GodlyGremlin.class);
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
                    Intent intent = new Intent(Fuufa.this, MainActivity.class);
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
                    Intent intent = new Intent(Fuufa.this, GalaxyCat.class);
                    startActivityForResult(intent,0);
                }
            }
        });

        //boss man
        bossMan = (ImageButton) findViewById(R.id.imageButtonBossMan);
        bossMan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==bossMan){
                    finish();
                    Intent intent = new Intent(Fuufa.this, BossMan.class);
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
