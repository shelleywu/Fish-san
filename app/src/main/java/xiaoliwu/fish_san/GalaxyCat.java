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

public class GalaxyCat extends ActionBarActivity {

    ImageButton robo, cat, boss, fuufa, gremlin, globbie, enigma, plantea;
    TextView quote;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxy_cat);

        setupGalaxyCat();

        //for the text and cat question
        quote = (TextView) findViewById(R.id.textViewGalaxyCat);
        cat = (ImageButton) findViewById(R.id.imageButtonGalaxyCat);

        //text and starter boss actions
        cat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==cat){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "I've travelled far and beyond. I've never met anyone who is not at all important.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Small or big, your existence has a purpose and it does make a great impact.";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "You will persever and get through this!";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Stop focusing on negative energy and redirect into a positive force.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "I see all. I see that you're an extraordinary being.";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "The sky is not the limit. You are the one making the limits on yourself.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Even Eienstein asked quetsions. Stupid or not, just ask. Don't take it to heart if the answer hurts.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });


    }

    private void setupGalaxyCat(){

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(GalaxyCat.this, Enigma.class);
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
                    Intent intent = new Intent(GalaxyCat.this, Plantea.class);
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
                    Intent intent = new Intent(GalaxyCat.this, Globbie.class);
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
                    Intent intent = new Intent(GalaxyCat.this, GodlyGremlin.class);
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
                    Intent intent = new Intent(GalaxyCat.this, Fuufa.class);
                    startActivityForResult(intent, 0);
                }
            }
        });

        //goes back to boss
        boss = (ImageButton) findViewById(R.id.imageButtonBossMan);
        boss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(v==boss)
                {
                    finish();
                    Intent intent = new Intent(GalaxyCat.this, BossMan.class);
                    startActivityForResult(intent,0);
                }

            }
        });

        //goes back to robo
        robo = (ImageButton) findViewById(R.id.imageButtonSake);
        robo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==robo){
                    finish();
                    Intent intent = new Intent(GalaxyCat.this, MainActivity.class);
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
