package colegio.app.cav;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);
        //Cambio de colores del lado del navigation drawer
        navigationView.setBackgroundColor(getResources().getColor(R.color.blanco));
        navigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.black)));
        navigationView.setItemIconTintList(ColorStateList.valueOf(getResources().getColor(R.color.azul)));
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                //Admin
                R.id.crudUsuario, R.id.estadoCuenta, R.id.mensajeObervaciones, R.id.TemaxSemana, R.id.CalendarioActividad, R.id.FeedNews, R.id.Calificaciones,
                R.id.Msjtutor, R.id.Horario, R.id.Citas, R.id.KidsAZ,  R.id.Precio, R.id.CitasDisponibilidad,
                //Maestro
                R.id.Observaciones, R.id.MsjtutorMaestro, R.id.GTareas, R.id.MatApoyo, R.id.FeedNews2, R.id.KidsAZMaestro, R.id.CalificacionesMaestro, R.id.Bitacora,
                //Tutor
                R.id.ObservacionesTutor, R.id.EdoCuentaTutor, R.id.MensajesDirector, R.id.FeedNews3, R.id.MaterialApoyoTutor, R.id.CalificacionesTutor,
                R.id.ProgramaXmesTutor, R.id.KidsAZTutor,
                //Alumno
                R.id.MatApoyoAlumno, R.id.TareasAlumno, R.id.ProgramaXmesAlumno, R.id.FeedNews4)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}