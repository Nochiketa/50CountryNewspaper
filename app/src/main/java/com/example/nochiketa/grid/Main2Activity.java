package com.example.nochiketa.grid;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setHomeButtonEnabled(true);


        Bundle extras = getIntent().getExtras();
        int position1 = extras.getInt("POSITION");
        int position2 = extras.getInt("POS");

        myWebView = (WebView)findViewById(R.id.wb);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo ninfo = cManager.getActiveNetworkInfo();
        if(ninfo != null && ninfo.isConnected())
        {

            Toast.makeText(this,"Page is loading Please Wait!! for a while", Toast.LENGTH_LONG).show();

            if(position1 == 0)
            {
                if(position2 == 0)
                {
                    setTitle("The Washington Post");
                    myWebView.loadUrl("https://www.washingtonpost.com/");
                }
                else if(position2 == 1)
                {
                    setTitle("The New York Post");
                    myWebView.loadUrl("http://nypost.com/");
                }
                else if(position2 == 2)
                {
                    setTitle("The Wall Street Journal");
                    myWebView.loadUrl("https://www.wsj.com/asia");
                }
                else if(position2 == 3)
                {
                    setTitle("The Chicago Tribune");
                    myWebView.loadUrl("http://www.chicagotribune.com/");
                }
                else if(position2 == 4)
                {
                    setTitle("The Las Vegas Sun");
                    myWebView.loadUrl("https://lasvegassun.com/");
                }
                else if(position2 == 5)
                {
                    setTitle("The USA Today");
                    myWebView.loadUrl("http://www.usatoday.com/");
                }
                else if(position2 == 6)
                {
                    setTitle("The Washington Times");
                    myWebView.loadUrl("http://www.washingtontimes.com/");
                }
                else if(position2 == 7)
                {
                    setTitle("The Boston Herald");
                    myWebView.loadUrl("http://www.bostonherald.com/");
                }
                else if(position2 == 8)
                {
                    setTitle("The Dallas News");
                    myWebView.loadUrl("http://www.dallasnews.com/");
                }
                else if(position2 == 9)
                {
                    setTitle("The Advocate");
                    myWebView.loadUrl("http://www.theadvocate.com/");
                }
            }
            else if(position1 == 1)
            {
                if(position2 == 0)
                {
                    setTitle("The Times of India");
                    myWebView.loadUrl("http://timesofindia.indiatimes.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Hindu");
                    myWebView.loadUrl("http://www.thehindu.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Hindustan Times");
                    myWebView.loadUrl("http://www.hindustantimes.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Indian Express");
                    myWebView.loadUrl("http://indianexpress.com/");
                }
                if(position2 == 4)
                {
                    setTitle("The Sandesh");
                    myWebView.loadUrl("http://sandesh.com/");
                }
                if(position2 == 5)
                {
                    setTitle("The Tribune");
                    myWebView.loadUrl("http://www.tribuneindia.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The Ananda Bazar");
                    myWebView.loadUrl("http://www.anandabazar.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The Mumbai Mirror");
                    myWebView.loadUrl("http://mumbaimirror.indiatimes.com/");
                }
                if(position2 == 8)
                {
                    setTitle("The Jagaran");
                    myWebView.loadUrl("http://www.jagran.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Lokmat");
                    myWebView.loadUrl("http://www.lokmat.com/");
                }
            }
            else if(position1 == 2)
            {
                if(position2 == 0)
                {
                    setTitle("The Prothom-Alo");
                    myWebView.loadUrl("http://www.prothom-alo.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Jugantor");
                    myWebView.loadUrl("http://www.jugantor.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Kaler Kontho");
                    myWebView.loadUrl("http://www.kalerkantho.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Samakal");
                    myWebView.loadUrl("http://bangla.samakal.net/");
                }
                if(position2 == 4)
                {
                    setTitle("The Ittefaq");
                    myWebView.loadUrl("http://www.ittefaq.com.bd/");
                }
                if(position2 == 5)
                {
                    setTitle("The Daily Star");
                    myWebView.loadUrl("http://www.thedailystar.net/");
                }
                if(position2 == 6)
                {
                    setTitle("The Amardesh Desh");
                    myWebView.loadUrl("http://www.amardesh.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The Observer");
                    myWebView.loadUrl("http://www.observerbd.com/");
                }
                if(position2 == 8)
                {
                    setTitle("The Daily Naya Diganta");
                    myWebView.loadUrl("http://www.dailynayadiganta.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Daily Janakantha");
                    myWebView.loadUrl("https://www.dailyjanakantha.com/");
                }
            }
            else if(position1 == 3)
            {
                if(position2 == 0)
                {
                    setTitle("The Daily Telegraph");
                    myWebView.loadUrl("http://www.telegraph.co.uk/");
                }
                if(position2 == 1)
                {
                    setTitle("The Guardian");
                    myWebView.loadUrl("https://www.theguardian.com/international");
                }
                if(position2 == 2)
                {
                    setTitle("The Daily Mail");
                    myWebView.loadUrl("http://www.dailymail.co.uk/home/index.html");
                }
                if(position2 == 3)
                {
                    setTitle("The Independent");
                    myWebView.loadUrl("http://www.independent.co.uk/?CMP=ILC-refresh");
                }
                if(position2 == 4)
                {
                    setTitle("The Times");
                    myWebView.loadUrl("http://www.thetimes.co.uk/");
                }
                if(position2 == 5)
                {
                    setTitle("The Mirror");
                    myWebView.loadUrl("http://www.mirror.co.uk/");
                }
                if(position2 == 6)
                {
                    setTitle("The Sun");
                    myWebView.loadUrl("https://www.thesun.co.uk/");
                }
                if(position2 == 7)
                {
                    setTitle("The Express");
                    myWebView.loadUrl("http://www.express.co.uk/");
                }
                if(position2 == 8)
                {
                    setTitle("The Observer");
                    myWebView.loadUrl("https://www.theguardian.com/observer");
                }
                if(position2 == 9)
                {
                    setTitle("The Morning Star");
                    myWebView.loadUrl("https://www.morningstaronline.co.uk/");
                }
            }
            else if(position1 == 4)
            {

                if(position2 == 0)
                {
                    setTitle("The Pravada");
                    myWebView.loadUrl("http://www.pravdareport.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Novaya Gazetta");
                    myWebView.loadUrl("http://www.pravdareport.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Komersant");
                    myWebView.loadUrl("http://www.kommersant.ru/");
                }
                if(position2 == 3)
                {
                    setTitle("The Izvestia");
                    myWebView.loadUrl("http://izvestia.ru/");
                }
                if(position2 == 4)
                {
                    setTitle("The Komsomolskya Pravada");
                    myWebView.loadUrl("http://www.kp.ru/");
                }
                if(position2 == 5)
                {
                    setTitle("The Argumenty i Fakty");
                    myWebView.loadUrl("http://www.aif.ru/");
                }
                if(position2 == 6)
                {
                    setTitle("The Nezavisimaya Gazeta");
                    myWebView.loadUrl("http://www.ng.ru/");
                }
                if(position2 == 7)
                {
                    setTitle("The Trud");
                    myWebView.loadUrl("http://www.express.co.uk/");
                }
                if(position2 == 8)
                {
                    setTitle("The Rosiskya Gazeta");
                    myWebView.loadUrl("http://www.mk.ru/");
                }
                if(position2 == 9)
                {
                    setTitle("The Sport Express");
                    myWebView.loadUrl("http://www.sport-express.ru/");
                }
            }
            else if(position1 == 5)
            {

                if(position2 == 0)
                {
                    setTitle("The Australian");
                    myWebView.loadUrl("http://www.theaustralian.com.au/");
                }
                if(position2 == 1)
                {
                    setTitle("The Herald Sun");
                    myWebView.loadUrl("http://www.heraldsun.com.au/");
                }
                if(position2 == 2)
                {
                    setTitle("The Daily Telegraph");
                    myWebView.loadUrl("http://www.dailytelegraph.com.au/");
                }
                if(position2 == 3)
                {
                    setTitle("The Sydney Morning Herald");
                    myWebView.loadUrl("http://www.smh.com.au/");
                }
                if(position2 == 4)
                {
                    setTitle("The Advertiser");
                    myWebView.loadUrl("http://www.adelaidenow.com.au/");
                }
                if(position2 == 5)
                {
                    setTitle("The Courier-Mail");
                    myWebView.loadUrl("http://www.couriermail.com.au/");
                }
                if(position2 == 6)
                {
                    setTitle("The West Australian");
                    myWebView.loadUrl("http://perthcatholic.org.au/Home.htm?gclid=Cj0KEQiA25rFBRC8rfyX1vjeg7YBEiQAFIb3bzBMkWAQcfE_Zr84aV2PxaRyzg4KKPgAtMUlsikVITUaAorj8P8HAQ");
                }
                if(position2 == 7)
                {
                    setTitle("The Age");
                    myWebView.loadUrl("http://www.theage.com.au/");
                }
                if(position2 == 8)
                {
                    setTitle("The Sunday Times");
                    myWebView.loadUrl("http://www.perthnow.com.au/");
                }
                if(position2 == 9)
                {
                    setTitle("The Australian Financial Review");
                    myWebView.loadUrl("https://subscribers.afr.com/subscribe-all/?eid=cpc:nnn-16omntA0367-acq-GA-06102016-Daily_Habit-nnn-FTR-nnn-AFR-nnn&campaign_code=Daily_Habit&promote_channel=AFR_A_SEM_GA_FTR&gclid=Cj0KEQiA25rFBRC8rfyX1vjeg7YBEiQAFIb3bwgob0SEiShmpRhmfs20Lx5ZxJDrHWXlfJpNYtOleSwaAoha8P8HAQ");
                }
            }
            else if(position1 == 6)
            {
                if(position2 == 0)
                {
                    setTitle("The Medium");
                    myWebView.loadUrl("https://themedium.ca/");
                }
                if(position2 == 1)
                {
                    setTitle("The Star");
                    myWebView.loadUrl("https://www.thestar.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Globe and Mail");
                    myWebView.loadUrl("http://www.theglobeandmail.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The National Post");
                    myWebView.loadUrl("http://www.nationalpost.com/index.html");
                }
                if(position2 == 4)
                {
                    setTitle("The Calgary Herald");
                    myWebView.loadUrl("http://calgaryherald.com/");
                }
                if(position2 == 5)
                {
                    setTitle("The Montreal Gazette");
                    myWebView.loadUrl("http://montrealgazette.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The Toronto Sun");
                    myWebView.loadUrl("http://www.torontosun.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The London Free Press");
                    myWebView.loadUrl("http://www.lfpress.com/");
                }
                if(position2 == 8)
                {
                    setTitle("The Financial Post");
                    myWebView.loadUrl("http://www.financialpost.com/index.html");
                }
                if(position2 == 9)
                {
                    setTitle("The Telegram");
                    myWebView.loadUrl("http://www.thetelegram.com/");
                }
            }
            else if(position1 == 7)
            {
                if(position2 == 0)
                {
                    setTitle("The Le Monde");
                    myWebView.loadUrl("http://www.lemonde.fr/");
                }
                if(position2 == 1)
                {
                    setTitle("The Le Figaro");
                    myWebView.loadUrl("http://www.lefigaro.fr/");
                }
                if(position2 == 2)
                {
                    setTitle("The Le Parisien");
                    myWebView.loadUrl("http://www.leparisien.fr/");
                }
                if(position2 == 3)
                {
                    setTitle("The Liberation");
                    myWebView.loadUrl("http://www.liberation.fr/");
                }
                if(position2 == 4)
                {
                    setTitle("The Lesechos");
                    myWebView.loadUrl("http://www.lesechos.fr/");
                }
                if(position2 == 5)
                {
                    setTitle("The Le Quipe");
                    myWebView.loadUrl("http://www.lequipe.fr/");
                }
                if(position2 == 6)
                {
                    setTitle("The 20 Minutes");
                    myWebView.loadUrl("http://www.20minutes.fr/");
                }
                if(position2 == 7)
                {
                    setTitle("The Ouest-France");
                    myWebView.loadUrl("http://www.ouest-france.fr/");
                }
                if(position2 == 8)
                {
                    setTitle("The Humanite");
                    myWebView.loadUrl("http://www.humanite.fr/");
                }
                if(position2 == 9)
                {
                    setTitle("The La-Croix");
                    myWebView.loadUrl("http://www.la-croix.com/");
                }
            }
            else if(position1 == 8)
            {
                if(position2 == 0)
                {
                    setTitle("Bild");
                    myWebView.loadUrl("http://www.bild.de/wa/ll/bild-de/unangemeldet-42925516.bild.html");
                }
                if(position2 == 1)
                {
                    setTitle("The Sudeutsche Zeitung");
                    myWebView.loadUrl("http://www.sueddeutsche.de/adblock");
                }
                if(position2 == 2)
                {
                    setTitle("The Die Weilt");
                    myWebView.loadUrl("https://www.welt.de/");
                }
                if(position2 == 3)
                {
                    setTitle("The Die Zeit");
                    myWebView.loadUrl("http://www.zeit.de/index");
                }
                if(position2 == 4)
                {
                    setTitle("The Die Tageszeitung");
                    myWebView.loadUrl("http://www.taz.de/");
                }
                if(position2 == 5)
                {
                    setTitle("The Frankfurter Rundschau");
                    myWebView.loadUrl("http://www.fr-online.de/home/1472778,1472778.html");
                }
                if(position2 == 6)
                {
                    setTitle("The Handelsblatt");
                    myWebView.loadUrl("http://www.handelsblatt.com/impressum/nutzungshinweise/blocker/?callback=%2F");
                }
                if(position2 == 7)
                {
                    setTitle("The Berliner Morgenpost");
                    myWebView.loadUrl("http://www.morgenpost.de/");
                }
                if(position2 == 8)
                {
                    setTitle("The Der Taggespiegel");
                    myWebView.loadUrl("http://www.tagesspiegel.de/");
                }
                if(position2 == 9)
                {
                    setTitle("The Kurier");
                    myWebView.loadUrl("https://kurier.at/");
                }
            }
            else if(position1 == 9)
            {
                if(position2 == 0)
                {
                    setTitle("The Yomiuri Shimbun");
                    myWebView.loadUrl("https://info.yomiuri.co.jp/english/index.html");
                }
                if(position2 == 1)
                {
                    setTitle("The Japan Times");
                    myWebView.loadUrl("http://www.japantimes.co.jp/");
                }
                if(position2 == 2)
                {
                    setTitle("The Asahi Shimbun");
                    myWebView.loadUrl("http://www.asahi.com/ajw/");
                }
                if(position2 == 3)
                {
                    setTitle("The Mainichi Shimbun");
                    myWebView.loadUrl("http://mainichi.jp/english/");
                }
                if(position2 == 4)
                {
                    setTitle("The Sankei Shimbun");
                    myWebView.loadUrl("http://www.sankei.com/");
                }
                if(position2 == 5)
                {
                    setTitle("The Chunichi Shimbun");
                    myWebView.loadUrl("http://www.chunichi.co.jp/");
                }
                if(position2 == 6)
                {
                    setTitle("The Japan Today");
                    myWebView.loadUrl("https://www.japantoday.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The Nishinippon Shimbun");
                    myWebView.loadUrl("http://www.nishinippon.co.jp/");
                }
                if(position2 == 8)
                {
                    setTitle("The Tokyo Sports");
                    myWebView.loadUrl("http://www.tokyo-sports.co.jp/");
                }
                if(position2 == 9)
                {
                    setTitle("The Tokyo Shimbun");
                    myWebView.loadUrl("http://www.tokyo-np.co.jp/");
                }
            }
            else if(position1 == 10)
            {
                if(position2 == 0)
                {
                    setTitle("The Chaina Daily");
                    myWebView.loadUrl("http://www.chinadaily.com.cn/");
                }
                if(position2 == 1)
                {
                    setTitle("The People's Daily");
                    myWebView.loadUrl("http://en.people.cn/");
                }
                if(position2 == 2)
                {
                    setTitle("The South Chain Morning Post");
                    myWebView.loadUrl("http://www.scmp.com/frontpage/international");
                }
                if(position2 == 3)
                {
                    setTitle("The Sanghai Daily");
                    myWebView.loadUrl("http://www.shanghaidaily.com/");
                }
                if(position2 == 4)
                {
                    setTitle("The Chaina Press");
                    myWebView.loadUrl("http://www.chinapress.com.my/");
                }
                if(position2 == 5)
                {
                    setTitle("The Chaina Post");
                    myWebView.loadUrl("http://www.chinapost.com.tw/");
                }
                if(position2 == 6)
                {
                    setTitle("The Chaina Times");
                    myWebView.loadUrl("http://thechinatimes.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The Chaina Daily");
                    myWebView.loadUrl("http://app1.chinadaily.com.cn/star/");
                }
                if(position2 == 8)
                {
                    setTitle("The Legal Daily");
                    myWebView.loadUrl("http://www.legaldaily.com.cn/");
                }
                if(position2 == 9)
                {
                    setTitle("The Xinhua Daily");
                    myWebView.loadUrl("http://www.xinhuanet.com/english/");
                }
            }
            else if(position1 == 11)
            {
                if(position2 == 0)
                {
                    setTitle("The Mail and Guardian");
                    myWebView.loadUrl("http://mg.co.za/");
                }
                if(position2 == 1)
                {
                    setTitle("The Swoetan");
                    myWebView.loadUrl("http://www.sowetanlive.co.za/");
                }
                if(position2 == 2)
                {
                    setTitle("The City Press");
                    myWebView.loadUrl("http://city-press.news24.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Star");
                    myWebView.loadUrl("http://www.iol.co.za/the-star");
                }
                if(position2 == 4)
                {
                    setTitle("The Cape Times");
                    myWebView.loadUrl("http://www.iol.co.za/capetimes");
                }
                if(position2 == 5)
                {
                    setTitle("The Cape Argus");
                    myWebView.loadUrl("http://www.iol.co.za/capeargus");
                }
                if(position2 == 6)
                {
                    setTitle("The Sunday Times");
                    myWebView.loadUrl("http://www.timeslive.co.za/sundaytimes/");
                }
                if(position2 == 7)
                {
                    setTitle("The Beld");
                    myWebView.loadUrl("http://www.netwerk24.com/");
                }
                if(position2 == 8)
                {
                    setTitle("The Times");
                    myWebView.loadUrl("http://www.timeslive.co.za/");
                }
                if(position2 == 9)
                {
                    setTitle("The Daily Sun");
                    myWebView.loadUrl("http://www.dailysun.co.za/");
                }
            }
            else if(position1 == 12)
            {
                if(position2 == 0)
                {
                    setTitle("The El Pias");
                    myWebView.loadUrl("http://elpais.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Elmundo");
                    myWebView.loadUrl("http://www.elmundo.es/");
                }
                if(position2 == 2)
                {
                    setTitle("The Marca");
                    myWebView.loadUrl("http://www.marca.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The ABC");
                    myWebView.loadUrl("http://www.abc.es/");
                }
                if(position2 == 4)
                {
                    setTitle("The El Periodico de Cataluniya");
                    myWebView.loadUrl("http://www.elperiodico.com/es/");
                }
                if(position2 == 5)
                {
                    setTitle("The Cinco Dias");
                    myWebView.loadUrl("http://cincodias.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The El Correo");
                    myWebView.loadUrl("http://www.elcorreo.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The La Razon");
                    myWebView.loadUrl("http://www.larazon.es/");
                }
                if(position2 == 8)
                {
                    setTitle("The Diario AS");
                    myWebView.loadUrl("http://as.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Expansion");
                    myWebView.loadUrl("http://www.expansion.com/");
                }
            }
            else if(position1 == 13)
            {
                if(position2 == 0)
                {
                    setTitle("The Dawn");
                    myWebView.loadUrl("http://www.dawn.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The News International");
                    myWebView.loadUrl("https://www.thenews.com.pk/");
                }
                if(position2 == 2)
                {
                    setTitle("The Daily Jang");
                    myWebView.loadUrl("https://jang.com.pk/");
                }
                if(position2 == 3)
                {
                    setTitle("The National");
                    myWebView.loadUrl("http://nation.com.pk/");
                }
                if(position2 == 4)
                {
                    setTitle("The Daily Times");
                    myWebView.loadUrl("http://www.dailytimes.com.pk/");
                }
                if(position2 == 5)
                {
                    setTitle("The Daily Express");
                    myWebView.loadUrl("https://www.express.com.pk/");
                }
                if(position2 == 6)
                {
                    setTitle("The Daily Pakistan");
                    myWebView.loadUrl("http://dailypakistan.com.pk/");
                }
                if(position2 == 7)
                {
                    setTitle("The Nawa-I-Waqt");
                    myWebView.loadUrl("http://www.nawaiwaqt.com.pk/");
                }
                if(position2 == 8)
                {
                    setTitle("The Front Post");
                    myWebView.loadUrl("http://www.thefrontierpost.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Pakistan Observer");
                    myWebView.loadUrl("http://pakobserver.net/");
                }
            }
            else if(position1 == 14)
            {
                if(position2 == 0)
                {
                    setTitle("The Corriere Della Cera");
                    myWebView.loadUrl("http://www.corriere.it/?no-static&refresh_rum");
                }
                if(position2 == 1)
                {
                    setTitle("The La Reppublica");
                    myWebView.loadUrl("http://www.repubblica.it/");
                }
                if(position2 == 2)
                {
                    setTitle("The La Stumpa");
                    myWebView.loadUrl("http://www.lastampa.it/");
                }
                if(position2 == 3)
                {
                    setTitle("The La Gezzetta Delo Sport");
                    myWebView.loadUrl("http://www.gazzetta.it/?refresh_rum");
                }
                if(position2 == 4)
                {
                    setTitle("The Messaggero");
                    myWebView.loadUrl("http://www.ilmessaggero.it/");
                }
                if(position2 == 5)
                {
                    setTitle("The Sole 24 Ore");
                    myWebView.loadUrl("http://www.ilsole24ore.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The Giornale");
                    myWebView.loadUrl("http://www.ilgiornale.it/");
                }
                if(position2 == 7)
                {
                    setTitle("The Mattino");
                    myWebView.loadUrl("http://www.ilmattino.it/");
                }
                if(position2 == 8)
                {
                    setTitle("The L'Unita");
                    myWebView.loadUrl("http://www.unita.tv/");
                }
                if(position2 == 9)
                {
                    setTitle("The Libero");
                    myWebView.loadUrl("http://www.liberoquotidiano.it/");
                }
            }
            else if(position1 == 15)
            {
                if(position2 == 0)
                {
                    setTitle("The Chosun Ilbo");
                    myWebView.loadUrl("http://english.chosun.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Korea Times");
                    myWebView.loadUrl("http://www.koreatimes.co.kr/www2/index.asp");
                }
                if(position2 == 2)
                {
                    setTitle("The Korea Herald");
                    myWebView.loadUrl("http://www.koreaherald.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Hankyoreh");
                    myWebView.loadUrl("http://english.hani.co.kr/");
                }
                if(position2 == 4)
                {
                    setTitle("The Hankook Ilbo");
                    myWebView.loadUrl("http://www.hankookilbo.com/");
                }
                if(position2 == 5)
                {
                    setTitle("The Seoul Shinmun");
                    myWebView.loadUrl("http://www.seoul.co.kr/");
                }
                if(position2 == 6)
                {
                    setTitle("The Korea Economic Daily");
                    myWebView.loadUrl("http://english.hankyung.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The JoongAng Dailay");
                    myWebView.loadUrl("http://koreajoongangdaily.joins.com/");
                }
                if(position2 == 8)
                {
                    setTitle("The Maeil Businees Newspaper");
                    myWebView.loadUrl("http://www.pulsenews.co.kr/");
                }
                if(position2 == 9)
                {
                    setTitle("The Kukmin Daily");
                    myWebView.loadUrl("http://www.kukmindaily.co.kr/");
                }
            }

            else if(position1 == 16)
            {
                if(position2 == 0)
                {
                    setTitle("The North Korea Times");
                    myWebView.loadUrl("http://www.northkoreatimes.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The North Korea News");
                    myWebView.loadUrl("https://www.nknews.org/");
                }
                if(position2 == 2)
                {
                    setTitle("The Daily North Korea");
                    myWebView.loadUrl("http://www.dailynk.com/english/index.php");
                }
                if(position2 == 3)
                {
                    setTitle("The Korea Times");
                    myWebView.loadUrl("http://www.koreatimes.co.kr/www2/index.asp");
                }
                if(position2 == 4)
                {
                    setTitle("The The Korea Herald");
                    myWebView.loadUrl("http://www.koreaherald.com/");
                }
            }

            else if(position1 == 17)
            {
                if(position2 == 0)
                {
                    setTitle("The Kompas");
                    myWebView.loadUrl("http://www.kompas.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The Jakarta Post");
                    myWebView.loadUrl("http://www.thejakartapost.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Bisnis Indonesia");
                    myWebView.loadUrl("http://www.bisnis.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Pikiran Rakiyat");
                    myWebView.loadUrl("http://www.pikiran-rakyat.com/");
                }
                if(position2 == 4)
                {
                    setTitle("The Saura Merdeka");
                    myWebView.loadUrl("http://berita.suaramerdeka.com/");
                }
                if(position2 == 5)
                {
                    setTitle("The Jawa Pos");
                    myWebView.loadUrl("http://www.jawapos.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The Jakarta Globe");
                    myWebView.loadUrl("http://jakartaglobe.id/");
                }
                if(position2 == 7)
                {
                    setTitle("The Republica");
                    myWebView.loadUrl("http://www.republika.co.id/");
                }
                if(position2 == 8)
                {
                    setTitle("The Media Indonesia");
                    myWebView.loadUrl("http://mediaindonesia.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Koran Tempo");
                    myWebView.loadUrl("https://koran.tempo.co/2017/02/20");
                }
            }

            else if(position1 == 18)
            {
                if(position2 == 0)
                {
                    setTitle("The Neue Zurcher Zeitung");
                    myWebView.loadUrl("https://www.nzz.ch/");
                }
                if(position2 == 1)
                {
                    setTitle("The Tages-Anzeiger");
                    myWebView.loadUrl("http://www.tagesanzeiger.ch/");
                }
                if(position2 == 2)
                {
                    setTitle("The Le Temps");
                    myWebView.loadUrl("https://www.letemps.ch/");
                }
                if(position2 == 3)
                {
                    setTitle("The Blick");
                    myWebView.loadUrl("http://www.blick.ch/");
                }
                if(position2 == 4)
                {
                    setTitle("The Basler Zeitung");
                    myWebView.loadUrl("http://bazonline.ch/");
                }
                if(position2 == 5)
                {
                    setTitle("The 24 Heures");
                    myWebView.loadUrl("http://www.24heures.ch/");
                }
                if(position2 == 6)
                {
                    setTitle("The Berner Zeitung");
                    myWebView.loadUrl("http://www.bernerzeitung.ch/");
                }
                if(position2 == 7)
                {
                    setTitle("The Le Matin");
                    myWebView.loadUrl("http://www.lematin.ch/");
                }
                if(position2 == 8)
                {
                    setTitle("The 20 Minuten");
                    myWebView.loadUrl("http://www.20min.ch/");
                }
                if(position2 == 9)
                {
                    setTitle("The St. Galler Tagblatt");
                    myWebView.loadUrl("http://www.tagblatt.ch/");
                }
            }

            else if(position1 == 19)
            {
                if(position2 == 0)
                {
                    setTitle("The Clarin");
                    myWebView.loadUrl("http://www.clarin.com/");
                }
                if(position2 == 1)
                {
                    setTitle("The La Nacion");
                    myWebView.loadUrl("http://www.lanacion.com.ar/");
                }
                if(position2 == 2)
                {
                    setTitle("The El Cronista");
                    myWebView.loadUrl("http://www.cronista.com/");
                }
                if(position2 == 3)
                {
                    setTitle("The Pagin/12");
                    myWebView.loadUrl("https://pagina12.com.ar/");
                }
                if(position2 == 4)
                {
                    setTitle("The Cronica");
                    myWebView.loadUrl("http://www.cronica.com.ar/");
                }
                if(position2 == 5)
                {
                    setTitle("The Ambito Financiero");
                    myWebView.loadUrl("http://www.ambito.com/");
                }
                if(position2 == 6)
                {
                    setTitle("The Buenos Aires Herald");
                    myWebView.loadUrl("http://www.buenosairesherald.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The La Voz Del Interior");
                    myWebView.loadUrl("http://www.lavoz.com.ar/");
                }
                if(position2 == 8)
                {
                    setTitle("The Ole");
                    myWebView.loadUrl("http://www.ole.com.ar/");
                }
                if(position2 == 9)
                {
                    setTitle("The El Dia");
                    myWebView.loadUrl("http://www.eldia.com/");
                }
            }

            else if(position1 == 20)
            {
                if(position2 == 0)
                {
                    setTitle("The Cumhuriyet");
                    myWebView.loadUrl("http://www.cumhuriyet.com.tr/");
                }
                if(position2 == 1)
                {
                    setTitle("The Hurriyet Daily News");
                    myWebView.loadUrl("http://www.hurriyetdailynews.com/");
                }
                if(position2 == 2)
                {
                    setTitle("The Hurriyet");
                    myWebView.loadUrl("http://www.hurriyet.com.tr/");
                }
                if(position2 == 3)
                {
                    setTitle("The Sabah");
                    myWebView.loadUrl("http://www.sabah.com.tr/");
                }
                if(position2 == 4)
                {
                    setTitle("The Miliyet");
                    myWebView.loadUrl("http://www.milliyet.com.tr/");
                }
                if(position2 == 5)
                {
                    setTitle("The Heberturk");
                    myWebView.loadUrl("http://m.haberturk.com/htyazarlar");
                }
                if(position2 == 6)
                {
                    setTitle("The Yeni Safak");
                    myWebView.loadUrl("http://www.yenisafak.com/");
                }
                if(position2 == 7)
                {
                    setTitle("The Sozcu");
                    myWebView.loadUrl("http://www.sozcu.com.tr/reklamsiz/reklamlarkapali");
                }
                if(position2 == 8)
                {
                    setTitle("The Posta");
                    myWebView.loadUrl("http://www.posta.com.tr/");
                }
                if(position2 == 9)
                {
                    setTitle("The Vatan");
                    myWebView.loadUrl("http://www.gazetevatan.com/");
                }
            }

            else if(position1 == 21)
            {
                if(position2 == 0)
                {
                    setTitle("The VN Express");
                    myWebView.loadUrl("http://vnexpress.net/");
                }
                if(position2 == 1)
                {
                    setTitle("The Nhan Dan");
                    myWebView.loadUrl("http://www.nhandan.com.vn/");
                }
                if(position2 == 2)
                {
                    setTitle("The Viet Nam News");
                    myWebView.loadUrl("http://vietnamnews.vn/");
                }
                if(position2 == 3)
                {
                    setTitle("The Thanh Nien");
                    myWebView.loadUrl("http://thanhnien.vn/");
                }
                if(position2 == 4)
                {
                    setTitle("The Tuoi Tre");
                    myWebView.loadUrl("http://tuoitre.vn/");
                }
                if(position2 == 5)
                {
                    setTitle("The Sai Gon Giai Phong");
                    myWebView.loadUrl("http://www.sggp.org.vn/");
                }
                if(position2 == 6)
                {
                    setTitle("The Quan Doi Nhan Dan");
                    myWebView.loadUrl("http://www.qdnd.vn/");
                }
                if(position2 == 7)
                {
                    setTitle("The Le Courrier De Vietnam");
                    myWebView.loadUrl("http://lecourrier.vn/");
                }
                if(position2 == 8)
                {
                    setTitle("The Nguoi Viet Daily News");
                    myWebView.loadUrl("http://www.nguoi-viet.com/");
                }
                if(position2 == 9)
                {
                    setTitle("The Little Saigon News");
                    myWebView.loadUrl("http://www.ocregister.com/sections/news/little-saigon/");
                }
            }

            myWebView.setWebViewClient(new WebViewClient());
        }
        else
        {
            Toast.makeText(this,"No Internet Connection!!!! Please Check your Internet Connection\n And try again..", Toast.LENGTH_LONG).show();
        }
    }
}
