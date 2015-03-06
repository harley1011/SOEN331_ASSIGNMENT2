/*
	Authors: Hilary Chan 6984657, Harley McPhee 7003226
*/
package main;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;

/** 
 * 1. Regardless of the time, it must always hold that the height of a binary tree is non-zero.
 */
@invariant ({"$this.height() >= 1"}) 

public class BinTree {
	
	public long id;
	public BinTree leftBinTree; // Stores the left tree for this tree
	public BinTree rightBinTree; // Store the right tree for this tree
	
/**
 * 2.  Creation of a BinTree entails that the provided id is non-null. * 
 */
	@requires ({"id != null"}) 
	
/**
 * 3.  Creation of a new BinTree implies that neither left nor right nodes are occupied.
 */
	@ensures({"$this.leftBinTree == null", "$this.rightBinTree == null"}) 
	
	public BinTree(long id) {
		this.id = id;
	}
	
	public BinTree getLeft()
	{
		return leftBinTree;
	}
	
	public BinTree getRight()
	{
		return rightBinTree;
	}
	
	/**
	 * 4. setLeft(BinTree iBinTree) will reject parameters which are null.
	 * 5. setLeft(BinTree iBinTree) will make sure it is not overwriting a node.
	 */
	@requires({"iBinTree != null", "$this.leftBinTree == null"})
	/**
	 * 6. setLeft(BinTree iBinTree) will make sure that left is no longer null.
	 * 7. setLeft(BinTree iBinTree) will ensure that the left node is indeed what was provided.
	 * */
	@ensures({"$this.leftBinTree != null", "$this.leftBinTree == iBinTree"}) 

	public void setLeft(BinTree iBinTree)
	{
		this.leftBinTree = iBinTree;
	}
	
	/**
	 *  8. setRight(BinTree iBinTree) will reject parameters which are null.
	 *  9. setRight(BinTree iBinTree) will make sure it is not overwriting a node.
	 * */
	@requires({"iBinTree != null", "$this.rightBinTree == null"}) 

	/**
	 * 10. setRight(BinTree iBinTree) will make sure that right is no longer null.
	 * 11. setRight(BinTree iBinTree) will ensure that the right node is indeed what was provided
	 * */
	@ensures({"$this.rightBinTree != null", "$this.rightBinTree == iBinTree"}) 
	public void setRight(BinTree iBinTree)
	{
		this.rightBinTree = iBinTree;
	}
	
	public boolean hasLeft()
	{
		if (leftBinTree == null)
			return false;
		else
			return true;
	}
	
	public boolean hasRight()
	{
		if(rightBinTree == null)
			return false;
		else
			return true;
	}
	
	public int sumNodes()
	{
		int sum = 1;
		if (hasRight())
			sum += rightBinTree.sumNodes();
		if (hasLeft())
			sum +=leftBinTree.sumNodes();
		return sum;
	}
	
	public int height()
	{
		int leftHeight = 1;
		int rightHeight = 1;
		if (hasRight())
			rightHeight += rightBinTree.height(); 
		if (hasLeft())
			leftHeight += leftBinTree.height();
	
		// If the left tree has a greater height than the right tree then return its height else return the right trees height
		return ( leftHeight > rightHeight) ? leftHeight : rightHeight; 
	}
}
