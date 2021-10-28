

/**
 * @author njohnson3
 *
 */
import java.util.Queue; // import the ArrayList class
import java.util.LinkedList;
public class Tree {
	
	private int height;
	private Node root;
	
	
	public Tree()
	{
		
		setRoot(new Node(1));
				
	}
	
	/**
	 * @return the root
	 */
	
	public Node getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
		
	}


	//returns the root node
	public Node generatePracticeTree(int height)
	{
	   
		
	this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   	System.out.println ("Root Node value: "+pn.getData());
		int value=pn.getData();
	   	level++;
		value++; 
	   	System.out.println("Adding Left Child: "+(value));
		 pn.setlChild(new Node(value));
		 childQ.add(pn.getlChild());
		 value++;
		 System.out.println("Adding Right Child: "+(value));
		 pn.setrChild(new Node(value));
		 childQ.add(pn.getrChild());	 
	   level++;
	   //Remove the front of the queue
	   //Create its children
	   //Put them in the queue
		 //Data is just parent data+1or 2 depending
	   while (level<(height+1) && !childQ.isEmpty())
			 {
				 pn=childQ.remove();
				 System.out.println("Parent Node value: "+pn.getData());
				 value++;
				 System.out.println("Adding Left Child: "+(value));
				 pn.setlChild(new Node(value));
				 childQ.add(pn.getlChild());
				 value++;
				 System.out.println("Adding Right Child: "+(value));
				 pn.setrChild(new Node(value));
				 childQ.add(pn.getrChild());
				 
				 pn=childQ.remove();
				 
				 System.out.println("Parent Node value: "+pn.getData());
				 value++;
				 System.out.println("Adding Left Child: "+(value));
				 pn.setlChild(new Node(value));
				 childQ.add(pn.getlChild());
				 value++;
				 System.out.println("Adding Right Child: "+(value));
				 pn.setrChild(new Node(value));
				 childQ.add(pn.getrChild());
				 
				 level++;
			 }
			 
		
		return root;
		
	}
}