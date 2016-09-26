package ivo.fullness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ivolianer on 2016/9/26.
 */
public class BaseActivity extends AppCompatActivity {

    protected void startActivity(Class activityClazz){
        Intent intent = new Intent(this,activityClazz);
        startActivity(intent);
    }

}
