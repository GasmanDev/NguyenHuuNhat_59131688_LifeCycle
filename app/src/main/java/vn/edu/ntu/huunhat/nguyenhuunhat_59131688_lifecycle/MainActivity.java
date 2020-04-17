package vn.edu.ntu.huunhat.nguyenhuunhat_59131688_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate");
        makeText(getApplicationContext(), "onCreate", LENGTH_SHORT).show();txtTG =  findViewById(R.id.textView);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
        makeText(getApplicationContext(), "onStart", LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
        makeText(getApplicationContext(), "onRestart", LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
        makeText(getApplicationContext(), "onResume", LENGTH_SHORT).show();
        SimpleDateFormat sdf = new  SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        String date = sdf.format(new Date());
        txtTG.setText(date);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
        makeText(getApplicationContext(), "onPause", LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
        makeText(getApplicationContext(), "onStop", LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
        makeText(getApplicationContext(), "onDestroy", LENGTH_SHORT).show();
    }
}
