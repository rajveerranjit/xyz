package demo.list;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class UtilityClassForIterateOverCollection {
	public static void iterateOverCollectionUsingIterator(Collection<Object> c) {
		Iterator<Object> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void iterateOverCollectionUsingListIterator(List<Object> l) {
		ListIterator<Object> itr = l.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void iterateOverCollectionUsingEnumaration(Vector<Object> v) {
		Enumeration<Object> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
