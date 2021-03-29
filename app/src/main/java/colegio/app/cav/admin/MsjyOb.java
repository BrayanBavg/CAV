package colegio.app.cav.admin;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import colegio.app.cav.R;

public class MsjyOb extends Fragment {

    private MsjyObViewModel mMsjyObViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mMsjyObViewModel =
                new ViewModelProvider(this).get(MsjyObViewModel.class);
        View root = inflater.inflate(R.layout.crud_usuario_fragment, container, false);
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