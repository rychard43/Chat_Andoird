package chat.cursoandroid.user.chat;

import android.os.AsyncTask;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ConexaoCadastro extends AsyncTask <String,String,String> {




    @Override
    protected String doInBackground(String... strings) {

        try {
            Socket cliente = new Socket(strings[5], 5555);
            System.out.println("Cliente conectado ao servidor");

            PrintStream saida = new PrintStream(cliente.getOutputStream());
            saida.println("cadastrar " + strings[0] + " " + strings[1] + " " + strings[2] + " " + strings[3] + " " + strings[4]);

            Scanner s = new Scanner(cliente.getInputStream());
            String resposta = s.nextLine();

            if (resposta.equals("true")) {

                cliente.close();

            } else {


                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("error cadastro");
        }

        return null;
    }
}
