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
		
		BalancedBinTree balancedBinTreeRoot = new BalancedBinTree(10);
		balancedBinTreeRoot.setLeft(new BalancedBinTree(10));
		System.out.println(balancedBinTreeRoot.isBalanced());
		balancedBinTreeRoot.setRight(new BalancedBinTree(13));
		System.out.println(balancedBinTreeRoot.isBalanced());
		balancedBinTreeRoot.getLeft().setLeft(new BalancedBinTree(13));
		//balancedBinTreeRoot.getLeft().getLeft().setLeft(new BalancedBinTree(13));
	//	balancedBinTreeRoot.getLeft().getLeft().getLeft().setLeft(new BalancedBinTree(13));
		//System.out.println(balancedBinTreeRoot.isBalanced());
		
		
		
		FullBinaryTree fullBinaryTree = new FullBinaryTree(10);
		fullBinaryTree.setLeftRight(new FullBinaryTree(10), new FullBinaryTree(10));
		//fullBinaryTree.setLeft(new FullBinaryTree(10));
		
		PerfectBinaryTree perfectBinaryTree = new PerfectBinaryTree(10);
		perfectBinaryTree.setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10));
		((PerfectBinaryTree)perfectBinaryTree.getLeft()).setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10));
	}

}
