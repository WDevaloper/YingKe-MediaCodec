package com.yingke.mediacodec.connect.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yingke.mediacodec.R;
import com.yingke.mediacodec.SingleFragmentActivity;

public class MediaCodecVideoConnectActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return VideoConnectFragment.newInstance();
    }

}
