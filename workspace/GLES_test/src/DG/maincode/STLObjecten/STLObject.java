package DG.maincode.STLObjecten;

import java.util.HashMap;

public class STLObject {
	private HashMap<Integer,STLTriagle> STLTriagles;
	private String name;
	private int ID;
	
	public STLObject(HashMap<Integer, STLTriagle> sTLTriagles, String name, int iD) {
		super();
		STLTriagles = sTLTriagles;
		this.name = name;
		ID = iD;
	}
	
	public HashMap<Integer, STLTriagle> getSTLTriagles() {
		return STLTriagles;
	}
	
	public void setSTLTriagles(HashMap<Integer, STLTriagle> sTLTriagles) {
		STLTriagles = sTLTriagles;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
		
	
}
