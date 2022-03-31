package com.example.mob_duanmau.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Wellcome Phương Nam Book" +
                "Cảm ơn bạn đã đến với tôi");
    }
    public LiveData<String> getText() {
        return mText;
    }
}