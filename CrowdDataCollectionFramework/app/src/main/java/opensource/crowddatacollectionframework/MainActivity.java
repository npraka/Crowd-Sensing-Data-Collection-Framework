package opensource.crowddatacollectionframework;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.buttonDataWriteServiceStart);
        stop = (Button) findViewById(R.id.buttonDataWriteServiceStop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);



    }

    @Override
    public void onClick(View view){
        if (view == start){
            startService(new Intent(this,DataWriteService.class));
        }else if(view == stop){
            stopService(new Intent(this,DataWriteService.class));
        }
    }

}
