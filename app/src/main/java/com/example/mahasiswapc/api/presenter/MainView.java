package com.example.mahasiswapc.api.presenter;


import com.example.mahasiswapc.api.model.GetAll.GetResponse;
import com.example.mahasiswapc.api.model.GetItem.GetItemResponse;


public interface MainView {


    void onError(String message);

    void onFailure(String message);

    void setToast(String message);

    void getSuccess(GetResponse list);

    void getSuccess2(GetItemResponse itemList);
}
