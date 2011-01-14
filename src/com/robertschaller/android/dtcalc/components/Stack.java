package com.robertschaller.android.dtcalc.components;

import org.joda.time.DateTime;
import org.joda.time.Period;

import com.robertschaller.android.dtcalc.operators.AbstractOperator;
import com.robertschaller.android.dtcalc.operators.IllegalOperationException;

public class Stack {

  /** The date time result. */
  protected DateTime dateTimeResult;
  
  /** The period result. */
  protected Period periodResult;
  
  /** The calculation. */
  protected String calculation;
  
  /** The date mode. */
  protected boolean dateMode;
  
  /**
   * Instantiates a new stack.
   */
  public Stack(){
    dateMode = false;
  }
  
  /**
   * Push.
   *
   * @param operation the operation
   * @param period the period
   */
  public void push( String operation, Period period ){
    if( dateMode ){
      dateTimeResult = AbstractOperator.instanceOf( operation ).operate( dateTimeResult, period );
    }else{
      periodResult = AbstractOperator.instanceOf( operation ).operate( periodResult, period );
    }
  }
  
  /**
   * Push.
   *
   * @param operation the operation
   * @param dateTime the date time
   * @throws IllegalOperationException the illegal operation exception
   */
  public void push( String operation, DateTime dateTime ) throws IllegalOperationException{
    if( dateMode ){
      throw( new IllegalOperationException( "date can't be added to date" ) );
    }else{
      dateTimeResult = AbstractOperator.instanceOf( operation ).operate( dateTime, periodResult );
      dateMode = true;
    }
  }
  
}
