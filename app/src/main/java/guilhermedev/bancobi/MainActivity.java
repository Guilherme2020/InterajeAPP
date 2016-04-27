package guilhermedev.bancobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void toDeposit(View v){
        Intent in = new Intent(MainActivity.this,DepositoActivity.class);
        startActivity(in);
    }

    public void toSacar(View V){
        Intent in = new Intent(MainActivity.this,SacarActivity.class);
        startActivity(in);
    }

    public void toVerSaldo(View v){
        Intent in = new Intent(MainActivity.this,SaldoActivity.class);
        startActivity(in);
    }

}
