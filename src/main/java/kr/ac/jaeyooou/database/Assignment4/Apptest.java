package kr.ac.jaeyooou.database.Assignment4;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.List;

public class Apptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiveWayBTreeNode root = new FiveWayBTreeNode();
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(4);
		ll.add(5);
		ll.add(6);
		List<Integer> rl = new ArrayList<>();
		rl.add(1);
		rl.add(2);
		rl.add(3);
		
		FiveWayBTreeNode l = new FiveWayBTreeNode();
		l.setKeyList(ll);
		FiveWayBTreeNode r = new FiveWayBTreeNode();
		root.setChildren(l);
		root.setChildren(r);
		
		int a = root.getChildren().get(0).getFirst();

		int b = root.getChildren().get(1).getFirst();
		System.out.println(a);
		System.out.println(b);
	}
	
}
