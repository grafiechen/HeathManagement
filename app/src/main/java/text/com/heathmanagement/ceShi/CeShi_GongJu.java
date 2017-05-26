package text.com.heathmanagement.ceShi;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;

import text.com.heathmanagement.R;

/**
 * Created by 陈锦鹏 on 2017/4/11.
 */

public class CeShi_GongJu extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("测试工具");
        setContentView(R.layout.activity_ceshi_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        // -------------向menu中添加子菜单-------------
        MenuItem bmi = menu.add("BMI测试");
        MenuItem shili = menu.add("视力测试");
        MenuItem xinlv = menu.add("心率测试");
        MenuItem yundong = menu.add("运动监控");
        //为菜单项设置关联的Activity
//        bmi.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
//            public boolean onMenuItemClick(MenuItem item){
//                return true;
//            }
//        });
    return super.onCreateOptionsMenu(menu);
    }

}
