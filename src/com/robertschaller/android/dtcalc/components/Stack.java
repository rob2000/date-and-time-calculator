package com.robertschaller.android.dtcalc.components;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class Stack {

  protected DateTime dateTimeResult;
  
  protected Period datePeriodResult;
  
  protected String calculation;
  
  protected boolean dateMode;
  
  public Stack(){
    dateMode = false;
  }
  
  public void push( String operation, Period period ){
      
  }
  
  public void push( String operation, DateTime dateTime ){
    dateMode = true;
  }
  
}
