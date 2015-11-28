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

public class Globbie extends ActionBarActivity {

    ImageButton starter, bossMan, cat, fuufa, gremlin, globbie, robo, plantea, enigma;
    TextView quote;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_globbie);

        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewGlobbie);
        globbie = (ImageButton) findViewById(R.id.imageButtonGlobbie);

        setupGlobbie();

        //text and starter robo actions
        globbie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==globbie){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "Your body is in flux for the rest of your life. Think of your body as fluid instead of static — it’s always going to change. So get comfortable with those changes.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "No one will love you or not love you because of your body. You are lovable because you’re you, not because your body looks a certain way.";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "The most intensely personal relationship you’ll ever have is with your body. It’s a lifelong relationship that’s well worth investing in and nurturing the same way you would with loved ones.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "You don’t owe your body to anyone. Not sexually, not aesthetically. Your body is yours. Period.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "What someone else says about your body says more about them than it does about you. Look past the actual snark to the person who’s saying it, because it’s only a reflection of what they think of themselves. That’s when you’ll see how little power their words have.";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "Your body is not a reflection of your character. It’s a physical home for the complex and wondrous and unique being that is you.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Your body is a priority. It’s always trying to tell you things. Taking the time to listen to is of the utmost importance.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });

    }

    private void setupGlobbie(){

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(Globbie.this, Enigma.class);
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
                    Intent intent = new Intent(Globbie.this, Plantea.class);
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
                    Intent intent = new Intent(Globbie.this, GodlyGremlin.class);
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
                    Intent intent = new Intent(Globbie.this, Fuufa.class);
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
                    Intent intent = new Intent(Globbie.this, GalaxyCat.class);
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
                    Intent intent = new Intent(Globbie.this, BossMan.class);
                    startActivityForResult(intent,0);
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
                    Intent intent = new Intent(Globbie.this, MainActivity.class);
                    startActivityForResult(intent, 0);
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
