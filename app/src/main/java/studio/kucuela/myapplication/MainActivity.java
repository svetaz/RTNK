package studio.kucuela.myapplication;


import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;


import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.jrummyapps.android.animations.Technique;
import com.yalantis.phoenix.PullToRefreshView;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;




public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private TextView info;
    private EditText input;
    PullToRefreshView mPullToRefreshView;
    private com.github.clans.fab.FloatingActionButton menu_green;



    Spinner sp;
    ArrayAdapter<String> adapter;
    String numbers[] = { "","Bojana", "Bojana iz Slankamena", "Bojana iz Krčedina", "Bojana Čorbašilov (Kazahstan)", "Bojana Donosilac Kiše", "Divna Maletin", "Bojana predstavnik Vodenih Ljudi", "Karumba",
            "Tengba", "Pemba", "Minahonda", "Jajanda", "Svetozar", "Jorganče", "Sreten iz kupatila", "Gospodin sa bubama", "Advokat Krtinić", "Odvjetnik Krtilić","Gospodin Rtnić", "Kazuhiro", "Šojićiro",
            "Hirokazu", "Mario Japanac", "General Rivotril", "General Rivotrilko", "Generalko Rivotrilko", "Generalčić Rivotrilčić", "Dona Esperansa","Desanka sa ogledalima","Magacionerka Rajka"};

    Spinner sp1;
    ArrayAdapter<String> adapter1;
    String numbers1[] = { "","Savino Selo", "Kucura", "Vrbas", "Despotovo", "Beograd", "Novi Sad","Prolaz","Kuća deteta-ptice","Lažni prolaz","U autobusu","U vozu","Na biciklu",
            "U kolima","Negde u prirodi", "Odbijam da Vam dam lokaciju"};

    Spinner sp2;
    ArrayAdapter<String> adapter2;
    String numbers2[] = { "","Kučuela domaća tip A", "Kučuela domaća tip B (Šizela)", "Kučuela standardna", 
            "Zorka Crnogorka", "Kučuela ostalo", "Ekser", "Spid", "Muskatni oraščić", "Alkohol", "Ostalo"};

    Spinner sp6;
    ArrayAdapter<String> adapter6;
    String numbers6[] = { "","1","1.25", "1.5","1.75", "2","2.25", "2.5","2.75", "3","3.25", "3.5","3.75", "4","4.25", "4.5","4.75", "5"};

    Spinner sp7;
    ArrayAdapter<String> adapter7;
    String numbers7[] = {"", "1", "2", "3", "4", "Probilo!"};

    Spinner sp8;
    ArrayAdapter<String> adapter8;
    String numbers8[] = {"", "More", "Oblaci", "Olujno more", "Olujni oblaci"};

    Spinner sp9;
    ArrayAdapter<String> adapter9;
    String numbers9[] = {"", "Plava", "Bela", "Žuta", "Narandžasta", "Još uvek je dan"};

    Spinner sp10;
    ArrayAdapter<String> adapter10;
    String numbers10[] = {"", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna","Centralno"};

    Spinner sp10a;
    ArrayAdapter<String> adapter10a;
    String numbers10a[] = {"", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna","Centralno"};

    Spinner sp10b;
    ArrayAdapter<String> adapter10b;
    String numbers10b[] = {"", "Zalepilo me", "Ošajdarilo me", "Zakucalo me", "Išaketalo me", "Istabanalo me", "Urokalo me", "Pritislo me", "Izlopatalo me",};


    Spinner sp11;
    ArrayAdapter<String> adapter11;
    String numbers11[] = {"", "Visoka", "Standardna", "Niska", "Seoski konstantna"};

    Spinner sp12;
    ArrayAdapter<String> adapter12;
    String numbers12[] = { "","50", "100", "150", "200", "250", "300", "350", "400", "450","500"};

    Spinner sp13;
    ArrayAdapter<String> adapter13;
    String numbers13[] = {"", "10", "15", "20", "25", "30", "35", "40"};

    Spinner sp14;
    ArrayAdapter<String> adapter14;
    String numbers14[] = {"", "Na 9 sati", "Na 10 sati i 10 minuta","Na 11 sati i 5 minuta","Na 12 sati","Na 12 sati i 5 minuta","Na 12 sati i 15 minuta","Nogice u X"};


    Spinner sp16;
    ArrayAdapter<String> adapter16;
    String numbers16[] = {"Nemam ništa da dodam!"};

    Spinner sp17;
    ArrayAdapter<String> adapter17;
    String numbers17[] = {"","Konveksno (savijeno)", "Konkavno (kontra-savijeno)"};

    Spinner sp18;
    ArrayAdapter<String> adapter18;
    String numbers18[] = {"","Dobro","Loše","Neutralno","Čudno","Depresivno","Besno","Euforično","Histerično","Melanholično","Napaljeno","Gladno","Žedno","Umorno","Sveže","Bajato","Jedva gledam na oči",
    "Jedva stojim na nogama","Imao/la sam i boljih dana","Ne mogu da se sastavim","Ne znam di bijem","Sad sam ustao/la","Spičim ovu pa u krevet","Spičim ovu pa na posao","Spičim ovu pa na kurs",
    "Spičim ovu pa idem malo napolje"};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        info = (TextView) findViewById(R.id.info_text);
        input = (EditText)findViewById(R.id.editText11);







        // PULL TO REFRESH
        mPullToRefreshView = (PullToRefreshView) findViewById(R.id.pull_to_refresh);
        mPullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {



                mPullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        //REFRESH PULL ZA BRISANJE SVIH UNOSA BEZ RELOAD ACTIVITY
                        sp.setSelection(0,true);
                        sp1.setSelection(0,true);
                        sp2.setSelection(0,true);
                        sp6.setSelection(0,true);
                        sp7.setSelection(0,true);
                        sp8.setSelection(0,true);
                        sp9.setSelection(0,true);
                        sp10.setSelection(0,true);
                        sp10a.setSelection(0,true);
                        sp10b.setSelection(0,true);
                        sp11.setSelection(0,true);
                        sp12.setSelection(0,true);
                        sp13.setSelection(0,true);
                        sp14.setSelection(0,true);
                        sp16.setSelection(0,true);
                        sp17.setSelection(0,true);
                        sp18.setSelection(0,true);

                        ((EditText) findViewById(R.id.editText11)).setText("");

                        //View coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coord);
                        //Snackbar.make(coordinatorLayout, "Svi unosi su obrisani", Snackbar.LENGTH_LONG).show();

                        //REFRESH PULL ZA RANDOM NASLOV NA TOOLBARU

                        String[] r1 = new String[] {"Science is curiosity, testing and experimenting. \n~ Venkatraman Ramakrishnan","Bog je stvorio Kučuelu da usavršava vernike. \n~ Autor nepoznat",
                                "Za razliku od klasične lutrije u Kučueli svi dobijaju. \n~ Autor nepoznat","Postoje tri kosmosa u kosmosu i tri kosmosa izvan ovog kosmosa. \n~ Autor nepoznat",
                                "Postoje dani koji mogu da se vraćaju i dani koji ne mogu. \n~ Autor nepoznat","Kučuela je veza između svetova. \n~ Autor nepoznat",
                                "Prva limunada koju je Kučuela iscedila ljudima bila je voda sa vizijom. \n~ Autor nepoznat","Kučuela često ne zna gde udara,ali u svakom trenutku zna gde je naša glava. \n~ Autor nepoznat",
                                "Legenda kaže da će jednoga dana ogledalo Komisije biti razbijeno,a Komisija rasterana zauvek. \n~ Autor nepoznat","Komisija ima više od osam,a manje od jedanaest članova. \n~ Autor nepoznat",
                                "U Južne Krajeve mogu putovati samo oni koji spoznaše tajni nauk krompira \n~ Autor nepoznat","Duh kečapa se sastoji iz duha paradajza i duha samlevenosti. \n~ Autor nepoznat",
                                "Svet je mantil, a svaki mantil ima dve strane:spoljašnju i unutrašnju. \n~ Autor nepoznat","Da te nije Kučuela sunce ne bi sijalo. \n~ " +
                                "Autor nepoznat","Samo dobri ljudi mogu ulaziti u ptice. \n~ Autor nepoznat","Herb is the healing of a nation, alcohol is the destruction. \n~ Bob Marley",
                                "When you smoke the herb, it reveals you to yourself. \n~ Bob Marley","Is weed addictive? Yes, in the sense that most of the pleasant things in life are worth repeating. \n~ Richard Neville",
                                "People need to be educated to the fact that marijuana is not a drug.Its a flower.God put it here. \n~ Willie Nelson",
                                "The biggest killer on the planet is stress and I think the best medicine is cannabis. \n~ Willie Nelson",
                                "Stop killing each other man.Let’s just smoke a blunt. \n~ Tupac","What is a weed?A plant whose virtues have never been discovered. \n~ R.W.Emerson",
                                "Kad Komisija kaže da ideš to je rešeno.Ideš-crtica-ideš! \n~ Autor nepoznat ","Prolaz je kapija ka drugoj dimenziji i njegova crvena svetla nisu vidljiva za svakoga. \n~ Autor nepoznat",
                                "Atatulata Mahamua,tajni jezik svih stvari. \n~ Autor nepoznat","Svet je rotirajući džin plave boje,poznat još i pod imenom Haj Haj Džin.To je sve što postoji. \n~ Autor nepoznat",
                                "Šta je Krmpota?Jel te zalepilo? \n~ Autor nepoznat","Šta je medeni?Jel te slomilo ko čokoladnog zeca? \n~ Autor nepoznat","Au Karumba!Au Tengba!Au Pemba! \n~ Autor nepoznat",
                                "Šta je Bokili?Jel si se urokili? \n~ Autor nepoznat"};
                        int randomMsgIndex = new Random().nextInt(r1.length);

                        TextView naslov = (TextView) findViewById(R.id.naslov);
                        naslov.setText(r1[randomMsgIndex]);
                        com.github.clans.fab.FloatingActionButton menu_green = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.menu_green);
                        Technique.BOUNCE_IN_UP.getComposer().duration(500).delay(0).playOn(menu_green);
                        mPullToRefreshView.setRefreshing(false);



                        MediaPlayer mp;
                        mp = MediaPlayer.create(MainActivity.this, R.raw.unlock);
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // TODO Auto-generated method stub
                                mp.reset();
                                mp.release();
                                mp=null;
                            }

                        });
                        mp.start();




                    }
                }, 400);
            }
        });





        menu_green = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.menu_green);


        //RANDOM NASLOV

        String[] r1 = new String[] {"Science is curiosity, testing and experimenting. \n~ Venkatraman Ramakrishnan","Bog je stvorio Kučuelu da usavršava vernike. \n~ Autor nepoznat",
        "Za razliku od klasične lutrije u Kučueli svi dobijaju. \n~ Autor nepoznat","Postoje tri kosmosa u kosmosu i tri kosmosa izvan ovog kosmosa. \n~ Autor nepoznat",
        "Postoje dani koji mogu da se vraćaju i dani koji ne mogu. \n~ Autor nepoznat","Kučuela je veza između svetova. \n~ Autor nepoznat",
        "Prva limunada koju je Kučuela iscedila ljudima bila je voda sa vizijom. \n~ Autor nepoznat","Kučuela često ne zna gde udara,ali u svakom trenutku zna gde je naša glava. \n~ Autor nepoznat",
        "Legenda kaže da će jednoga dana ogledalo Komisije biti razbijeno,a Komisija rasterana zauvek. \n~ Autor nepoznat","Komisija ima više od osam,a manje od jedanaest članova. \n~ Autor nepoznat",
        "U Južne Krajeve mogu putovati samo oni koji spoznaše tajni nauk krompira \n~ Autor nepoznat","Duh kečapa se sastoji iz duha paradajza i duha samlevenosti. \n~ Autor nepoznat",
        "Svet je mantil, a svaki mantil ima dve strane:spoljašnju i unutrašnju. \n~ Autor nepoznat","Da te nije Kučuela sunce ne bi sijalo. \n~ " +
                "Autor nepoznat","Samo dobri ljudi mogu ulaziti u ptice. \n~ Autor nepoznat","Herb is the healing of a nation, alcohol is the destruction. \n~ Bob Marley",
        "When you smoke the herb, it reveals you to yourself. \n~ Bob Marley","Is weed addictive? Yes, in the sense that most of the pleasant things in life are worth repeating. \n~ Richard Neville",
        "People need to be educated to the fact that marijuana is not a drug.Its a flower.God put it here. \n~ Willie Nelson",
        "The biggest killer on the planet is stress and I think the best medicine is cannabis. \n~ Willie Nelson",
        "Stop killing each other man.Let’s just smoke a blunt. \n~ Tupac","What is a weed?A plant whose virtues have never been discovered. \n~ R.W.Emerson",
        "Kad Komisija kaže da ideš to je rešeno.Ideš-crtica-ideš! \n~ Autor nepoznat ","Prolaz je kapija ka drugoj dimenziji i njegova crvena svetla nisu vidljiva za svakoga. \n~ Autor nepoznat",
        "Atatulata Mahamua,tajni jezik svih stvari. \n~ Autor nepoznat","Svet je rotirajući džin plave boje,poznat još i pod imenom Haj Haj Džin.To je sve što postoji. \n~ Autor nepoznat",
        "Šta je Krmpota?Jel te zalepilo? \n~ Autor nepoznat","Šta je medeni?Jel te slomilo ko čokoladnog zeca? \n~ Autor nepoznat","Au Karumba!Au Tengba!Au Pemba! \n~ Autor nepoznat",
        "Šta je Bokili?Jel si se urokili? \n~ Autor nepoznat"};
        int randomMsgIndex = new Random().nextInt(r1.length);

        TextView naslov = (TextView) findViewById(R.id.naslov);
        naslov.setText(r1[randomMsgIndex]);

        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );
            getSupportActionBar().setTitle("RTNK");
            actionBar.show();
        }

        //NAVIGATION DRAWER

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //izlistati sve textview objekte

        sp = (Spinner) findViewById(R.id.spinner3);
        sp1=(Spinner)findViewById(R.id.spinner4) ;
        sp2=(Spinner)findViewById(R.id.spinner5) ;
        sp6=(Spinner)findViewById(R.id.spinner6) ;
        sp7=(Spinner)findViewById(R.id.spinner7) ;
        sp8=(Spinner)findViewById(R.id.spinner8) ;
        sp9=(Spinner)findViewById(R.id.spinner9) ;
        sp10=(Spinner)findViewById(R.id.spinner10) ;
        sp10a=(Spinner)findViewById(R.id.spinner10a);
        sp11=(Spinner)findViewById(R.id.spinner11) ;
        sp12=(Spinner)findViewById(R.id.spinner12) ;
        sp13=(Spinner)findViewById(R.id.spinner13) ;
        sp14=(Spinner)findViewById(R.id.spinner14) ;
        sp16=(Spinner)findViewById(R.id.spinner16) ;
        sp17=(Spinner)findViewById(R.id.spinner17) ;
        sp10b=(Spinner)findViewById(R.id.spinner10b) ;
        sp18=(Spinner)findViewById(R.id.spinner18) ;


        //ADAPTERI ZA SPINERE+CLICK LISTENERI

        // IME
        adapter = new ArrayAdapter<String>(this,

                android.R.layout.simple_spinner_item, numbers);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                if (sp.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                        //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });


        //LOKACIJA
        adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers1);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                if (sp1.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp1.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();

                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //OPIJAT
        adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers2);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                if (sp2.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp2.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTN
        adapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers6);
        sp6.setAdapter(adapter6);
        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp6.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp6.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //KACA
        adapter7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers7);
        sp7.setAdapter(adapter7);
        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp7.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp7.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //MORE
        adapter8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers8);
        sp8.setAdapter(adapter8);
        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp8.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp8.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //SVETLA
        adapter9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers9);
        sp9.setAdapter(adapter9);
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                if (sp9.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp9.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARAC
        adapter10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10);
        sp10.setAdapter(adapter10);
        sp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp10.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp10.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARACa
        adapter10a = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10a);
        sp10a.setAdapter(adapter10a);
        sp10a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)

            {
                if (sp10a.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp10a.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }



            }
            public void onNothingSelected(AdapterView<?> arg0)
            {

            }
        });

        //UDARACa
        adapter10b = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10b);
        sp10b.setAdapter(adapter10b);
        sp10b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp10b.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp10b.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //AKTIV
        adapter11 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers11);
        sp11.setAdapter(adapter11);
        sp11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp11.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp11.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ZAKRIVLJENOST
        adapter17 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers17);
        sp17.setAdapter(adapter17);
        sp17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp17.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp17.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNK
        adapter12 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers12);
        sp12.setAdapter(adapter12);
        sp12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                if (sp12.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp12.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNKACA
        adapter13 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers13);
        sp13.setAdapter(adapter13);
        sp13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp13.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp13.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ROZE
        adapter14 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers14);
        sp14.setAdapter(adapter14);
        sp14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp14.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp14.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });



        //STAIMATEDADODATe
        adapter16 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers16);
        sp16.setAdapter(adapter16);
        sp16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });


        ////STANJE DUHA
        adapter18 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers18);
        sp18.setAdapter(adapter18);
        sp18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {

                if (sp18.getSelectedItem()=="") {}
                else {
                    View coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, sp18.getSelectedItem().toString(), Snackbar.LENGTH_SHORT).show();
                }
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });    }



    // Overrides setTitle method to support older api levels [TOOLBAR and MENU]
    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }

    // Method(s) that manage TOOLBAR and MENU

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_create) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


    //METODE ZA OTVARANJE SPINERA KLIKOM NA ODGOVARAJUCU KARTICU
    public void spinnerclick (View view){

        ((Spinner) findViewById(R.id.spinner3)).performClick();

    }

    public void lokacija (View view){

        ((Spinner) findViewById(R.id.spinner4)).performClick();

    }

    public void opijat (View view){

        ((Spinner) findViewById(R.id.spinner5)).performClick();

    }

    public void opstestanje (View view){

        ((Spinner) findViewById(R.id.spinner18)).performClick();

    }

    public void rtn (View view){

        ((Spinner) findViewById(R.id.spinner6)).performClick();

    }

    public void kaca (View view){

        ((Spinner) findViewById(R.id.spinner7)).performClick();

    }

    public void more (View view){

        ((Spinner) findViewById(R.id.spinner8)).performClick();

    }

    public void svetla (View view){

        ((Spinner) findViewById(R.id.spinner9)).performClick();

    }

    public void udarac (View view){

        ((Spinner) findViewById(R.id.spinner10b)).performClick();

    }

    public void aktivnost (View view){

        ((Spinner) findViewById(R.id.spinner11)).performClick();

    }

    public void zakrivljenost (View view){

        ((Spinner) findViewById(R.id.spinner17)).performClick();

    }

    public void rtnk (View view){

        ((Spinner) findViewById(R.id.spinner12)).performClick();

    }

    public void kacakrtinic (View view){

        ((Spinner) findViewById(R.id.spinner13)).performClick();

    }

    public void nogice (View view){

        ((Spinner) findViewById(R.id.spinner14)).performClick();

    }

    //ON RESUME RANDOM+ANIMATION
    @Override
    public void onResume () {

        super.onResume();
        String[] r1 = new String[] {"Science is curiosity, testing and experimenting. \n~ Venkatraman Ramakrishnan","Bog je stvorio Kučuelu da usavršava vernike. \n~ Autor nepoznat",
                "Za razliku od klasične lutrije u Kučueli svi dobijaju. \n~ Autor nepoznat","Postoje tri kosmosa u kosmosu i tri kosmosa izvan ovog kosmosa. \n~ Autor nepoznat",
                "Postoje dani koji mogu da se vraćaju i dani koji ne mogu. \n~ Autor nepoznat","Kučuela je veza između svetova. \n~ Autor nepoznat",
                "Prva limunada koju je Kučuela iscedila ljudima bila je voda sa vizijom. \n~ Autor nepoznat","Kučuela često ne zna gde udara,ali u svakom trenutku zna gde je naša glava. \n~ Autor nepoznat",
                "Legenda kaže da će jednoga dana ogledalo Komisije biti razbijeno,a Komisija rasterana zauvek. \n~ Autor nepoznat","Komisija ima više od osam,a manje od jedanaest članova. \n~ Autor nepoznat",
                "U Južne Krajeve mogu putovati samo oni koji spoznaše tajni nauk krompira \n~ Autor nepoznat","Duh kečapa se sastoji iz duha paradajza i duha samlevenosti. \n~ Autor nepoznat",
                "Svet je mantil, a svaki mantil ima dve strane:spoljašnju i unutrašnju. \n~ Autor nepoznat","Da te nije Kučuela sunce ne bi sijalo. \n~ " +
                "Autor nepoznat","Samo dobri ljudi mogu ulaziti u ptice. \n~ Autor nepoznat","Herb is the healing of a nation, alcohol is the destruction. \n~ Bob Marley",
                "When you smoke the herb, it reveals you to yourself. \n~ Bob Marley","Is weed addictive? Yes, in the sense that most of the pleasant things in life are worth repeating. \n~ Richard Neville",
                "People need to be educated to the fact that marijuana is not a drug.Its a flower.God put it here. \n~ Willie Nelson",
                "The biggest killer on the planet is stress and I think the best medicine is cannabis. \n~ Willie Nelson",
                "Stop killing each other man.Let’s just smoke a blunt. \n~ Tupac","What is a weed?A plant whose virtues have never been discovered. \n~ R.W.Emerson",
                "Kad Komisija kaže da ideš to je rešeno.Ideš-crtica-ideš! \n~ Autor nepoznat ","Prolaz je kapija ka drugoj dimenziji i njegova crvena svetla nisu vidljiva za svakoga. \n~ Autor nepoznat",
                "Atatulata Mahamua,tajni jezik svih stvari. \n~ Autor nepoznat","Svet je rotirajući džin plave boje,poznat još i pod imenom Haj Haj Džin.To je sve što postoji. \n~ Autor nepoznat",
                "Šta je Krmpota?Jel te zalepilo? \n~ Autor nepoznat","Šta je medeni?Jel te slomilo ko čokoladnog zeca? \n~ Autor nepoznat","Au Karumba!Au Tengba!Au Pemba! \n~ Autor nepoznat",
                "Šta je Bokili?Jel si se urokili? \n~ Autor nepoznat",""};
        int randomMsgIndex = new Random().nextInt(r1.length);

        TextView naslov = (TextView) findViewById(R.id.naslov);
        naslov.setText(r1[randomMsgIndex]);

        Technique.LANDING.getComposer().duration(1500).delay(0).playOn(naslov);


        com.github.clans.fab.FloatingActionButton menu_green = (com.github.clans.fab.FloatingActionButton)findViewById(R.id.menu_green);

       Technique.BOUNCE_IN_UP.getComposer().duration(500).delay(0).playOn(menu_green);

    }


    //ONA BACK PRESSED DRAWER
    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //NAV DRAWER ITEM SELECTED
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_prdavac) {

            MediaPlayer mp;
            mp = MediaPlayer.create(MainActivity.this, R.raw.prdavac);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    // TODO Auto-generated method stub
                    mp.reset();
                    mp.release();
                    mp=null;
                }

            });
            mp.start();

        } else if (id == R.id.nav_standard) {

            MediaPlayer mp;
            mp = MediaPlayer.create(MainActivity.this, R.raw.standard);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    // TODO Auto-generated method stub
                    mp.reset();
                    mp.release();
                    mp=null;
                }

            });
            mp.start();

        } else if (id == R.id.nav_domacinski) {

            MediaPlayer mp;
            mp = MediaPlayer.create(MainActivity.this, R.raw.domacinski);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    // TODO Auto-generated method stub
                    mp.reset();
                    mp.release();
                    mp=null;
                }

            });
            mp.start();

        } else if (id == R.id.nav_about) {

            new MaterialStyledDialog.Builder(this)

                    .setDescription("This is a simple material design app made for local weed smoking community.Cannabis,also known as marijuana among other names,is a psychoactive drug from the Cannabis plant intended for medical or recreational use.The main psychoactive part of cannabis is tetrahydrocannabinol (THC); one of 483 known compounds in the plant,including at least 65 other cannabinoids.Cannabis can be used by smoking, vaporizing, within food, or as an extract.This app is not promoting drug use and we will not be responsible for any loss or damage whatsoever caused by using it.\n")
                    .setHeaderDrawable(R.drawable.weed)
                    //.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_launcher))

                    .setPositiveText("OK")
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            dialog.dismiss();
                        }})

                    .setNegativeText("GITHUB")
                    .onNegative(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            String url = "https://github.com/svetaz";
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }})

                    .show();

        } else if (id == R.id.nav_changelog) {

            new MaterialStyledDialog.Builder(this)

                    .setTitle("Changelog")
                    .setDescription("----- Verzija 6.6 -----\n\n *Dodat sistem sa notifikacijama (experimentalna faza)\n\n----- Verzija 6.5 -----\n\n * Dodat navigation drawer\n * Opcije iz FAB preseljene u navigation drawer\n * U pripremi dodavanje background service-a za notifikacije\n * Sklonjena CING-CING opcija zbog retke upotrebe\n * Dodat zvuk posle pull-to-refresh gesture-a")
                    .setHeaderDrawable(R.drawable.log)
                    .setScrollable(true)
                    //.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_launcher))

                    .setPositiveText("OK")
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            dialog.dismiss();
                        }})

                    .show();

        } else if (id == R.id.nav_notifications) {

            AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.notifs,null);

            mBuilder.setView(mView);
            final AlertDialog dialog = mBuilder.create();
            dialog.show();

            final Button dugmeon = (Button)mView.findViewById(R.id.button1) ;
            final Button dugmeoff = (Button)mView.findViewById(R.id.button2) ;

            dugmeon.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Calendar calendar = Calendar.getInstance();
                    calendar.set(Calendar.HOUR_OF_DAY,21);
                    calendar.set(Calendar.MINUTE,25);

                    if (calendar.getTime().compareTo(new Date()) < 0) calendar.add(Calendar.DAY_OF_MONTH, 1);
                    Intent intent = new Intent(getApplicationContext(),Notification_reciever.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
                    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),alarmManager.INTERVAL_DAY,pendingIntent);
                    dialog.dismiss();

                    View coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, "Notifikacije uključene", Snackbar.LENGTH_LONG).show();
                }
            });

            dugmeoff.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(), Notification_reciever.class);
                    PendingIntent sender = PendingIntent.getBroadcast(getApplicationContext(), 100, intent, 0);
                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                    alarmManager.cancel(sender);
                    dialog.dismiss();

                    View coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coord);
                    Snackbar.make(coordinatorLayout, "Notifikacije isključene", Snackbar.LENGTH_LONG).show();
                }
            });


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    //SHARE FAB
    public void dugme(View view) {

        Intent sendIntent = new Intent();
        String date = String.valueOf(android.text.format.DateFormat.format("EE,dd.MMMM, HH:mm", new java.util.Date()));
        String inputText = input.getText().toString();
        info.setText(inputText);
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "REZULTATI TESTA"+"\n\nVREME: "+date+"\nKORISNIK: " + sp.getSelectedItem().toString()+"\nLOKACIJA: "
                +sp1.getSelectedItem().toString()+"\nOPIJAT: "+sp2.getSelectedItem().toString()
                +"\nSTANJE DUHA: "+sp18.getSelectedItem().toString()+
                "\n\nRTN: "+sp6.getSelectedItem().toString()+"\nKACA: "+sp7.getSelectedItem().toString()+"\nMORE/OBLACI: "
                +sp8.getSelectedItem().toString()+"\nSVETLA: "+sp9.getSelectedItem().toString()+"\nUDARAC: "+sp10b.getSelectedItem().toString()+"\n"+sp10.getSelectedItem().toString()+"/"+sp10a.getSelectedItem().toString()
                +"\nAKTIVNOST: "+sp11.getSelectedItem().toString()+"\nZAKRIVLJENOST: "+sp17.getSelectedItem().toString()+"\n\nRTN KRTINIĆ: "+sp12.getSelectedItem().toString()+"\nKACA KRTINIĆ: "
                +sp13.getSelectedItem().toString()+"\nNOGICE: "+sp14.getSelectedItem().toString()+"\nŠTA IMATE DA DODATE: "+"\n"+sp16.getSelectedItem().toString()+"\n\nI NA KRAJU SVEGA — UVOD: "+"\n"+input.getText());
        sendIntent.setType("text/plain");

        startActivity(sendIntent);


    }

}

//THIS IS THE END MY ONLY FRIEND