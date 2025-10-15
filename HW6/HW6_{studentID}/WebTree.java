import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class WebTree {
	public WebNode root;
	
	public WebTree(WebPage rootPage){
		this.root = new WebNode(rootPage);
	}
	
	public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException{
		setPostOrderScore(root, keywords);
	}
	
	private void setPostOrderScore(WebNode startNode, ArrayList<Keyword> keywords) throws IOException{
		// YOUR TURN
		// 3. compute the score of children nodes via post-order, then setNodeScore for startNode
	}
	
	public void eularPrintTree(){
		eularPrintTree(root);
	}
	
	private void eularPrintTree(WebNode startNode){
		// YOUR TURN
		//  4. Implement a recursive method eularPrintTree(WebNode startNode)
		//  that prints the entire tree structure using parentheses to show hierarchy.

		/* Example output:
		(Soslab,459.0
			(Publication,286.2)
			(Projects,42.0
				(Stranger,0.0)
			)
			(Member,12.0)
			(Course,5.4)
		)*/
		// Hints:
		//  - Can use the function getDepth() and isTheLastChild() in WebNode.java
		//  - The opening "(" comes before printing the node name and score,
		//    and the closing ")" comes after printing all of its children.
		//  - Use something like repeat("\t", n) for indentation.
		//  */
		
		
		
	}
	
	private String repeat(String str,int repeat){
		String retVal  = "";
		for(int i=0;i<repeat;i++){
			retVal+=str;
		}
		return retVal;
	}
}