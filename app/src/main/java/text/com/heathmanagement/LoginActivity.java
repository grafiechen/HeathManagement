package text.com.heathmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    static int password =  0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        EditText passwordnum = (EditText)findViewById(R.id.password);
        int passwordnumber = Integer.parseInt(passwordnum.toString());
        Intent login = new Intent(LoginActivity.this,MainActivity.class);
        if(password == 0){
            password = passwordnumber;
            startActivity(login);
        }else if(password == passwordnumber){
            startActivity(login);
        }else{
            TextView t = (TextView)findViewById(R.id.tip_login);
            t.setText("输入的密码有误");
        }
    }
}
