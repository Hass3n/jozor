package sanetna.estabina.demo.gozor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class descActivity extends AppCompatActivity {

  public static TextView txt1,txt2,txt3,txt4,txt5,txt6;
  Button txt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        txt7=findViewById(R.id.txt_map);
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://earth.nullschool.net/?fbclid=IwAR0kaL6OoRvdGeDvHyl808Y1XrjJ-xpYpd35GQdbjhTS9u0vs64GjcSdPXo#current/wind/surface/level/orthographic=-321.27,35.31,296/loc=19.926,35.694"));
                startActivity(in);
            }
        });

    }


}
