package custmoer.rangebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RangeChooseBar bar = (RangeChooseBar) findViewById(R.id.rangechoosebar);
        bar.setOnRangeChooseListener(new RangeChooseBar.RangeChooseListener() {
            @Override
            public void chooseResult(int min, int max) {
                Toast.makeText(getBaseContext(),"Min-->"+min + "　"+"Max-->"+max,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
