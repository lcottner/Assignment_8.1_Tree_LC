/**
 * The Application class holds the main method
 * which calls on the Tree and Node programs to make a tree.
 * Afterwards, it calls the DepthFirstSearch method to traverse
 * the tree.
 * @author Lacey Cottner
 *@version 1.0
 *@since 10-28-2021
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Creating a tree of height "+"4");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree((4));
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println("The height of the tree is: " + aSearch.getHeight());
		System.out.println("The number of nodes traversed is: " + aSearch.getTraversed());
	}

}