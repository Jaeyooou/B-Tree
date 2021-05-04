package kr.ac.jaeyooou.database.Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class FiveWayBTreeNode implements Comparable{

	//부모노드
	private FiveWayBTreeNode parent;
	//키값
	private List<Integer> keyList;
	//자식노드 리스트
	private List<FiveWayBTreeNode> children;
	
	public FiveWayBTreeNode() {
		keyList = new ArrayList();
	}
	
	public FiveWayBTreeNode getParent() {
		return parent;
	}
	public void setParent(FiveWayBTreeNode parent) {
		this.parent = parent;
	}
	public List<Integer> getKeyList() {
		return keyList;
	}
	public void setKeyList(List<Integer> keyList) {
		this.keyList = keyList;
	}
	public List<FiveWayBTreeNode> getChildren() {
		return children;
	}
	public void setChildren(FiveWayBTreeNode e) {
		this.children.add(e);
		Collections.sort(children);
		
	}
	public int getFirst() {
		return this.getKeyList().get(0);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		FiveWayBTreeNode e = (FiveWayBTreeNode)o;
		if (this.getFirst() > e.getFirst())  return 1;
		else 	return -1;
	}

	
	
}