package com.robertschaller.android.dtcalc;

import com.robertschaller.android.dtcalc.components.Display;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DateAndTimeCalculatorActivity extends Activity {
  
    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState the saved instance state
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Calculator.DISPLAY = new Display( (TextView)findViewById( R.id.CalculatorDisplay ) );
    }
}