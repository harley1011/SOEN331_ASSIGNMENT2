/*******************************************************************************
 * Copyright (c) 2013 Constantinos Constantinides.
 * 
 ******************************************************************************/
import java.util.*;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;

@invariant	({
	"$this.top >= -1",
	"$this.capacity > 0",
	"$this.top <= $this.capacity"
})
public class Stack {

	public ArrayList <String> collection;
	public int capacity;
	public int top = -1;


	@requires ({"capacity > 0"})
	@ensures ({"$this.collection != null"})
	Stack (int capacity) {
		this.capacity = capacity;
		this.collection = new ArrayList<String>(capacity);
	}


	@requires	({
					"str != null",
					"$this.isFull() == false"
	})
	@ensures	({
					"$this.collection.contains(str)",
					"$this.getSize() == $old($this.getSize()) + 1"
	})
	public void push (String str) {
		collection.add(++top, str);
	}


	@requires({"$this.isEmpty() == false"})
	@ensures ({
				"$result != null",
				"$result == $old($this.top())",
				"$this.getSize() == $old($this.getSize()) - 1"
	})
	public String pop () {
		String element = collection.get(top--);
		return element;
	}


	@requires({"$this.isEmpty() == false"})
	@ensures	({
		"$result != null",
		"$this.getSize() == $old($this.getSize())"
	})
	public String top () {
		String result = collection.get(top);
		return result;
	}


	public boolean isFull () {
		return this.getSize() == this.getCapacity();
	}


	public boolean isEmpty () {
		return this.getSize() == 0;
	}


	@requires({"true"})
	@ensures({"$result >= 0"})
	public int getSize () {
		return this.top + 1;
	}


	@requires({"true"})
	@ensures({"$result > 0"})
	public int getCapacity() {
		return this.capacity;
	}

}