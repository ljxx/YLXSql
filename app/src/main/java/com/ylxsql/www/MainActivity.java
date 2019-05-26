package com.ylxsql.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.m_sql_txt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(1, "张三丰", "qqqqqq");
                BaseDao baseDao = BaseDaoFactory.getInstance().getBaseDao(User.class);
                baseDao.insert(user);
            }
        });
    }
}
