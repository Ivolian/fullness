package ivo.fullness;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.concurrent.TimeUnit;

import ivo.fullness.base.BaseActivity;
import rx.Observable;
import rx.functions.Action1;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delayToAd();
    }

    private void delayToAd() {
        final long delay = 1;
        // 也可以用 handler 的方式，但既然用了 rxJava ...
        Observable.timer(delay, TimeUnit.SECONDS).subscribe(new Action1<Object>() {
            @Override
            public void call(Object s) {
                startActivityAndFinish(AdActivity.class);
            }
        });
    }

}
