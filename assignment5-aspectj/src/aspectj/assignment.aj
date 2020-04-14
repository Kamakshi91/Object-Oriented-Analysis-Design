package aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class assignment {
	private int lineNum = 1;
	@Before("execution(*.new(..)) && !within(assignment)")
	public void logNotepadObjects(JoinPoint joinPoint){
		print("Creating object", joinPoint);
	}

	@Before("execution(* Notepad.*(..)) && !execution(* Notepad.main(..)) && !execution(* Notepad.access*(..))")
	public void logAllNotepadMethods(JoinPoint joinPoint){
		print("Executing", joinPoint);
	}
	
	@Before("execution(* Notepad.*.*(..))")
	public void logAllLevel2Methods(JoinPoint joinPoint){
		print("Executing", joinPoint);
	}
	
	public void print(String actionType, JoinPoint joinPoint){
		System.out.println(actionType + " ==> " +joinPoint.getSignature());
		if(lineNum%10 == 0)
			System.out.println();
		lineNum++;
	}
}