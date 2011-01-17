package com.robertschaller.android.dtcalc.buttons;

import com.robertschaller.android.dtcalc.Calculator;
import com.robertschaller.android.dtcalc.R;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * The Class ActionButton.
 */
public class ActionButton extends Button {

  protected Context context;
  
  protected String action;
  
  /**
   * Instantiates a new action button.
   *
   * @param context the context
   * @param attrs the attrs
   * @param defStyle the def style
   */
  public ActionButton(Context context, AttributeSet attrs, int defStyle) {
    super( context, attrs, defStyle );
    init( context, attrs );
  }

  /**
   * Instantiates a new action button.
   *
   * @param context the context
   * @param attrs the attrs
   */
  public ActionButton(Context context, AttributeSet attrs) {
    super( context, attrs );
    init( context, attrs );
  }

  /**
   * Instantiates a new action button.
   *
   * @param context the context
   */
  public ActionButton(Context context) {
    super( context );
  }

  /**
   * Inits the.
   */
  public void init( Context context, AttributeSet attrs ){
    
    this.context = context;

    TypedArray attributes = context.obtainStyledAttributes( attrs, R.styleable.ActionButton );
    action = attributes.getString( R.styleable.ActionButton_action );    
    
    setOnClickListener( new OnClickListener() {
      
      @Override
      public void onClick(View v) {
        if( action != null && action.equals( v.getContext().getString( R.string.action_decimal ) )){
          Calculator.DISPLAY.clear();
        }
      }
    });
    
  }
  
}
