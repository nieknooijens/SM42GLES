package dg.maincode.STLObjecten;

import java.util.ArrayList;

public class STLTriagle {
	private ArrayList<STLSide> STLSides;
	
	public STLTriagle(ArrayList<STLSide> sTLSides) {
		super();
		STLSides = sTLSides;
	}
	
	public ArrayList<STLSide> getSTLTriagles() {
		return STLSides;
	}
	
	public void setSTLTriagles(ArrayList<STLSide> sTLSides) {
		STLSides = sTLSides;
	}
	
	public ArrayList<float[]> getSTLObjectFloatData(){
		ArrayList<float[]> STLObjectFloatData = new ArrayList<float[]>();
		for(STLSide t : STLSides){
			STLObjectFloatData.add(t.toFloatData());
		}
		return STLObjectFloatData;
	}		
	
}
