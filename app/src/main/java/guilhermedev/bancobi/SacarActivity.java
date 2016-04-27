package guilhermedev.bancobi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SacarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacar);


        Button btn = (Button)findViewById(R.id.btn_saque);


       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               EditText edt_conta = (EditText)findViewById(R.id.sacar_numberConta);
               EditText edt_agencia = (EditText)findViewById(R.id.sacar_numberAgencia);
               EditText edt_valor = (EditText)findViewById(R.id.sacar_valorSaque);


               Toast.makeText(SacarActivity.this, Conta.sacar(edt_conta.getText().toString(),edt_agencia.getText().toString(),Double.parseDouble(edt_valor.getText().toString())), Toast.LENGTH_LONG).show();


           }
       });

    }





}
