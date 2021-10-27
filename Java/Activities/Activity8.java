package activities;

class CustomException extends Exception{
	private String message = null;
	CustomException(String message){
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
public class Activity8 {

	public static void main(String[] args) {
		try {
			Activity8.exceptionTest("will print to console");
			Activity8.exceptionTest(null);
		}catch(CustomException ce) {
			System.out.println("Exception in Catch: "+ce.getMessage());
		}

	}
	static void exceptionTest(String exception) throws CustomException{
		if(exception == null) {
			throw new CustomException("String Value is null");
		}else
			System.out.println(exception);
	}
}
