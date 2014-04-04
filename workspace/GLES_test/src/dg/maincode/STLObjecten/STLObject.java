package dg.maincode.STLObjecten;

import java.util.HashMap;

public class STLObject {
	private HashMap<Integer,STLTriagle> STLTriagle;
	private int lastIndex = -1;
	private String name;
	
	public STLObject(
			HashMap<Integer, dg.maincode.STLObjecten.STLTriagle> sTLTriagle,
			String name) {
		super();
		STLTriagle = sTLTriagle;
		this.name = name;
	}
	
	public STLObject(String name) {
		super(); 
		this.STLTriagle = new HashMap<Integer, STLTriagle>();
		this.name = name;
	}
	
	public void addSTLTriagle(STLTriagle triagleToAdd){
		lastIndex++;
		STLTriagle.put(lastIndex, triagleToAdd);		
	}
	
	public HashMap<Integer, STLTriagle> getSTLTriagle() {
		return STLTriagle;
	}
	public void setSTLTriagle(HashMap<Integer, STLTriagle> sTLTriagle) {
		STLTriagle = sTLTriagle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
