package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({"$super","$this.isTwoOrNoLeaf()"}) // You need to make sure that for any given time, the class FullBinaryTree is in fact valid.
												// Constraints of its parent apply.
public class FullBinaryTree extends BinTree {

	
	public FullBinaryTree(long id) {
		super(id);
		
	}
	public boolean isTwoOrNoLeaf()
	{
		if (!(hasLeft() && hasRight())) // If the
			return true;
		else if (hasLeft() && hasRight())
			return ((FullBinaryTree)getLeft()).isTwoOrNoLeaf() && ((FullBinaryTree)getRight()).isTwoOrNoLeaf();
		else
			return false;
	}
	public void setLeftRight(BinTree a, BinTree b)
	{
		leftBinTree = a;
		rightBinTree = b;
	}

}
