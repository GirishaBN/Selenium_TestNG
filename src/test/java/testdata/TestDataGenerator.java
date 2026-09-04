package testdata;

import java.util.UUID;

public final class TestDataGenerator {
	public static String uniqueID() {
		return UUID.randomUUID().toString().substring(0, 8);
	};
	
	public static String uniqueEmail(String prefix) {
		return prefix+uniqueID()+"@gmail.com";
	};
	public static String uniquePassword(String prefix){
		return prefix+"_"+uniqueID();
	};

}
