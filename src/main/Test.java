package main;

public class Test {

	public static void main(String[] args) {
		
		BinTree root = new BinTree(10);
		root.setLeft(new BinTree(8));
		root.getLeft().setLeft(new BinTree(3));
		root.getLeft().setRight(new BinTree(6));
		root.getLeft().getLeft().setLeft(new BinTree(1));
		root.setRight(new BinTree(11));
		root.getRight().setRight(new BinTree(13));
		
		System.out.println("The height is " + root.height());
		System.out.println("The sum is " + root.sumNodes());
		
		BinTree empty = new BinTree(10);
		
		
		/** PART 1.1: BinTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		// 1. Regardless of the time, it must always hold that the height of a binary tree is non-zero.
		// This contract is always true because by default height will return at least one.
		System.out.println(empty.height()); 
		
		// 2. Creation of a BinTree entails that the provided id is non-null.
		//Long longNumber = null;
		//BinTree test = new BinTree(longNumber);
		
		// 3. Creation of a new BinTree implies that neither left nor right nodes are occupied.
		// There is not a constructor that takes a left or right node so this contract can never fail when  creating a BinTree 
		System.out.println("Does empty binary tree has children?");
		System.out.println("Left: " + empty.hasLeft());
		System.out.println("Right: "+ empty.hasRight());
		
		// 4. setLeft(BinTree iBinTree) will reject parameters which are null.
		//root.setLeft(null); // Uncomment to cause contract exception
		
		// 5. setLeft(BinTree iBinTree) will make sure it is not overwriting a node.
		//root.setLeft(new BinTree(6)); // Uncomment to cause contract exception
		
		// 6. setLeft(BinTree iBinTree) will make sure that left is no longer null.
		// Can't make this contract fail without removing the precondition contract number 5
		System.out.println("Left: " + root.hasLeft()); 
		
		// 7. setLeft(BinTree iBinTree) will ensure that the left node is indeed what was provided.
	
	
		// 8. setRight(BinTree iBinTree) will reject parameters which are null.
		//root.setRight(null); // Uncomment to cause contract exception
		
		// 9. setRight(BinTree iBinTree) will make sure it is not overwriting a node.
		//root.setRight(new BinTree(6)); // Uncomment to cause contract exception
		
		//10. setRight(BinTree iBinTree) will make sure that right is no longer null.
		// Can't make this contract fail without removing the precondition contract number 5
		System.out.println("Right: " + root.hasRight()); 

		//11. setRight(BinTree iBinTree) will ensure that the right node is indeed what was	provided.
		
		
		/** PART 1.2: BalancedBinTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		
		BalancedBinTree balancedBinTreeRoot = new BalancedBinTree(10);
		balancedBinTreeRoot.setLeft(new BalancedBinTree(10));
		balancedBinTreeRoot.setRight(new BalancedBinTree(13));
		balancedBinTreeRoot.getLeft().setLeft(new BalancedBinTree(13));
		balancedBinTreeRoot.getLeft().getLeft().setLeft(new BalancedBinTree(13));
		
		// 2. At all times, the threshold must be satisfied
		// Uncomment to cause exception
		//balancedBinTreeRoot.getLeft().getLeft().getLeft().setLeft(new BalancedBinTree(13)); 
		
		/** PART 1.3: FullBinaryTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		FullBinaryTree fullBinaryTree = new FullBinaryTree(10);
		fullBinaryTree.setLeftRight(new FullBinaryTree(10), new FullBinaryTree(10));
		//fullBinaryTree.setLeft(new FullBinaryTree(10)); // Uncomment to cause exception 
		
		/** PART 1.4: PerfectBinaryTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
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
		
		//((PerfectBinaryTree)perfectBinaryTreeRootLeft.getLeft()).setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10));
		System.out.println("height of this tree is: " + perfectBinaryTreeRoot.height());
		perfectBinaryTreeRootLeftLeft.setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10));
		System.out.println("height of this tree is: " + perfectBinaryTreeRoot.height());
		System.out.println("the end");
	}

}
