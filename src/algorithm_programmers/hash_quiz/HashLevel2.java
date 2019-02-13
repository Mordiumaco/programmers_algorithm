package algorithm_programmers.hash_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashLevel2 {
	public static void main(String[] args) {
		
		/*
		 
		 https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
		 */
		
		String[] phone_book ={"113", "12340", "123440", "12345", "98346"};
		
		boolean answer = solution(phone_book);
		System.out.println(answer);
		
	}
	
	//내 풀이
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
	    	
	    Map<String, String> filtering = new HashMap<String, String>();
	    
	    for(String number : phone_book){
	    	filtering.put(number, number);
	    }
	    
	    for(String number : phone_book){
	    	Iterator<String> iterator = filtering.keySet().iterator();
	    	int coin = 0;
	    	
	    	while(iterator.hasNext()){
	    		String checkingNumber = iterator.next();
	    		if(number.length() <= checkingNumber.length()){
	    			if(number.equals(checkingNumber.substring(0, number.length()))){
	    				coin++; 
	    			}
	    		}
	    	}
	    	
	    	if(coin >= 2){
	    		return false;
	    	}
	    }
	    
	    
	    
	    return answer;
	}

}
