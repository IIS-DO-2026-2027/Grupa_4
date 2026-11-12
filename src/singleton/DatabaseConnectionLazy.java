package singleton;

public class DatabaseConnectionLazy {
	//2. način implementacije singleton-a - Lazy loading
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}

	public static DatabaseConnectionLazy getInstance() {
		//konkurentnog progrmiranja, paralelno korišćenja aplikacije
		if(instance==null) {
			synchronized(DatabaseConnectionLazy.class) {
				if(instance==null)
					instance = new DatabaseConnectionLazy();
			}
		}
		return instance;
	}
	
	

}
