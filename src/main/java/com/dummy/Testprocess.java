package com.dummy;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;


public class Testprocess implements JavaDelegate{

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
	System.out.println("****************************testclass***********************************");
	
	}

}
