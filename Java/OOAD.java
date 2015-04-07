public class OOAD {
	public static void main(String args[]) {
		new OOAD();
	}

	public OOAD() {
		Chair chair = new Chair(Metirial.WOOD, Metirial.METAL);
		chair.testFurniture();
	}

	enum Metirial {
		WOOD ("WoodenFurnitureTest"),
		METAL ("MetalFurnitureTest");

		private final String className;
		Metirial(String className) {
			this.className = className;
		}

		public void runTest() {
			try {
				FurnitureTest test = (FurnitureTest) Class.forName(this.className).newInstance();
				test.testFurniture();
			}
			catch (IllegalAccessException|InstantiationException|ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	interface FurnitureTest {
		public void testFurniture();
	}

	class WoodenFurnitureTest implements FurnitureTest {
		public void testFurniture() {
			System.out.println("Running wood test");
		}
	}

	class MetalFurnitureTest implements FurnitureTest {
		public void testFurniture() {
			System.out.println("Running metal test");
		}
	}

	abstract class Furniture {
		Metirial metirials[];

		public Furniture(Metirial... metirials) {
			this.metirials = metirials;
		}

		public void testFurniture() {
			for(Metirial mat:metirials) {
				mat.runTest();
			}
		}
	}

	class Chair extends Furniture {
		public Chair(Metirial... metirials) {
			super(metirials);
		}
	}

}