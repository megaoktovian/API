package com.example.mahasiswapc.api.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mahasiswapc.api.adapter.ItemsAdapter;
import com.example.mahasiswapc.api.R;
import com.example.mahasiswapc.api.model.GetAll.GetResponse;
import com.example.mahasiswapc.api.model.GetItem.GetItemResponse;
import com.example.mahasiswapc.api.presenter.MainPresenter;
import com.example.mahasiswapc.api.presenter.MainView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    EditText a, b;
    Button btn, btn2;
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.name);
        b = findViewById(R.id.description);
        btn = findViewById(R.id.btn_submit);
        btn2 = findViewById(R.id.btn_lihat);
        mainPresenter = new MainPresenter(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.createItems(a.getText().toString(), b.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(getApplicationContext(), Tampil.class);
                startActivity(x);
            }
        });
    }

    @Override
    public void getSuccess(GetResponse list) {

    }

    @Override
    public void setToast(String message) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String errorMessage) {

    }

    @Override
    public void onFailure(String failureMessage) {

    }

    public void getSuccess2(GetItemResponse body) {

    }
}
