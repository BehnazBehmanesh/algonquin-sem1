package Lab_4;

public class Test {

	public static void main(String args[]) {
		String searchQuery = "https://www.google.ca/search?q=java+string&sourceid=chrome&ie=UTF-8";
		HTTP_Request request = null;

		try {
			request = new HTTP_Request(searchQuery, 4); // Create room to store
														// 4 parameters.
		} catch (MalformedQueryException mqe) {
			System.out.println("There was an error reading the query:" + mqe.getMessage());
		}

		
		System.out.println("This should be https: " + request.getProtocol());
		System.out.println("This should be www.google.ca: " + request.getServerAddress());
		System.out.println("This should be /search: " + request.getServerPath());
		System.out.println("This should be only search parameters:" + request.getSearchParameters());

		System.out.println("Is the string \"ie\" one of the search parameters? " + request.includesParam("ie"));
		request.paramValueSeparation();
	
		try {
			System.out.println("Value for parameter ie = " + request.getValueForParam("ie"));
			request.setValueForParam("ie", "UTF-16"); // Should throw
														// ParameterNotFoundException
														// if "ie" is not found.
			request.addParameter("UAs", "Mozilla/5.0 (Windows NT 5.1)");
		} catch (ParameterNotFoundException pnfe) {
			System.out.println(pnfe.getMessage());
		} catch (ParameterArrayFullException pafe) {
			System.out.println("The URL already has the maximum number of parameters. No more can be added.");
		}
		/*catch (NullPointerException npe) {
			System.out.println(npe.getMessage());

		}*/

		try {
			request = new HTTP_Request("localhost");
		} catch (MalformedQueryException mqe) {
			System.out.println("The software properly threw MalformedQueryException");
		}

		try {
			request = new HTTP_Request("https://localhost");
		} catch (MalformedQueryException mqe) {
			System.out.println("error reading protocol");
		}
		System.out.println("This should be https://localhost: " + request.toString());

		// Since the request is localhost, there should be no parameters. So
		// trying to add
		// one should throw an exception.
		try {
			request.addParameter("UAs", "Mozilla/5.0 (Windows NT 5.1)");
		} catch (ParameterArrayFullException pafe) {
			System.out.println("The software properly threw ParameterArrayFullException");
		}

		try {
			request.setValueForParam("Something", "Something value");
		} catch (ParameterNotFoundException pnfe) {
			// The get message should say that "The parameter name Something was
			// not found"
			System.out.println(pnfe.getMessage());
		}

	}
}
