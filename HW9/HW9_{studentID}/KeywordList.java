import java.util.ArrayList;

public class KeywordList {
	private ArrayList<Keyword> lst;
	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
    }
	
	public void add(Keyword keyword){
		lst.add(keyword);
		// System.out.println("Done");
    }
	
	//quick sort
	public void sort(){
		this.lst = doQuickSort(this.lst);
	}
	
	private ArrayList<Keyword> doQuickSort(ArrayList<Keyword> list){
		// ToDO: write quick sort logic here...
		}
		
		return result;				
	}

	public void output(){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<lst.size();i++){
			Keyword k = lst.get(i);
			if(i>0)sb.append(" ");
			sb.append(k.toString());
		}
		
		System.out.println(sb.toString());	
	}
}
