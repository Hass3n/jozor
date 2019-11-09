package sanetna.estabina.demo.gozor;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splach extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(splach.this,Login.class));
               finish();
            }
        },2000);


    }
}
