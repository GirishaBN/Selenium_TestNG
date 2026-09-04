package enums;

public enum ExecutionMode {
LOCAL,GRID;
public static ExecutionMode from(String executionMode) {
if(executionMode==null||executionMode.isBlank())
throw new IllegalArgumentException("execution mode must not be null or blank");
try {
return ExecutionMode.valueOf(executionMode);
}
catch(IllegalArgumentException e)
{
	throw new IllegalArgumentException(executionMode+"is not supported, supported browsers are:"+values(),e);
	}
}
}
