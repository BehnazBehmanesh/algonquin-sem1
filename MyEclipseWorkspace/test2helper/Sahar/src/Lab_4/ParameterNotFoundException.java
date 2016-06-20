package Lab_4;

public class ParameterNotFoundException extends Exception {

	protected String parameter=new String();


	public ParameterNotFoundException(String string) {

	}

	public ParameterNotFoundException() {

	}

	public String getParameter() {
		return parameter;
	}

}
