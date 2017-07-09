package com.example.nochiketa.grid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

public class Main3Activity extends AppCompatActivity {
    ListView listView;
    String[] val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        final int position = extras.getInt("POS");

        listView = (ListView) findViewById(R.id.list2);

        if(position == 0)
        {
            setTitle("USA Newspapers");
            val = new String[] {"The Washington Post", "The New York Post", "The Wall Street Journal",
                    "Chicago Tribune", "Las Vegas Sun", "USA Today", "The Washington Times",
                    "The Boston Hehald", "The Dallas News", "The Advocate"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 1)
        {
            setTitle("India Newspapers");
            val = new String[] {"The Times of India", "The Hindu", "The Hindustan Times",
                    "The Indian Express", "The Sandesh", "The Tribune", "The Ananda Bazar",
                    "The Mumbai Mirror", "The Jagaran", "The Lokmat"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 2)
        {
            setTitle("Bangladesh Newspapers");
            val = new String[] {"The Prothom-Alo", "The Jugantor", "The Kaler Kontho",
                    "The Samakal", "The Ittefaq", "The Daily Star", "The Amar Desh",
                    "The Bangladesh Observer", "The Naya Diganta", "The Jonokontho"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 3)
        {
            setTitle("UK Newspapers");
            val = new String[] {"The Daily Telegraph", "The Guardian", "The Daily Mail",
                    "The Independent", "The Times", "The Mirror", "The Sun",
                    "The Express", "The Observer", "The Morning Star"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 4)
        {
            setTitle("Russia Newspapers");
            val = new String[] {"The Pravada", "The Novaya Gazetta", "The Komersant",
                    "The Izvestia", "The Komsomolskya Pravada", "The Argumenty i Fakty",
                    "The Nezavisimaya Gazeta", "The Trud", "The Rosiskya Gazeta", "The Sport Express"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 5)
        {
            setTitle("Australia Newspapers");
            val = new String[] {"The Australian", "The Herald Sun", "The Daily Telegraph",
                    "The Sydney Morning Herald", "The Advertiser", "The Courier-Mail", "The West Australian",
                    "The Age", "The Sunday Times", "The Australian Financial Review"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 6)
        {
            setTitle("Canada Newspapers");
            val = new String[] {"The Medium", "The Star", "The Globe and Mail",
                    "The National Post", "The Calgary Herald", "The Montreal Gazette", "The Toronto Sun",
                    "The London Free Press", "The Financial Post", "The Telegram"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 7)
        {
            setTitle("France Newspapers");
            val = new String[] {"The Le Monde", "The Le Figaro", "The Le Perisian",
                    "The Liberation", "The Lesechos", "The Lequipe", "The 20 Minutes",
                    "The Ouest-France", "The L'Humanite", "The La Croix"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 8)
        {
            setTitle("Germany Newspapers");
            val = new String[] {"The Bild", "The Sudeutsche Zeitung", "The Die Weilt",
                    "The Die Zeit", "The Die Tageszeitung", "The Frankfurter Rundschau", "The Handelsblatt",
                    "The Berliner Morgenpost", "The Der Taggespiegel", "The Kurier"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 9)
        {
            setTitle("Japan Newspapers");
            val = new String[] {"The Yomiuri Shimbun", "The Japan Times", "The Asahi Shimbun",
                    "The Mainichi Shimbun", "The Sankei Shimbun", "The Chunichi Shimbun", "The Japan Today",
                    "The Nishinippon Shimbun", "The Tokyo Sports", "The Tokyo Shimbun"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        else if(position == 10)
        {
            setTitle("China Newspapers");
            val = new String[] {"The Chaina Daily", "The People's Daily", "The South Chain Morning Post",
                    "The Sanghai Daily", "The Chaina Press", "The Chaina Post", "The Chaina Times",
                    "The Sanghai Star", "The Legal Daily", "The Xinhua Daily"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 11)
        {
            setTitle("South Africa Newspapers");
            val = new String[] {"The Mail and Guardian", "The Swoetan", "The City Press", "The Star",
                    "The Cape Times", "The Cape Argus", "The Sunday Times",
                    "The Beld", "The Times", "The Daily Sun"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 12)
        {
            setTitle("Spain Newspapers");
            val = new String[] {"The El Pias", "The Elmundo", "The Marca", "The ABC",
                    "The El Periodico de Cataluniya", "The Cinco Dias", "The El Correo",
                    "The La Razon", "The Diario AS", "The Expansion"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 13)
        {
            setTitle("Pakistan Newspapers");
            val = new String[] {"The Dawn", "The News International", "The Daily Jang",
                    "The National", "The Daily Times", "The Daily Express", "The Pakistan",
                    "The Nawa-I-Waqt", "The Front Post", "The Pakistan Observer"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 14)
        {
            setTitle("Italy Newspapers");
            val = new String[] {"The Corriere Della Cera", "The La Reppublica", "The La Stumpa",
                    "The La Gezzetta Delo Sport", "The Messaggero", "The Sole 24 Ore",
                    "The Giornale", "The Mattino", "The L'Unita", "The Libero"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 15)
        {
            setTitle("South Korea Newspapers");
            val = new String[] {"The Chosun Ilbo", "The Korea Times", "The Korea Herald",
                    "The Hankyoreh", "The Hankook Ilbo", "The Seoul Shinmun", "The Korea Economic Daily",
                    "The JoongAng Dailay" , "The Maeil Businees Newspaper", "The Kukmin Daily"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 16)
        {
            setTitle("North Korea Newspapers");
            val = new String[] {"The North Korea Times", "The North Korea News",
                    "The Daily North Korea", "The Korea Times", "The Korea Herald"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 17)
        {
            setTitle("Indonesia Newspapers");
            val = new String[] {"The Kompas", "The Jakarta Post", "The Bisnis Indonesia",
                    "The Pikiran Rakiyat", "The Saura Merdeka", "The Jawa Pos", "The Jakarta Globe",
                    "The Republica" , "The Media Indonesia", "The Koran Tempo"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 18)
        {
            setTitle("Switzerland Newspapers");
            val = new String[] {"The Neue Zurcher Zeitung", "The Tages-Anzeiger", "The Le Temps",
                    "The Blick", "The Basler Zeitung", "The 24 Heures", "The Berner Zeitung",
                    "The Le Matin" , "The 20 Minuten", "The St. Galler Tagblatt"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 19)
        {
            setTitle("Argentina Newspapers");
            val = new String[] {"The Clarin", "The La Nacion", "The El Cronista", "The Pagin/12",
                    "The Cronica", "The Ambito Financiero", "The Buenos Aires Herald",
                    "The La Voz Del Interior" , "The Ole", "The El Dia"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 20)
        {
            setTitle("Turkey Newspapers");
            val = new String[] {"The Cumhuriyet", "The Hurriyet Daily News", "The Hurriyet",
                    "The Sabah", "The Miliyet", "The Haberturk", "The Yeni Safak", "The Sozcu",
                    "The Posta", "The Vatan"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }

        else if(position == 21)
        {
            setTitle("Vietnam Newspapers");
            val = new String[] {"The VN Express", "The Nhan Dan", "The Viet Nam News",
                    "The Thanh Nien", "The Tuoi Tre", "The Sai Gon Giai Phong", "The Quan Doi Nhan Dan",
                    "The Le Courrier De Vietnam", "The Nguoi Viet Daily News", "The Little Saigon News"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {

                Intent intent= new Intent(Main3Activity.this, Main2Activity.class);
                intent.putExtra("POS", pos);
                intent.putExtra("POSITION", position);
                startActivity(intent);
            }
        });

    }

}
