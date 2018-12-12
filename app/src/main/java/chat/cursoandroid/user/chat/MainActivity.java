package chat.cursoandroid.user.chat;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ip;
    private EditText usuario;
    private EditText senha;
    private Button cadastrar;
    private Button login;
    private Button esqueci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip = findViewById(R.id.campoIpId);
        usuario = findViewById(R.id.campoUsuarioId);
        senha = findViewById(R.id.campoSenhaId);
        cadastrar = findViewById(R.id.botaoCadastrarId);
        login = findViewById(R.id.botaoLoginId);
        esqueci = findViewById(R.id.botaoEsquciId);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Cadastrar.class));
            }
        });



    }
}
