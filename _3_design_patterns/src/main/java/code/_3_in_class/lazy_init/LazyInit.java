package code._3_in_class.lazy_init;

public class LazyInit {
    private static LazyInit instance;

    private LazyInit() { }

    public static LazyInit getInstance() {
        if(instance == null){
            instance = new LazyInit();
        }
        return instance;
    }
}
