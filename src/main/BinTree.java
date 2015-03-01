package main;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;

@invariant ({"$this.height() >= 1"})

public class BinTree {
	
	public long id;
	public BinTree leftBinTree = null;
	public BinTree rightBinTree = null;
	

	@requires ({"id != null"}) // 2
	@ensures({"$this.leftBinTree == null", "$this.rightBinTree == null"}) //3
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
	
	@requires({"iBinTree != null", "$this.leftBinTree == null"}) //4,5
	@ensures({"$this.leftBinTree != null", "$this.leftBinTree == iBinTree"}) //6,7
	public void setLeft(BinTree iBinTree)
	{
		this.leftBinTree = iBinTree;
	}
	
	@requires({"iBinTree != null", "$this.rightBinTree == null"}) //4,5
	@ensures({"$this.rightBinTree != null", "$this.rightBinTree == iBinTree"}) //6,7
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
	
	@ensures({"$this.height() != 0"}) // 1
	public int height()
	{
		int leftHeight = 1;
		int rightHeight = 1;
		if (hasRight())
			rightHeight += rightBinTree.height();
		if (hasLeft())
			leftHeight += leftBinTree.height();
	
		return ( leftHeight > rightHeight) ? leftHeight : rightHeight;
	}
}
