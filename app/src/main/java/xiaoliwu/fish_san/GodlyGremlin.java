package xiaoliwu.fish_san;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GodlyGremlin extends ActionBarActivity {

    ImageButton gremlin, bossMan, cat, fuufa, robo, globbie, plantea, enigma;
    TextView quote;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godly_gremlin);

        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewGod);
        gremlin = (ImageButton) findViewById(R.id.imageButtonGod);

        setupGodlyGremlin();

        //text and starter robo actions
        gremlin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==gremlin){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "OH. MY. GAWD. You did not do that! Ok. Ok. You can fix this. Calm down!";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Don't worry that you can't get it, gawd damn it!";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "Why don't you understand, gawd!? Just go on your own pace.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Gawd...you look tired. You should relax.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "Stop doing that, AH MY GAWD! Just stop! Self-control!";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "My gawd! You need more self-esteem.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Stop being such a gawd damn whinny baby! Use that energy to do something!";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });

    }

    private void setupGodlyGremlin(){

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(GodlyGremlin.this, Enigma.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, Plantea.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, Globbie.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, MainActivity.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, Fuufa.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, GalaxyCat.class);
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
                    Intent intent = new Intent(GodlyGremlin.this, BossMan.class);
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