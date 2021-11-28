package com.tannu.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.tannu.treemap.CD;
import com.tannu.treemap.SortAsPerSingerName;

public class MyTreeSetForCD {

	public static void main(String[] args) {
		//Sorted unique collection of objects
		Set<CD> myCollection=new TreeSet<CD>(new SortAsPerSingerName());
		
		myCollection.add(new CD("CD1", "Singer A"));
		myCollection.add(new CD("CD2", "Singer X"));
		myCollection.add(new CD("CD3", "Singer Z"));
		myCollection.add(new CD("CD4", "Singer B"));
		myCollection.add(new CD("CD5", "Singer P"));
		
		System.out.println(myCollection);
		System.out.println("Size of Collection :"+myCollection.size());
		
		myCollection.add(new CD("CD6", "Singer M"));
		System.out.println("Size of collection after adding CD6:"+myCollection.size());
		System.out.println("Traversal using for each");
		for(CD obj:myCollection) {
			System.out.println(obj);
		}
		
		myCollection.remove(new CD("CD4", "Singer B"));
		System.out.println("Size of collection after removing CD4 : "+myCollection.size());
		
		System.out.println("Traversal using iterator");
		Iterator<CD> iterator=myCollection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
