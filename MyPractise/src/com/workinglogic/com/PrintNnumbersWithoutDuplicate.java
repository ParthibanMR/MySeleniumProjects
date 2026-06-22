package com.workinglogic.com;

import java.util.Arrays;

public class PrintNnumbersWithoutDuplicate {
	 public static void main(String[] args) {
	        int[] num = {1, 2, 2, 3};
	        int c = 0;
	 
	        for (int i = 0; i < num.length; i++) {
	            boolean flag = false;
	 
	            for (int j = i + 1; j < num.length; j++) {
	                if (num[i] == num[j]) {
	                    flag = true;
	                    break;
	                }
	            }
	 
	            if (!flag) {
	                num[c] = num[i];
	                c++;
	            }
	        }
	 
	        System.out.print(Arrays.toString(Arrays.copyOf(num, c)));
	    }
	}

