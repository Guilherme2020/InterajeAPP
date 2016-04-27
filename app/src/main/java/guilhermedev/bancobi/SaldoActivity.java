package guilhermedev.bancobi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SaldoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
    }

    public void getSaldo(View v){
        EditText edt = (EditText)findViewById(R.id.saldo_numberConta);

        Toast.makeText(SaldoActivity.this, "Saldo: "+Conta.getSaldoMonetario(edt.getText().toString()), Toast.LENGTH_LONG).show();
    }
}
