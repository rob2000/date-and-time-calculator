package com.robertschaller.android.dtcalc.components;

import android.widget.TextView;

public class Display {

  protected TextView textView;
  
  public Display( TextView textView ) {
    this.textView = textView;
  }
  
  public void setText( String text ){
    textView.setText( text );
  }
  
}
