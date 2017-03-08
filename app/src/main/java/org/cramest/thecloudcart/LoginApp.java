package org.cramest.thecloudcart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import org.cramest.utils.DataSaver;

/**
 * Created by User on 19/01/2017.
 */

public class LoginApp implements DataHandler {

    String Username;
    String Password;
    Activity a;

    public LoginApp(Activity a, String username, String password){
        String[] parametri = {"req","user","pass"};
        String[] valori = {"login",username,password};
        Username = username;
        Password = password;
        this.a = a;
        Connettore.getInstance(a).GetDataFromWebsite(this,"loginApp",parametri,valori);
    }

    @Override
    public void HandleData(String nome,boolean success,String data) {
        if(nome.equals("loginApp")){
            //Data conterra' il nome utente, quindi controlliamo di averlo salvato giusto
            if(success){
                System.out.println("Nome utente e password corretti");
                Intent i = new Intent(a, ListsActivity.class);
                i.putExtra("username", Username);
                i.putExtra("password", Password);
                DataSaver.getInstance().saveDataString(a,"username",Username);
                DataSaver.getInstance().saveDataString(a,"password",Password);
                //System.out.println("Salvato nome utente e password : " + DataSaver.getInstance().getDataString(c,"username") + " - " + DataSaver.getInstance().getDataString(c,"password"));
                a.startActivity(i);
                a.finish();
            }else{
                Toast.makeText(a, "Errore : " + data, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
