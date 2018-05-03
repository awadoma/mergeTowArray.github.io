
public class MainMargeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] obj1 = {"Ahmed", "Mohamed", "Ali"};
		Object [] obj2 = {"Arthar", "Mogahed", "Adam"};
		Object[] objR;
		MergeArray m = new MergeArray(obj1, obj2);
		objR = m.mergeTowArray();
		for(Object o : objR) {
			System.out.println(o);
			
		}
		}

	}


