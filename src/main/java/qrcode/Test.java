package qrcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		primero();
//		List<Integer> lista1=Arrays.asList(1,2,3,4,5,6);
//		List<Integer> lista2=Arrays.asList(2,3,4,5,6,7);
//		List<Integer> listan = segundo(lista1, lista2);
//		for(Integer i:listan){
//			System.out.println(i);
//		}
	}
	
	static void primero(){
		Integer lista[] = { 3, 33, 6, 9, 12 };
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] <= 6) {
				//// mostrar(lista [i])
				System.out.println(lista[i]);
			}
//			System.out.println(i);
		}
	}

	static List<Integer> segundo(List<Integer> l, List<Integer> l2) {
		List<Integer> n = new ArrayList<Integer>();
		if (l.size() == l2.size()) {
			for (int i = 0; i < l.size(); i++) {
				for (int j = 0; j < l2.size(); j++) {

					if (i == j) {
						if (l.get(i) == l2.get(j)) {
							n.add(-1);
						} else if (l.get(i) > l2.get(j)) {
							n.add(l2.get(j));
						} else if (l.get(i) < l2.get(j)) {
							n.add(l.get(i));
						}

					}

				}
			}
		}
		return n;
	}
}
