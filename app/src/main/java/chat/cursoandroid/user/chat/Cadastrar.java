package chat.cursoandroid.user.chat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cadastrar extends AppCompatActivity {

    private EditText ip;
    private EditText nome;
    private EditText usuario;
    private EditText senha;
    private EditText cpf;
    private EditText sobrenome;
    private Button voltar;
    private Button cadastrar;
    private Socket cliente;
    private PrintStream saida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        nome = findViewById(R.id.campoCNomeId);
        usuario = findViewById(R.id.campoCUsuarioId);
        senha = findViewById(R.id.campoCSenhaId);
        cpf = findViewById(R.id.campoCCpfId);
        ip = findViewById(R.id.campoCIpId);
        sobrenome = findViewById(R.id.campoCSobrenomeId);
        voltar = findViewById(R.id.botaoCVoltarId);
        cadastrar = findViewById(R.id.botaoCCadastrarId);


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cadastrar.this,MainActivity.class));
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConexaoCadastro c = new ConexaoCadastro();
                c.execute(nome.getText().toString(),sobrenome.getText().toString(),cpf.getText().toString(),usuario.getText().toString(),senha.getText().toString(),ip.getText().toString());

            }
        });
    }



}
