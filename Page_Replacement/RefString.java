import java.util.ArrayList;

class RefString {
	ArrayList<Integer> refString;

	RefString() {
		refString = new ArrayList<Integer>();
	}
	RefString(ArrayList<Integer> rs) {
		refString = rs;
	}

	int getLength() {
		return refString.size();
	}
	int getAtIndex(int i) {
		return refString.get(i);
	}
	void print() {
		int i;
		for (i = 0; i < refString.size() - 1; i++) {
			System.out.print(refString.get(i) + ", ");
		}
		System.out.print(refString.get(i));
	}
}
