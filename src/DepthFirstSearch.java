/**
 * The DepthFirst Search holds the methods
 * to perform a depth first search on a tree
 * @author Lacey Cottner
 *@version 1.0
 *@since 10-28-2021
 */
public class DepthFirstSearch {
	int a=0;
	int height=0;
	int traversed=0;
	
	/*
	 * The DFS method uses recursion to cycle through all of the children of the tree 
	 * @param Node
	 * @return void
	 */
	public void DFS(Node n){
		System.out.println("The current value of the node: " +n.getData());
		a++;
		traversed++;
		if (n.getlChild()==null && n.getrChild() ==null) {
			if (a>height)
				height=a;
			a=0;
			return;
		}
		
		DFS(n.getlChild());
		DFS(n.getrChild());
		return;
	}

	/**
	 * @return the traversed
	 */
	public int getTraversed() {
		return traversed;
	}

	/**
	 * @param traversed the traversed to set
	 */
	public void setTraversed(int traversed) {
		this.traversed = traversed;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
}
