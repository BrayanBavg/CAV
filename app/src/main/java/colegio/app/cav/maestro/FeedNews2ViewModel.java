package colegio.app.cav.maestro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedNews2ViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FeedNews2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}