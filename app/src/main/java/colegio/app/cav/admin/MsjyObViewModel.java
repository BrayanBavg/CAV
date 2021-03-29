package colegio.app.cav.admin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MsjyObViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MsjyObViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}