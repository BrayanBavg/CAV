package colegio.app.cav.alumno;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MatApoyoAlumnoViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MatApoyoAlumnoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}