package com.robertschaller.android.dtcalc.buttons;

import com.robertschaller.android.dtcalc.Calculator;
import com.robertschaller.android.dtcalc.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * The Class ActionButton.
 */
public class ActionButton extends Button {

  protected Context context;
  
  /**
   * Instantiates a new action button.
   *
   * @param context the context
   * @param attrs the attrs
   * @param defStyle the def style
   */
  public ActionButton(Context context, AttributeSet attrs, int defStyle) {
    super( context, attrs, defStyle );
    init( context );
  }

  /**
   * Instantiates a new action button.
   *
   * @param context the context
   * @param attrs the attrs
   */
  public ActionButton(Context context, AttributeSet attrs) {
    super( context, attrs );
    init( context );
  }

  /**
   * Instantiates a new action button.
   *
   * @param context the context
   */
  public ActionButton(Context context) {
    super( context );
    init( context );
  }

  /**
   * Inits the.
   */
  public void init( Context context ){
    
    this.context = context;
    
    setOnClickListener( new OnClickListener() {
      
      @Override
      public void onClick(View v) {
        
        switch( getId() ){
        
          case R.id.ButtonClearDisplay:
            Calculator.DISPLAY.clear();
            break;
        
        }
        
      }
    });
    
  }
  
}
