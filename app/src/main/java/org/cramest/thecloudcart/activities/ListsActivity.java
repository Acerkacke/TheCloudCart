package org.cramest.thecloudcart.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.cramest.thecloudcart.network.Connettore;
import org.cramest.thecloudcart.network.DataHandler;
import org.cramest.thecloudcart.R;
import org.cramest.thecloudcart.network.WebsiteDataManager;

public class ListsActivity extends Activity implements DataHandler {

    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);
        username = getIntent().getExtras().getString("username");
        password = getIntent().getExtras().getString("password");

        TextView textBenvenuto = (TextView) findViewById(R.id.textBenvenuto);
        textBenvenuto.setText("Benvenuto, " + username);
        CaricaLista();
    }

    private void CaricaLista(){
        String[] parametri = {"req","user"};
        String[] valori = {"userLists",username};
        Connettore.getInstance(this).GetDataFromWebsite(this,"liste",parametri,valori);
    }

    @Override
    public void HandleData(String nome, boolean successo,String data){
        if(successo) {
            if (nome.equals("liste")) {
                String[] nomiListe = WebsiteDataManager.getNomiListeUtente(data);
                ArrayAdapter<String> listViewadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nomiListe);
                ListView lv = (ListView) findViewById(R.id.listViewMie);
                lv.setAdapter(listViewadapter);
            }
        }else{
            Toast.makeText(this, "Errore : " + data, Toast.LENGTH_SHORT).show();
        }
    }
}
