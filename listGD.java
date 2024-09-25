package phamthithuha_23680571;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listGD {
	List<giaoDich> ls;
	public listGD() {
		ls= new ArrayList<giaoDich>(2);
	}
	public boolean themGD(giaoDich g) {
		if (!ls.contains(g)) {
			return false;
		} else {
			return ls.add(g);
		}
}
//xuat giao dich
	public List<giaoDich> getAll(){
		return ls;
	}
//sap xep
	public giaoDich tim(String ma) {
		for(giaoDich GiaoDich : ls) {
			if(GiaoDich.getMaGD().equalsIgnoreCase(ma))
				return GiaoDich;	
		}
		return null;
	}
}
