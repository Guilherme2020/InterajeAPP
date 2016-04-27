package guilhermedev.bancobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = (Button)findViewById(R.id.login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edt_username = (EditText)findViewById(R.id.usuario);
                EditText edt_senha = (EditText)findViewById(R.id.senha);


                if (Conta.Login(edt_username.getText().toString(),edt_senha.getText().toString())){

                    Intent in = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(in);

                }else{
                    Toast.makeText(LoginActivity.this, "Dados invalidos", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }





}
