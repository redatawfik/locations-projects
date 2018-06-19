package com.picker.place.placepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {


    @BindView(R.id.t1)
    TextView t1;
    @BindView(R.id.t2)
    TextView t2;
    @BindView(R.id.t3)
    TextView t3;
    @BindView(R.id.t4)
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

    }


    public String format() {
        String name = "reda";
        return "var " + name + " : " + " ) " + "{\n}";
    }

    @OnClick(R.id.t1)
    public void onT1Clicked() {
    }

    @OnClick(R.id.t2)
    public void onT2Clicked() {
    }

    @OnClick(R.id.t3)
    public void onT3Clicked() {
    }

    @OnClick(R.id.t4)
    public void onT4Clicked() {
    }
}
