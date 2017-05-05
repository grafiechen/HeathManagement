package text.com.heathmanagement.ceShi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import text.com.heathmanagement.R;

/**
 * Created by 陈锦鹏 on 2017/4/11.
 */

public class CeShi_BMI extends Activity{
    public void bmiJiSuan(View view){
        EditText shengao = (EditText)findViewById(R.id.shengao);
        EditText tizhong = (EditText)findViewById(R.id.zhongliang);
        TextView jieguo_BMI = (TextView)findViewById(R.id.jieguo_BMI);
        double shenggao1 = Integer.parseInt(shengao.getText().toString());
        double tizhong1 = Integer.parseInt(tizhong.getText().toString());
        double bmi = tizhong1/(shenggao1*shenggao1);
        String bmi1 = bmi+"";
        jieguo_BMI.setText(bmi1);
    }
}
