package dg.maincode.STLObjecten;

import java.util.ArrayList;

public class STLObject {
	private ArrayList<STLTriagle> STLTriagles;
	private String name;
	private int ID;
	
	public STLObject(ArrayList<STLTriagle> sTLTriagles, String name, int iD) {
		super();
		STLTriagles = sTLTriagles;
		this.name = name;
		ID = iD;
	}
	
	public ArrayList<STLTriagle> getSTLTriagles() {
		return STLTriagles;
	}
	
	public void setSTLTriagles(ArrayList<STLTriagle> sTLTriagles) {
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
	
	public ArrayList<float[]> getSTLObjectFloatData(){
		ArrayList<float[]> STLObjectFloatData = new ArrayList<float[]>();
		for(STLTriagle t : STLTriagles){
			STLObjectFloatData.add(t.toFloatData());
		}
		return STLObjectFloatData;
	}		
	
}
