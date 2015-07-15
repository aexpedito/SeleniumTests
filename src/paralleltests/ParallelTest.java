package paralleltests;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelTest 
{
	@Test
	public void testParallelAdminReportMethods()
	{
		Class[] classes ={ParallelAdminTest.class};
		//Class[] classes ={ParallelAdminTest.class, ParallelReportTest.class};
		
		//Parallel among classes  
	    //JUnitCore.runClasses(ParallelComputer.classes(), classes);  
	
	    //Parallel among methods in a class  
	    //JUnitCore.runClasses(ParallelComputer.methods(), classes);  
	
	    //Parallel all methods in all classes  
	    JUnitCore.runClasses(new ParallelComputer(true, true), classes); 
	}

}
