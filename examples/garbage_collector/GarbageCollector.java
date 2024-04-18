public class GarbageCollector {
	 public static void main(String[] args) {
        Class obj = new Class();

        obj = null;
        
        System.gc();
    }
}