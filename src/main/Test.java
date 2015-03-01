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
		//balancedBinTreeRoot.getLeft().getLeft().getLeft().setLeft(new BalancedBinTree(13));
		//System.out.println(balancedBinTreeRoot.isBalanced());
		
		
		
		FullBinaryTree fullBinaryTree = new FullBinaryTree(10);
		fullBinaryTree.setLeftRight(new FullBinaryTree(10), new FullBinaryTree(10));
		//fullBinaryTree.setLeft(new FullBinaryTree(10));
		
		PerfectBinaryTree perfectBinaryTreeRoot = new PerfectBinaryTree(10);
		PerfectBinaryTree perfectBinaryTreeRootLeft = new PerfectBinaryTree(10);
		PerfectBinaryTree perfectBinaryTreeRootRight = new PerfectBinaryTree(15);
		PerfectBinaryTree perfectBinaryTreeRootLeftLeft = new PerfectBinaryTree(10);
		PerfectBinaryTree perfectBinaryTreeRootLeftRight = new PerfectBinaryTree(10);
		PerfectBinaryTree perfectBinaryTreeRootRightLeft = new PerfectBinaryTree(10);
		PerfectBinaryTree perfectBinaryTreeRootRightRight = new PerfectBinaryTree(10);
		
		perfectBinaryTreeRootLeft.setLeftRight(perfectBinaryTreeRootLeftLeft, perfectBinaryTreeRootLeftRight);
		perfectBinaryTreeRootRight.setLeftRight(perfectBinaryTreeRootRightLeft, perfectBinaryTreeRootRightRight);
		
		perfectBinaryTreeRoot.setLeftRight(perfectBinaryTreeRootLeft, perfectBinaryTreeRootRight);
		

	//	((PerfectBinaryTree)perfectBinaryTree.getLeft()).setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10));
		System.out.println(perfectBinaryTreeRoot.sameHeight());
	}

}
