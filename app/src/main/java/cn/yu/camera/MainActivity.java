package cn.yu.camera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import cn.yu.produce.camera.CameraPreview;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ZxingViewResult:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ZxingView zxingView = findViewById(R.id.zxingView);
//        zxingView.bind(this)
//                .subscribe();
        FrameLayout frame = findViewById(R.id.frame);
        final CameraPreview cameraPreview = new CameraPreview(this, frame);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cameraPreview.onPause();
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cameraPreview.onResume();
            }
        });
    }
}
