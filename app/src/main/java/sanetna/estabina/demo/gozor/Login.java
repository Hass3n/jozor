package sanetna.estabina.demo.gozor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class Login extends AppCompatActivity {

   // EditText ed1_email,ed2_passwod;
  Button bn_login;
    TextView txt;
    //String emailpattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt=findViewById(R.id.login_txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,MainActivity .class));
            }
        });
        bn_login=findViewById(R.id.Login);
        bn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,item.class));

            }
        });
       /* ed1_email=findViewById(R.id.login_email);
        ed2_passwod=findViewById(R.id.login_passwod);
        bn_login=findViewById(R.id.Login);
        txt=findViewById(R.id.login_txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });

        bn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login_email=ed1_email.getText().toString().trim();
                String login_passwod=ed2_passwod.getText().toString().trim();
                if(Validate(login_email,login_passwod))
                {
                  startActivity(new Intent(Login.this,item.class));
                }
            }
        });*/

    }


    /*public boolean Validate(String email,String passwod) {

      if (email.equals("")) {
          ed1_email.setError("يجب ان تدخل البيانات");

          return false;
      }

      ed1_email.setError(null);

      if (passwod.length() < 6) {
          ed2_passwod.setError("يجب ان تدخل البيانات");
          return false;
      }
      ed2_passwod.setError(null);


      return true;

  }*/


}

