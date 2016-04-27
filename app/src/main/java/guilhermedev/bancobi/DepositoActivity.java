package guilhermedev.bancobi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DepositoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposito);

        Button btn = (Button)findViewById(R.id.bt_depositar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt_conta = (EditText)findViewById(R.id.deposito_numberConta);
                EditText edt_agencia = (EditText)findViewById(R.id.deposito_numberAgencia);
                EditText edt_valor = (EditText)findViewById(R.id.deposito_valorDeposito);

                Toast.makeText(DepositoActivity.this, Conta.depositar(edt_conta.getText().toString(),edt_agencia.getText().toString(),Double.parseDouble(edt_valor.getText().toString())), Toast.LENGTH_LONG).show();

            }
        });

    }

    /*
    public void gedDepositar(View v){

    }
    */
}
