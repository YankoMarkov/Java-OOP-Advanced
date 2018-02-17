package collectionHierarchy;

import collectionHierarchy.models.AddCollection;
import collectionHierarchy.models.AddRemoveCollection;
import collectionHierarchy.models.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] input = read.readLine().split("\\s+");
		int num = Integer.valueOf(read.readLine());
		
		AddCollection addCollection = new AddCollection();
		AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
		MyList myList = new MyList();
		
		for (String str : input) {
			int index = addCollection.add(str);
			System.out.print(index + " ");
		}
		System.out.println();
		for (String str : input) {
			int index = addRemoveCollection.add(str);
			System.out.print(index + " ");
		}
		System.out.println();
		for (String str : input) {
			int index = myList.add(str);
			System.out.print(index + " ");
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			String item = addRemoveCollection.remove();
			System.out.print(item + " ");
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			String item = myList.remove();
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
