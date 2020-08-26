package mx.tec.example1_itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;
    SeekBar mySeekBar;
    RatingBar myRatingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView);
        mySeekBar = findViewById(R.id.seekBar);
        myRatingBar = findViewById(R.id.ratingBar);
    }
}