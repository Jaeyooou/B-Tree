package kr.ac.jaeyooou.database.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {	
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			list.add(r.nextInt(10000));
		}
		NavigableSet<Integer> treeSet = new TreeSet<Integer>();
		for(Integer val: list) {
			treeSet.add(val);
		}
		
		// NavigableSet<Integer> yourBTree = new TreeSet<Integer>();
		// 24踰덉㎏ Line�� 二쇱꽍泥섎━�섍퀬 22踰덉㎏ Line�� 二쇱꽍�� �쒓굅�섎㈃ �녹� 寃곌낵媛� �섏샂. 
		NavigableSet<Integer> yourBTree = new FiveWayBTree();
		for(Integer val: list) {
			yourBTree.add(val);
		}
		
		System.out.println("size test: " + (treeSet.size() == yourBTree.size()));
		System.out.println("first test: " + treeSet.first().equals(yourBTree.first()));
		System.out.println("last test: " + treeSet.last().equals(yourBTree.last()));
		Iterator<Integer> treeIterator = treeSet.iterator();
		Iterator<Integer> yourBTreeIterator = yourBTree.iterator();
		boolean isPass = true;
		while(treeIterator.hasNext() && yourBTreeIterator.hasNext()) {
			if(!treeIterator.next().equals(yourBTreeIterator.next())){
				isPass = false;
				break;
			}
		}
		System.out.println("iterator test: " + isPass);
		int pivot = r.nextInt(10000);
		System.out.println("ceiling test: " + treeSet.ceiling(pivot).equals(yourBTree.ceiling(pivot)));
		System.out.println("floor test: " + treeSet.floor(pivot).equals(yourBTree.floor(pivot)));
		Iterator<Integer> treeHeadIterator = treeSet.headSet(pivot).iterator();
		Iterator<Integer> yourBTtreeHeadIterator = yourBTree.headSet(pivot).iterator();
		isPass = true;
		while(treeHeadIterator.hasNext() && yourBTtreeHeadIterator.hasNext()) {
			if(!treeHeadIterator.next().equals(yourBTtreeHeadIterator.next())){
				isPass = false;
				break;
			}
		}
		System.out.println("headSet test: " + isPass);
		Iterator<Integer> treeTailIterator = treeSet.tailSet(pivot).iterator();
		Iterator<Integer> yourBTtreeTailIterator = yourBTree.tailSet(pivot).iterator();
		isPass = true;
		while(treeTailIterator.hasNext() && yourBTtreeTailIterator.hasNext()) {
			if(!treeTailIterator.next().equals(yourBTtreeTailIterator.next())){
				isPass = false;
				break;
			}
		}
		System.out.println("tailSet test: " + isPass);
		for(int i = 0 ; i < list.size()/2 ; i++) {
			treeSet.remove(i);
			yourBTree.remove(i);
		}
		treeIterator = treeSet.iterator();
		yourBTreeIterator = yourBTree.iterator();
		isPass = true;
		while(treeIterator.hasNext() && yourBTreeIterator.hasNext()) {
			if(!treeIterator.next().equals(yourBTreeIterator.next())){
				isPass = false;
				break;
			}
		}
		System.out.println("remove test: " + isPass);
	}
}