package colegio.app.cav.alumno;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedNews4ViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FeedNews4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}