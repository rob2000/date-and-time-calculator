package com.robertschaller.android.dtcalc.values;

public abstract class AbstractValue {
  
  public long milliseconds;
  
  abstract public boolean isPeriod();
  
  abstract public boolean isDate();
  
  abstract public long getMilliseconds();
  
}
