package demo.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestListImplementedClasses {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>(6);
		Vector<Object> vctr = new Vector<Object>(6);
		Stack<Object> stk = new Stack<Object>();
		LinkedList<Object> ll = new LinkedList<Object>();

		al.add(null);
		al.add(1);
		al.add('a');

		vctr.add("hello");
		vctr.add("java");
		vctr.add("collection");
		vctr.add("freamwork");

		stk.add(1);
		stk.add(2);
		stk.add(3);
		stk.add(4);
		stk.add(5);

		ll.add("java");
		ll.add(6);
		ll.add(null);

		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingIterator(al);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingListIterator(al);

		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingIterator(vctr);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingListIterator(vctr);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingEnumaration(vctr);

		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingIterator(stk);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingListIterator(stk);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingEnumaration(stk);

		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingIterator(ll);
		UtilityClassForIterateOverCollection
				.iterateOverCollectionUsingListIterator(ll);

	}

}
