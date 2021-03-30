package colegio.app.cav.alumno;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TareasAlumnoViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public TareasAlumnoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Crud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}