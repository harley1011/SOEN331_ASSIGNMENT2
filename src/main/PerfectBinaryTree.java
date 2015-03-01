package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({"$super","$this.sameHeight()"})
public class PerfectBinaryTree extends FullBinaryTree {

	public PerfectBinaryTree(long id) {
		super(id);
	}
	
	public boolean sameHeight()
	{
		int leftHeight = 0;
		int rightHeight = 0;
		if (hasLeft())
			leftHeight = getLeft().height();
		if (hasRight())
			rightHeight = getRight().height();
		
		return(leftHeight == rightHeight);
		
	}

}
