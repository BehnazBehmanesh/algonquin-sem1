package Lab_4;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) throws MalformedQueryException {

		ArrayList<String> list = new ArrayList<String>(10);
		HTTP_Request request = new HTTP_Request("Test");

		ArrayList<NameValuePair> pair = new ArrayList<NameValuePair>(10);
		NameValuePair newPair = new NameValuePair("ie", "UTF-8");

		list.add("q");
		list.add("ie");
		list.add("pashe");

		/*for (String mem : list) {
			System.out.println(mem);
		}*/
		
		pair.add(newPair);
		for(int i = 0; i < 10; i++){
			System.out.println(pair.get(i));
		}
		
	/*	for (NameValuePair mem : pair) {
		System.out.println(mem);
	}*/
		/*for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
			
			pair.add(list.get(i));
		}	*/
	}
		
	
	}


