package ina.devera.com.deverainalab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DeVeraInaLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_vera_ina_lab5);
        Log.d("4ITH","tumakbo si onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH","onResume() has executed...");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH","onStop() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH","onPause() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH","onRestart() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH","onDestroy() has executed...");
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()== R.id.act2) {
            i = new Intent(this, Activity_2.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.map) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 11.094622, 119.388179"));
            startActivity(i);
        }

    }
}

