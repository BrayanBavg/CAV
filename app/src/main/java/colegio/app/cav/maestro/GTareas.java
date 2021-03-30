package colegio.app.cav.maestro;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import colegio.app.cav.R;

public class GTareas extends Fragment {

    private GTareasViewModel mGTareasViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mGTareasViewModel = new ViewModelProvider(this).get(GTareasViewModel.class);
        View root = inflater.inflate(R.layout.g_tareas_fragment, container, false);
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