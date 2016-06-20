package Lab_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This class represents an HTTP Request.
 * 
 * It should have string variables +
 */
public class HTTP_Request {

	/** Replace the string URL, with protocol, server address, server path. */
	protected String URL;
	protected int maxSize;
	protected String protocol;
	protected String serverAdd;
	protected String server;
	protected String path;
	protected String parameter;

	String param;
	String valueOfParam;
	String param_tmp;
	int eqPos;

	/** Also create an ArrayList to store NameValuePair objects */
	ArrayList<NameValuePair> pair = new ArrayList<NameValuePair>();
	// NameValuePair newPair = new NameValuePair();

	/**
	 * Since you should no longer store the entire string. Instead rebuild the
	 * URL from the various parts.
	 * 
	 * @return The combination of protocol,server address, server path, and
	 *         search parameters
	 */
	public String getURL() {
		return toString(); // String.valueOf(protocol+server+server+path+parameter);
					// //URL;

	} // should return toString() instead

	/**
	 * Constructor to call a missing constructor that sets the initial limit for
	 * the number of parameters.
	 * 
	 * @param initial
	 *            The initial search query.
	 */
	public HTTP_Request(String initial) throws MalformedQueryException {
		this(initial, 0); // Create this constructor. -1 means no limit to
							// number of parameters
	}

	public HTTP_Request(String searchQuery, int i) throws MalformedQueryException {
		URL = searchQuery;
		maxSize = i; // i is number of parameters the HTTP_Request object can
						// hold.
		// -1 means no limit exists.
		try {
			urlParts();
		} catch (StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		}
		
		paramValueSeparation();
	}

	/////////////////////////

	public void urlParts() throws StringIndexOutOfBoundsException {

		if (URL.indexOf(":") < 0) {
			throw new StringIndexOutOfBoundsException("The protocol could not be determined.");
		} else {
			protocol = URL.substring(0, URL.indexOf(":"));
			serverAdd = URL.substring(URL.indexOf(":") + 3, URL.length());
		}

		if (URL.indexOf(":") >= 0 && serverAdd.length() > 0) {
			if (serverAdd.indexOf("/") >= 0 && serverAdd.indexOf("?") >= 0) {
				server = serverAdd.substring(0, serverAdd.indexOf("/"));
				path = serverAdd.substring(serverAdd.indexOf("/"), serverAdd.indexOf("?"));
				parameter = serverAdd.substring((serverAdd.indexOf("?") + 1), serverAdd.length());

			} else if (serverAdd.indexOf("/") >= 0 && serverAdd.indexOf("?") < 0) {
				server = serverAdd.substring(0, serverAdd.indexOf("/"));
				path = serverAdd.substring(serverAdd.indexOf("/"), serverAdd.length());
				parameter = "";
			} else {
				server = serverAdd.substring(0, serverAdd.length());
				path = "";
				parameter = "";
			}
		}

	
	}


	/**
	 * Returns a string that reconstructs the URL
	 * 
	 * @return the combination of protocol, server address, server path, and
	 *         query string.
	 */
	public String toString() {
		return "" + protocol + "://" + server + path + parameter; // Change what
																	// gets
		// returned.
	}

	public String getProtocol() {
		return protocol;
	}

	public String getServerAddress() {
		return server;
	}

	public String getServerPath() {
		return path;
	}

	public String getSearchParameters() {
		return parameter;
	}

	public void paramValueSeparation() {
		while (parameter.length() >= 1) {
			parameter = parameter.trim(); // trim() removes white spaces
			if (parameter.contains("&")) {

				param_tmp = parameter.substring(0, parameter.indexOf("&"));

			} else {
				param_tmp = parameter;
			}
			eqPos = param_tmp.indexOf("=");
			param = param_tmp.substring(0, eqPos);
			valueOfParam = param_tmp.substring(param_tmp.indexOf("=") + 1, param_tmp.length());

			try {
				addParameter(param, valueOfParam);
			} catch (ParameterArrayFullException e) {
				e.printStackTrace();
			}

			if (parameter.contains("&")) {
				parameter = parameter.substring(param_tmp.length() + 1, parameter.length());

			} else {
				parameter = "";
			}
		}
	}

	/**
	 * 10. Write an algorithm that separates each of these parts of the search
	 * query, and sets the server name, server path, and query string name/value
	 * variables of the HTTP_Request object.
	 */

	public boolean includesParam(String name) {

		boolean check=false;
		int i = 0; 
		for (i = 0; i < pair.size(); i++) {
			if (pair.get(i).getName().equals(name)) {
				check=true;
			} 
		}	return check;
		
		
		
	}

	public String getValueForParam(String name) {// throws
		int i = 0; // NullPointerException {
		for (i = 0; i < pair.size(); i++) {
			if (pair.get(i).getName().equals(name)) {
				return pair.get(i).getValue();
			}
		}
		return pair.get(i).getValue();
	}
	

	public void setValueForParam(String name, String value) throws ParameterNotFoundException {
		boolean check=false;
		int i = 0; 
		for (i = 0; i < pair.size(); i++) {
			if (pair.get(i).getName().equals(name)) {
				check=true;
				pair.set(i, new NameValuePair(name, value));
				break;
			} 
		}	
			if (check==false){
			throw new ParameterNotFoundException("The parameter name Something was not found");
			}

		
	}

	public void addParameter(String name, String value) throws ParameterArrayFullException {

		if (pair.size() == maxSize) {
			throw new ParameterArrayFullException("Max size of array has reached!");
		}

		pair.add(new NameValuePair(name, value));

	}

	/** Create a private inner class called NameValuePair: */
	class NameValuePair {
		String name;
		String value;

		public NameValuePair() {
			this.name = null;
			this.value = null;
		}

		public NameValuePair(String name, String value) {
			this.name = name;
			this.value = value;
		}

		String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		String getValue() {
			return value;
		}

		void setValue(String value) {
			this.value = value;
		}
	}

}
