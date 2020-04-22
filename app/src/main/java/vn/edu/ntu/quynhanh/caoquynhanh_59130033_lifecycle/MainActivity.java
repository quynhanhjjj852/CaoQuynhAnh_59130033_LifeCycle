package vn.edu.ntu.quynhanh.caoquynhanh_59130033_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called");
        Toast.makeText(getApplicationContext(), ".....", Toast.LENGTH_SHORT).show();
        txtTime = findViewById(R.id.txtTime);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTime.setText(strDate);
    }

    @Override
    protected void  onStart(){
        super.onStart();
        Log.d("LifeCycle", "onStart called");
    }

    @Override
    protected void  onResume(){
        super.onResume();
        Log.d("LifeCycle", "onResume called");
    }

    @Override
    protected void  onPause(){
        super.onPause(();
        Log.d("LifeCycle", "onPause( called");
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Log.d("LifeCycle", "onStop called");
    }
}
