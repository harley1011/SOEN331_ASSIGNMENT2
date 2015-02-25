package main;

public class Test {

	public static void main(String[] args) {
		BinTree root = new BinTree(10);
		root.setLeft(new BinTree(11));
		root.getLeft().setLeft(new BinTree(12));
		root.getLeft().getLeft().setLeft(new BinTree(12));
		root.setRight(new BinTree(2));
		root.getRight().setRight(new BinTree(2));
		
		System.out.println("The height is " + root.height());
		System.out.println("The sum is " + root.sumNodes());
	}

}
