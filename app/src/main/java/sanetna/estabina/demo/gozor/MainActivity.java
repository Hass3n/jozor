package sanetna.estabina.demo.gozor;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText Name,location,Passwod,C_passwod,phone,Ent;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.name);
        location = findViewById(R.id.email);
        Passwod = findViewById(R.id.passwod);
        C_passwod = findViewById(R.id.c_passwod);
        phone = findViewById(R.id.phone);
        Ent = findViewById(R.id.ent);
        Ent.setEnabled(false);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,item.class));
            }
        });


    }
        /*register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u_name=Name.getText().toString().trim();
                String u_phone=phone.getText().toString().trim();
               String u_passwod=Passwod.getText().toString().trim();
                 String uc_passwod=C_passwod.getText().toString().trim();
                String uc_phone=phone.getText().toString().trim();


                if(u_passwod.equals(uc_passwod)) {

                    if (Validate(u_name, u_phone, u_passwod, uc_passwod,u_phone)) {

                         startActivity(new Intent(MainActivity.this,Login.class));

                    }
                }
                else {

                    C_passwod.setError("كلمة السر يجب ان تكون مطابقة");

                }
            }
        });


    }


    public boolean Validate(String name,String email,String passwod,String c_passwod,String u_phone){
        if(name.equals("")){
            Name.setError("يجب ان تدخل البيانات");
            return false;
        }
       Name.setError(null);

        if(email.equals("")){
         location.setError("يجب ان تدخل البيانات");

            return false;
        }

        location.setError(null);

        if(passwod.length()<6){
            Passwod.setError("كلمة السر لا تقل عن ستة احرف او ارقام");
            return false;
        }
        Passwod.setError(null);

        if(c_passwod.length()<6)

        {
            C_passwod.setError("كلمة السر لا تقل عن ستة احرف او ارقام");


            return false;
        }
       C_passwod.setError(null);

        if(u_phone.length()<11)

        {
           phone.setError("رقم التليفون لايقل عن 11 رقم");


            return false;
        }
       phone.setError(null);


        return true;

    }*/



}
