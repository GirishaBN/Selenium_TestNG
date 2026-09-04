package enums;

import java.util.Arrays;

public enum BrowserType {
	CHROME, FIREFOX, EDGE;

	public static BrowserType from(String browserName) {
		if (browserName == null || browserName.isBlank())
			throw new IllegalArgumentException("browserName must not be blank or null");
		try {
			return BrowserType.valueOf(browserName.trim().toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(browserName + " is an unsupported browser. " + "Supported browsers are: "
					+ Arrays.toString(BrowserType.values()), e);
		}
	}

}
