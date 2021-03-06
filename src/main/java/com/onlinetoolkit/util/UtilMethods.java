package com.onlinetoolkit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UtilMethods {

	public static final Logger LOGGER = Logger.getLogger(UtilMethods.class.getName());
	
	public static String getDiff(String list1, String list2) {
		try {
			Set<String> l1 = new HashSet<String>(Arrays.asList(list1.split("\n")));
			Set<String> l2 = new HashSet<String>(Arrays.asList(list2.split("\n")));
			l1.removeAll(l2);
			String finalString = new TreeSet<String>(l1).toString().replaceAll(", ", "\n");
			return finalString.substring(1,finalString.length()-1);
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}
	
	public static String getDuplicatesBetweenTwoList(String list1, String list2) {
		try {
			Set<String> l1 = new HashSet<String>(Arrays.asList(list1.split("\n")));
			Set<String> l2 = new HashSet<String>(Arrays.asList(list2.split("\n")));
			l1.retainAll(l2);
			Set<String> sortSet = new TreeSet<String>();
			sortSet.addAll(sortSet);
			String finalString = new TreeSet<String>(l1).toString().replaceAll(", ", "\n");
			return finalString.substring(1,finalString.length()-1);
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}
	
	public static String getAll(String list1, String list2) {
		try {
			Set<String> l1 = new HashSet<String>(Arrays.asList(list1.split("\n")));
			Set<String> l2 = new HashSet<String>(Arrays.asList(list2.split("\n")));
			l1.addAll(l2);
			String finalString = new TreeSet<String>(l1).toString().replaceAll(", ", "\n");
			return finalString.substring(1,finalString.length()-1);
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
		return null;
	}
	
}
