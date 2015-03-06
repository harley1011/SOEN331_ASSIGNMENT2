/*
	Authors: Hilary Chan 6984657, Harley McPhee 7003226
	
*/
package main;

public class Test {

	public static void main(String[] args) {
		
		/** PART 1.1: BinTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		
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
		
		// 1. Regardless of the time, it must always hold that the height of a binary tree is non-zero.
		// This contract cannot be failed as height will always return at least one.
		System.out.println("The height of the newly created BinTree is:" + empty.height()); 
		
		// 2. Creation of a BinTree entails that the provided id is non-null
		// You can not pass a null value to a method expecting a long in java without a compiler error so it is not possible to break this precondition contract
		// We tried Long longT = null
		// BinTree binTree = new BinTree(longT); but we get a pointer null reference exception before the contract exception
		@SuppressWarnings("unused")
		BinTree binTree = new BinTree(0);
		
		// 3. Creation of a new BinTree implies that neither left nor right nodes are occupied.
		// There is not a constructor that takes a left or right node so this contract can never fail when creating a BinTree as the only constructor is BinTree(long id)
		System.out.println("Newly created tree has no children");
		System.out.println("Left: " + empty.hasLeft());
		System.out.println("Right: "+ empty.hasRight());
		
		// 4. setLeft(BinTree iBinTree) will reject parameters which are null.
		//root.setLeft(null); // Uncomment to cause contract precondition exception
		
		// 5. setLeft(BinTree iBinTree) will make sure it is not overwriting a node.
		//root.setLeft(new BinTree(6)); // Uncomment to cause precondition contract exception
		
		// 6. setLeft(BinTree iBinTree) will make sure that left is no longer null.
		// Can't make this contract fail without removing the precondition contract number 5 as it verifies the passed node is not null
		System.out.println("Left: " + root.hasLeft()); 
		
		// 7. setLeft(BinTree iBinTree) will ensure that the left node is indeed what was provided.
		root.getLeft().getLeft().getLeft().setLeft(empty);
		System.out.println("Roots left most node should be equal to the empty node we just set: " + (root.getLeft().getLeft().getLeft().getLeft() == empty));
	
		// 8. setRight(BinTree iBinTree) will reject parameters which are null.
		//root.setRight(null); // Uncomment to cause precondition contract exception
		
		// 9. setRight(BinTree iBinTree) will make sure it is not overwriting a node.
		//root.setRight(new BinTree(6)); // Uncomment to cause precondition contract exception
		
		//10. setRight(BinTree iBinTree) will make sure that right is no longer null.
		// Can't make this contract fail without removing the precondition contract number 5 as it verifies the passed node is not null
		System.out.println("Right: " + root.hasRight()); 

		//11. setRight(BinTree iBinTree) will ensure that the right node is indeed what was	provided.
		root.getRight().getRight().setRight(empty);
		System.out.println("Roots right most node should be equal to the empty node we just set: " + (root.getRight().getRight().getRight() == empty));
		
		/** PART 1.2: BalancedBinTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		
		BalancedBinTree balancedBinTreeRoot = new BalancedBinTree(10);
		balancedBinTreeRoot.setLeft(new BalancedBinTree(10));
		balancedBinTreeRoot.setRight(new BalancedBinTree(13));
		balancedBinTreeRoot.getLeft().setLeft(new BalancedBinTree(13));
	
		
		// 1. The invariants of BinTree must be inherited
		// This contract cannot be failed as height will always return at least one.
		System.out.println("The height of the newly created BalancedBinTree is: " + balancedBinTreeRoot.height()); 
		
		// 2. At all times, the threshold must be satisfied
		//balancedBinTreeRoot.getLeft().getLeft().setLeft(new BalancedBinTree(13)); // Uncomment to cause invariant contract exception
		
		System.out.println("The newly created BalancedBinTree is balanced: " + balancedBinTreeRoot.isBalanced()); 
		
		/** PART 1.3: FullBinaryTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		FullBinaryTree fullBinaryTree = new FullBinaryTree(10);
		fullBinaryTree.setLeftRight(new FullBinaryTree(10), new FullBinaryTree(10));
		
		// 1. You need to make sure that for any given time, the class FullBinaryTree is in fact valid.
		//fullBinaryTree.setLeft(new FullBinaryTree(10)); // Uncomment to cause contract exceptions 
		
		System.out.println("The FullBinarytree is valid: " + fullBinaryTree.isTwoOrNoLeaf());
		
		/** PART 1.4: PerfectBinaryTree Contract Failures 
		 * Uncomment indicated sections to cause contracts to fail
		 * */
		// The trees nodes must first be made, it must be from bottom up in-order to satisfy the contracts.
		
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
		
		// 1. A Perfect Binary Tree is a full binary tree, which is full, but whose subtrees are also of the same height.
		//((PerfectBinaryTree)perfectBinaryTreeRootLeft.getLeft()).setLeftRight(new PerfectBinaryTree(10), new PerfectBinaryTree(10)); // Uncomment to cause contracts exceptions
		System.out.println("The PerfectBinaryTree is valid: " + (perfectBinaryTreeRoot.sameHeight() && perfectBinaryTreeRoot.isTwoOrNoLeaf()));
		
		System.out.println("the end");
	}

}
