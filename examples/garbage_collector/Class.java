public class Class {
    public Class() {
        System.out.println("Object Created.");
    }
    
    protected void finalize() {
        System.out.println("Object Deleted.");
    }
}