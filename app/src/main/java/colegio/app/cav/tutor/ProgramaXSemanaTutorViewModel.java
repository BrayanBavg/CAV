package colegio.app.cav.tutor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgramaXSemanaTutorViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ProgramaXSemanaTutorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}