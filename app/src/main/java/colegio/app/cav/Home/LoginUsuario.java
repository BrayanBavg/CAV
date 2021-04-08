package colegio.app.cav.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import colegio.app.cav.MainActivity;
import colegio.app.cav.R;

public class LoginUsuario extends AppCompatActivity {

    Button btnMenu;
    TextView txtRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);

        btnMenu=(Button) findViewById(R.id.btnIngresar);
        txtRegistrar=(TextView) findViewById(R.id.txtRegistrar);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        txtRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Registrar.class);
                startActivity(i);
            }
        });
    }
}