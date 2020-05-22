import java.util.*;
import java.util.HashMap;

public class DuplicateCharStr{

public static void word(String str){

	char ch[] = str.toCharArray();
	Map<Character,Integer> map = new HashMap<>();
	int counter;

	for(char c : ch){
		if(map.containsKey(c)){
			counter = map.get(c);
			counter += 1;
            map.put(c,counter);
            }		
		else{
			map.put(c,1);
			}
		}
	for(char i : map.keySet()){
		if(map.get(i) > 1)
			System.out.println(i);
	}
	}
	public static void main(String[] args) {
		DuplicateCharStr obj = new DuplicateCharStr();
		String str = "howtodoinjava";
		obj.word(str);
	}


}

