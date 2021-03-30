package colegio.app.cav.tutor;

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

public class ProgramaXSemanaTutor extends Fragment {

    private ProgramaXSemanaTutorViewModel mProgramaXSemanaTutorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mProgramaXSemanaTutorViewModel = new ViewModelProvider(this).get(ProgramaXSemanaTutorViewModel.class);
        View root = inflater.inflate(R.layout.programa_x_semana_tutor_fragment, container, false);
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