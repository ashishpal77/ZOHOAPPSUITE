package com.zohoapp.roughwork;

import org.apache.commons.exec.OS;

public class Testclass {

	public static void main(String[] args) {
		
		boolean check=System.getProperty("os.name").contains("WIN");
		System.out.println(OS.isFamilyUnix());

	}

}
