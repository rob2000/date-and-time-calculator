package com.robertschaller.android.dtcalc.components;

import android.widget.TextView;

/**
 * The Class Display.
 */
public class Display {

  /** The text view. */
  protected TextView textView;
  
  /**
   * Instantiates a new display.
   *
   * @param textView the text view
   */
  public Display( TextView textView ) {
    this.textView = textView;
  }
  
  /**
   * Sets the text.
   *
   * @param text the new text
   */
  public void setText( String text ){
    textView.setText( text );
  }
  
}
