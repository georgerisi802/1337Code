package serializeDeserializeBinaryTree_297;

import java.util.*;

public class Codec {
	
	public static String serialize(TreeNode root) {
		if(root == null) return null;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode curNode;
		StringBuilder str = new StringBuilder();
		while(!q.isEmpty()) {
			curNode = q.remove();
			if(curNode.val < -1000) str.append("null ");
			else {
				str.append(curNode.val + " ");
				if(curNode.left != null) q.add(curNode.left);
				else q.add(new TreeNode(-1500));
				if(curNode.right != null) q.add(curNode.right);
				else q.add(new TreeNode(-1500));
			}
		}
		return str.toString();
	}
	
	public static TreeNode deserialize(String data) {
		if(data == null) return null;
		else {
			String[] serialArr = data.split("\\W+");
			
			Queue<TreeNode> q2 = new LinkedList<>();
			TreeNode root = null;
			if(!serialArr[0].equals("null")) {
				root = new TreeNode(Integer.valueOf(serialArr[0]));
				q2.add(root);
			}
			TreeNode curNode;
			int i=0;
			while(!q2.isEmpty()) {
				curNode = q2.remove();
				
				String leftStr = serialArr[++i];
				String rightStr = serialArr[++i];
				
				if(!leftStr.equals("null")) {
					curNode.left = new TreeNode(Integer.valueOf(leftStr));
					q2.add(curNode.left);
				}
				if(!rightStr.contentEquals("null")) {
					curNode.right = new TreeNode(Integer.valueOf(rightStr));
					q2.add(curNode.right);
				}
			}
			return root;
		}
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		
		printTree(root);
		printTree(deserialize(serialize(root)));
		
		TreeNode nullNode = null;		
		printTree(nullNode);
		printTree(deserialize(serialize(nullNode)));
	}
	
	static void printTree(TreeNode node){
		if(node == null) {
			System.out.println("null");
			return; 
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		TreeNode curNode;
		StringBuilder str = new StringBuilder();
		while(!q.isEmpty()) {
			curNode = q.remove();
			if(curNode.val < -1000) str.append("null ");
			else {
				str.append(curNode.val + " ");
				if(curNode.left != null) q.add(curNode.left);
				else q.add(new TreeNode(-1500));
				if(curNode.right != null) q.add(curNode.right);
				else q.add(new TreeNode(-1500));
			}
		}
		System.out.println(str.toString());
	}
} // end class


