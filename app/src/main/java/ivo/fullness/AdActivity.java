package ivo.fullness;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by ivolianer on 2016/9/26.
 */
public class AdActivity extends AppCompatActivity {

    Bitmap bitmap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);

//        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.oom);
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        Log.e("result",getResources().getDisplayMetrics().densityDpi+"");
        ButterKnife.bind(this);
        // 480
    }


}
