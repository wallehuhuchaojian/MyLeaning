package com.crazybaby.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.crazybaby.databinding.databinding.ActivityMainBinding;
import com.crazybaby.databinding.pojo.TestUser;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        TestUser testUser=new TestUser("walle","sb");
        binding.setUser(testUser);
        binding.name.setBackgroundColor(0xffcdcdcd);
    }
}
