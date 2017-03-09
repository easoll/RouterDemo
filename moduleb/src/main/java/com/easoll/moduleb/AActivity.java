package com.easoll.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.easoll.routermodule.CenterRouter;

public class AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_a);

        Button button = (Button)findViewById(R.id.btn_start_activity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CenterRouter.getInstance().startActivity(AActivity.this, CenterRouter.MODULE_A_ACTIVITY_A);
            }
        });
    }
}
