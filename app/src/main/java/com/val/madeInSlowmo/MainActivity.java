package com.val.madeInSlowmo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.val.madeInSlowmo.adaptors.FragmentAdaptor;
import com.val.madeInSlowmo.utils.database.DBHelper;

import java.util.function.Predicate;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper=new DBHelper(this,"myDb",1);
        SQLiteDatabase sqLiteDatabase=dbHelper.getWritableDatabase();

        pager=(ViewPager) findViewById(R.id.viewpager);
        layout=findViewById(R.id.TabLayout);
        FragmentAdaptor fragmentAdaptor=new FragmentAdaptor(getSupportFragmentManager());

        pager.setAdapter(fragmentAdaptor);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position==1)
                Log.e("MyTag","position= "+position);
                Log.e("MyTag","position= "+position);

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



}
