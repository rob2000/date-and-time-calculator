package com.robertschaller.android.dtcalc.operators;

import com.robertschaller.android.dtcalc.values.AbstractValue;

public abstract class AbstractOperator {
  
  abstract public AbstractValue operate( AbstractValue firstValue, AbstractValue secondValue );
  
}
