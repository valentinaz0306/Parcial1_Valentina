package model;
import java.util.Comparator;

public class  Categoria implements Comparator<CompareC> {
   
	@Override
    public int compare(CompareC n1, CompareC  n2) {
    	return n1.getMovie().compareTo(n2.getSerie());
    }
	
	}
	
	

