package com.robertschaller.android.dtcalc.operators;

import java.util.Hashtable;

import org.joda.time.DateTime;
import org.joda.time.Period;

public abstract class AbstractOperator {

  /** The operator instances. */
  protected static Hashtable<String,AbstractOperator> operatorInstances = new Hashtable<String,AbstractOperator>();
  
  /**
   * Operate.
   *
   * @param firstValue the first value
   * @param secondValue the second value
   * @return the date time
   */
  public abstract DateTime operate(DateTime firstValue, Period secondValue);
  
  /**
   * Operate.
   *
   * @param firstValue the first value
   * @param secondValue the second value
   * @return the period
   */
  public abstract Period operate(Period firstValue, Period secondValue);
  
  /**
   * Instance of.
   *
   * @param operatorName the operator name
   * @return the abstract operator
   */
  public static AbstractOperator instanceOf( String operatorName ){
    
    AbstractOperator operator = null;
    
    if( operatorInstances.containsKey( operatorName ) ){
      operator = operatorInstances.get( operatorName );
    }else{
      String ClassName = operatorName.substring( 0, 1 ).toUpperCase() + operatorName.substring( 1 ) + "Operator";
      try {
        operator = (AbstractOperator)Class.forName( ClassName ).newInstance();
        operatorInstances.put( operatorName, operator );
      } catch ( IllegalAccessException e ) {
        e.printStackTrace();
      } catch ( InstantiationException e ) {
        e.printStackTrace();
      } catch ( ClassNotFoundException e ) {
        e.printStackTrace();
      }
    }
    
    return operator;
    
  }
}
