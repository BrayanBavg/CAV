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

public class FeedNews2 extends Fragment {

    private FeedNews2ViewModel mFeedNews2ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mFeedNews2ViewModel = new ViewModelProvider(this).get(FeedNews2ViewModel.class);
        View root = inflater.inflate(R.layout.feed_news2_fragment, container, false);
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