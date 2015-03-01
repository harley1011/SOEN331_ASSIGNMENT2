package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({"$super","$this.isBalanced()"}) // 1. The invariants of BinTree must be inherited
											 // 2. At all times, the threshold must be satisfied.
public class BalancedBinTree extends BinTree {

	
	public BalancedBinTree(long id) {
		super(id);
	}
	
	public boolean isBalanced()
	{
		int leftHeight = 0;
		int rightHeight = 0;
		if ( hasLeft())
			leftHeight = leftBinTree.height();
		if ( hasRight())
			rightHeight = rightBinTree.height();
		return (Math.abs(leftHeight - rightHeight) <= 1);
	}

}
