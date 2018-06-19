package com.picker.place.placepicker;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Button;

public class ActivityMainActivity extends Activity implements OnClickListener {

    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (TextView) findViewById(R.id.txt_view);
        findViewById(R.id.start_picker_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_picker_button:
                //TODO implement
                break;
        }
    }
}
