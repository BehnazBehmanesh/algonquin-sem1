package Lab_4;

public class NameValuePair {
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