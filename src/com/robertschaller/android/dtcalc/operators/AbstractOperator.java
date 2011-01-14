package com.robertschaller.android.dtcalc.operators;

import org.joda.time.DateTime;
import org.joda.time.Period;

public abstract class AbstractOperator {

  abstract public DateTime operate( DateTime firstValue, Period secondValue );
  
  abstract public Period operate( Period firstValue, Period secondValue );

}
