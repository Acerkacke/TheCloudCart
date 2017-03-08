package org.cramest.thecloudcart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.cramest.utils.DataSaver;

public class LandActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("LANDACTIVITY - Username salvato : " + DataSaver.getInstance().getDataString(this,"username"));
        if(Connettore.getInstance(this).isNetworkAvailable()) {
            if (DataSaver.getInstance().getDataString(this, "username") == null) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            } else {
                setContentView(R.layout.activity_land);
                String username = DataSaver.getInstance().getDataString(this, "username");
                String password = DataSaver.getInstance().getDataString(this, "password");
                new LoginApp(this, username, password);
            }
        }else{
            //Se manca la connessione ad internet facciamo l'accesso con l'ultimo account, altrimenti notifichiamo che e' necessaria una connessione internet al primo accesso
            String username = DataSaver.getInstance().getDataString(this, "username");
            String password = DataSaver.getInstance().getDataString(this, "password");

            if(username != null) {
                Intent i = new Intent(this, ListsActivity.class);
                i.putExtra("username", username);
                i.putExtra("password", password);
                startActivity(i);
                finish();
            }else{
                Toast.makeText(this,"Hai bisogno di un accesso ad internet per poter usare l'app",Toast.LENGTH_LONG);
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
