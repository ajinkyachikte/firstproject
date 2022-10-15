package com.BankingProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("C:\\Users\\user\\eclipse-workspace\\java project\\.metadata\\.plugins\\maharashtra\\configuration\\config2.properties");

		FileInputStream file;
		try {
			pro = new Properties();
			file = new FileInputStream(src);
			pro.load(file);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassWord() {
		String password = pro.getProperty("password");
		return password;
	}

}
