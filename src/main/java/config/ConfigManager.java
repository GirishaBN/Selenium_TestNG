package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigManager {
	private static Properties pro;
	static {
		try (InputStream inputStream = ConfigManager.class.getClassLoader()
				.getResourceAsStream("framework.properties")) {
			pro = new Properties();
			pro.load(inputStream);
		} catch (IOException e) {
			System.out.println("file not found in the Location");
		}
	}

	public static String getString(String key) {
		return pro.getProperty(key);
	};

	public static int getInt(String key) {
		return Integer.parseInt(pro.getProperty(key));
	};

	public static boolean getBoolean(String key) {
		return Boolean.parseBoolean(key);
	};
	
	public static long getLong(String key) {
		return Long.parseLong(pro.getProperty(key));
	};
}
