package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({"$this.isBalanced()"})
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
