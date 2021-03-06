package colegio.app.cav.alumno;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import colegio.app.cav.R;
import colegio.app.cav.maestro.BitacoraViewModel;

public class TareasAlumno extends Fragment {

    private TareasAlumnoViewModel mTareasAlumnoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mTareasAlumnoViewModel = new ViewModelProvider(this).get(TareasAlumnoViewModel.class);
        View root = inflater.inflate(R.layout.tareas_alumno_fragment, container, false);
        /*final TextView textView = root.findViewById(R.id.text_home);
        mCrudViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        */
        return root;
    }

}