package conferenceListCreator;

import java.util.*;

public class Sorter {

	public void QuickSort(List<Person> people, Comparator<Person> comparator) {
		QuickSort(people, comparator, 0, people.size() - 1);
	};

	private void QuickSort(List<Person> people, Comparator<Person> comparator, int left, int right) {

		if (left >= right) {
			return;
		}

		Person pivot = people.get(left + (right - left) / 2);
		int il = left;
		int ir = right;

		while (il <= ir) {
			while (comparator.compare(people.get(il), pivot) < 0) {
				il++;
			}
			while (comparator.compare(pivot, people.get(ir)) < 0) {
				ir--;
			}
			if (il <= ir) {
				Collections.swap(people, il, ir);
				il++;
				ir--;
			}
		}

		QuickSort(people, comparator, left, il - 1);
		QuickSort(people, comparator, il, right);
	};

}
