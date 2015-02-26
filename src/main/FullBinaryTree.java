package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({"$this.isTwoOrNoLeaf()"})
public class FullBinaryTree extends BinTree {

	
	public FullBinaryTree(long id) {
		super(id);
		
	}
	public boolean isTwoOrNoLeaf()
	{
		if (!(hasLeft() && hasRight()))
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
