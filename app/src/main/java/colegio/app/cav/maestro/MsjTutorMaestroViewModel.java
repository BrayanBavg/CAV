package colegio.app.cav.maestro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MsjTutorMaestroViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MsjTutorMaestroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}