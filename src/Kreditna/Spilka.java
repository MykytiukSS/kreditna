package Kreditna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spilka {

	public static void main(String[] args) {

	}

	public List<String> getNames() {
		List<String> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			try {
				list.add(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return list;

	}
	
	public void getRandomList(List<String>list) {
		
				Collections.shuffle(list);
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}
	

}
