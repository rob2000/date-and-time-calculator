package com.robertschaller.android.dtcalc;

import java.util.Vector;

import com.robertschaller.android.dtcalc.components.Display;
import com.robertschaller.android.dtcalc.components.Memory;
import com.robertschaller.android.dtcalc.components.Stack;

/**
 * The Class Calculator.
 */
public class Calculator {

  /** The DISPLAY. */
  public static Display DISPLAY;
  
  /** The MEMORY. */
  public static Memory MEMORY;
  
  /** The STACK. */
  public static Stack STACK;

  private static int mode;
  
  public final static int MODE_NUMBER = 1;
  public final static int MODE_DECIMAL = 2;
  public final static int MODE_DATE = 3;
  public final static int MODE_PERIOD = 4;
 
  private static Vector<ModeListener> modeListeners;
  
  public static void addModeListener( ModeListener modeListener ){
    if( !modeListeners.contains( modeListener ) ){
      modeListeners.add( modeListener );
    }
  }
  
  public static void setMode( int _mode ){
    
    int oldMode = mode;
    mode = _mode;
    
    for( ModeListener listener : modeListeners ){
      listener.onModeChanged( oldMode, _mode );
    }
    
  }
  
}
