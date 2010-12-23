package com.robertschaller.android.dtcalc.buttons;

import java.util.Date;

import com.robertschaller.android.dtcalc.DateAndTimeCalculatorActivity;
import com.robertschaller.android.dtcalc.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DigitButton extends Button {

  protected int value;
  
  public DigitButton(Context context, AttributeSet attrs, int defStyle) {
    super( context, attrs, defStyle );
    init( context, attrs );
  }

  public DigitButton(Context context, AttributeSet attrs) {
    super( context, attrs );
    init( context, attrs );
  }

  public DigitButton(Context context) {
    super( context );
    // TODO Auto-generated constructor stub
  }

  protected void init( Context context, AttributeSet attrs ){
    
    TypedArray attributes = context.obtainStyledAttributes( attrs, R.styleable.DigitButton );
    value = attributes.getInt( R.styleable.DigitButton_value, 0 );
    
    setOnClickListener( new OnClickListener() {      
      @Override
      public void onClick(View v) {
        DateAndTimeCalculatorActivity.display.setText( Integer.toString( value ) );
      }
    });
  }

  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    return super.onKeyDown( keyCode, event );
  }
  
}
