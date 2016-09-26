package ivo.fullness;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final long delay = 2;
        Observable.timer(delay, TimeUnit.SECONDS).subscribe(onNext);
    }

    // 也可以用 handler 的方式，但既然用了 rxJava ...
    Action1<Object> onNext = new Action1<Object>() {
        @Override
        public void call(Object s) {
            startActivity(AdActivity.class);
        }
    };

}
