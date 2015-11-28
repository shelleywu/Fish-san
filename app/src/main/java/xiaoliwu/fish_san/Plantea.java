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

public class Plantea extends ActionBarActivity {

    ImageButton starter, bossMan, cat, fuufa, gremlin, globbie, plantea, robo, enigma;
    TextView quote;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantea);

        //for the text and robo question
        quote = (TextView) findViewById(R.id.textViewPlantea);
        plantea = (ImageButton) findViewById(R.id.imageButtonPlantea);

        setupPlantea();

        //text and starter robo actions
        plantea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(v==plantea){
                    counter++;
                    Context context = getApplicationContext();
                    CharSequence text = "Always focus on what you want rather than what you don’t want: The mistake that most of us make when having a problem is to talk about it over and over again instead of focusing on the end result, instead of focusing on what we want to achieve.";

                    double randomText = Math.random();

                    if(randomText >=0 && randomText < 0.1)
                    {
                        text = "Know that every problem comes with a lesson: There is always a lesson in everything that happens to us, and we should constantly look for what that lesson is and master it. For as Confucius said: “If you make a mistake and do not correct it, this is called a mistake.";
                        quote.setText(text);
                    }

                    if(randomText >=0.1 && randomText < 0.2)
                    {
                        quote.setText(text);
                    }

                    if(randomText >=0.2 && randomText < 0.3)
                    {
                        text = "Don’t believe everything you think: Our problems aren’t as big as the mind is trying to convince us, and if you choose to believe every negative though that goes through your mind, you will always get in trouble. Observe your mind, observe your thoughts, but don’t identify yourself with them. Go beyond them.";
                        quote.setText(text);
                    }

                    if(randomText >=0.4 && randomText < 0.5)
                    {
                        text = "Choose to express your gratitude for everything that happens to you, whether good or bad, and also for every person you interact with: The more you choose to express your gratitude, the more reasons you will have to express your gratitude for, and when you’re too busy focusing on the many things that you are grateful for, there will be no more room left for stress and worry.";
                        quote.setText(text);
                    }

                    if(randomText >=0.6 && randomText < 0.7)
                    {
                        text = "Know that there is a reason for everything: Everything that happens to you, happens for a reason and every person that enters your life enters for a reason, and it’s your responsibility to act upon this knowing and not to label them as being good or bad, negative or positive, etc.";
                        quote.setText(text);
                    }

                    if(randomText >=0.8 && randomText < 0.9)
                    {
                        text = "Let go of your need for perfection: When you try to do everything perfect, you will meet with stress and frustration – as it’s impossible to be perfect in everything you do.";
                        quote.setText(text);
                    }

                    if(randomText >=0.9 && randomText <= 1)
                    {
                        text = "Let go of your resistance: Accept things as they are without you trying to change them, without trying to fight against them. Go with the flow, and know that life wasn’t meant to be a struggle all the time.";
                        quote.setText(text);
                    }

                    final Toast toast = Toast.makeText(context, "+"+counter, Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });

    }

    private void setupPlantea(){

        //goes to enigma
        enigma = (ImageButton) findViewById(R.id.imageButtonHamburger);
        enigma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(v==enigma){
                    finish();
                    Intent intent = new Intent(Plantea.this, Enigma.class);
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
                    Intent intent = new Intent(Plantea.this, MainActivity.class);
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
                    Intent intent = new Intent(Plantea.this, Globbie.class);
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
                    Intent intent = new Intent(Plantea.this, GodlyGremlin.class);
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
                    Intent intent = new Intent(Plantea.this, Fuufa.class);
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
                    Intent intent = new Intent(Plantea.this, GalaxyCat.class);
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
                    Intent intent = new Intent(Plantea.this, BossMan.class);
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
