package Kreditna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Spilka {

	public static void main(String[] args) {
		
		System.out.println("Приймаючi участь у акцii, згiдно списку :");
		System.out.println();
		
		System.out.println(getNames().toString());
		System.out.println();
		
		
		System.out.println("Порядок виплат учасникам:");
		System.out.println();
		
		
		
		//getRandomList(getNames());
		getRandomListTwo(getNames());

	}

	public static List<String> getNames() {
		List<String> list = new ArrayList<>(Arrays.asList("Якимець","Губчак","Марiщак","Скиданюк","Бiдоча","Берчук","Микитюк","Гермаковський","Дроник","Жеребецький"));
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Type Name");
//		
//			try {
//				list.add(reader.readLine());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}

		return list;

	}
	
	public static void getRandomList(List<String>list) {
		
				Collections.shuffle(list);
		for (int i = 0;i<list.size();i++) {
			if(i+1>9) {
				System.out.println((i+1)+"- "+list.get(i));	
			}else {
			System.out.println((i+1)+" - "+list.get(i));
		}
		}
		
	}
	public static void getRandomListTwo(List<String>list) {
		
		Collections.shuffle(list);
		LinkedList<String>lst= new LinkedList<>();
		for (String string : list) {
			lst.push(string);
		}
		int in= 1;
		for(;lst.size()!=0;) {
		System.out.println(in+":");
	
		System.out.println(lst.pop());
		System.out.println(lst.pop());
		System.out.println();
		in++;
		}

}

}
	
	
	


