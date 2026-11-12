package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		/*DatabaseConnection connection1 = new DatabaseConnection();
		DatabaseConnection connection2 = new DatabaseConnection();*/
		
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		
		System.out.println(connection1);
		System.out.println(connection2);
		
		System.out.println(Integer.toHexString(connection1.hashCode()));
		System.out.println(Integer.toHexString(connection2.hashCode()));
		
		DatabaseConnectionLazy connectionLazy1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy connectionLazy2 = DatabaseConnectionLazy.getInstance();
		
		System.out.println(Integer.toHexString(connectionLazy1.hashCode()));
		System.out.println(Integer.toHexString(connectionLazy2.hashCode()));

	}

}
