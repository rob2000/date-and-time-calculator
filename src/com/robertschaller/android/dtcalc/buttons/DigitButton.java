package com.robertschaller.android.dtcalc.buttons;

import java.util.Date;

import com.robertschaller.android.dtcalc.Calculator;
import com.robertschaller.android.dtcalc.DateAndTimeCalculatorActivity;
import com.robertschaller.android.dtcalc.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * The Class DigitButton.
 */
public class DigitButton extends Button {

  /** The value. */
  protected int value;
  
  /**
   * Instantiates a new digit button.
   *
   * @param context the context
   * @param attrs the attrs
   * @param defStyle the def style
   */
  public DigitButton(Context context, AttributeSet attrs, int defStyle) {
    super( context, attrs, defStyle );
    init( context, attrs );
  }

  /**
   * Instantiates a new digit button.
   *
   * @param context the context
   * @param attrs the attrs
   */
  public DigitButton(Context context, AttributeSet attrs) {
    super( context, attrs );
    init( context, attrs );
  }

  /**
   * Instantiates a new digit button.
   *
   * @param context the context
   */
  public DigitButton(Context context) {
    super( context );
  }

  /**
   * Inits the.
   *
   * @param context the context
   * @param attrs the attrs
   */
  protected void init( Context context, AttributeSet attrs ){
    
    TypedArray attributes = context.obtainStyledAttributes( attrs, R.styleable.DigitButton );
    value = attributes.getInt( R.styleable.DigitButton_value, 0 );
    
    setOnClickListener( new OnClickListener() {      
      @Override
      public void onClick(View v) {
        Calculator.DISPLAY.setText( Integer.toString( value ) );
      }
    });
  }

}
