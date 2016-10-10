package com.shine.shineplay.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.shine.shineplay.base.BaseAppCompatActivity;
import com.shine.shineplay.common.AppApplication;
import com.shine.shineplay.common.AppConstant;
import com.shine.shineplay.utils.SharedPrenfenceUtil;

public class EnterActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
    if(isFinishing()){
        return;
    }
        String versionShared = SharedPrenfenceUtil.getString(this, AppConstant.GUIDE_SHOW,"");
        String versionName = AppApplication.getAppContext().getVersion();

        if (TextUtils.isEmpty(versionShared)|| !versionShared.equalsIgnoreCase(versionName)){
            //显示引导页
            openActivity(GuideActivity.class);

        }else {
            //显示主界面
            openActivity(MainActivity.class);
        }
        finish();
    }
}
