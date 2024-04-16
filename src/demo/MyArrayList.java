package demo;

public class MyArrayList {
    public Object[] container;
    public int size = 0;
    private static final int CAPACITY = 10;
    private int index;

    public MyArrayList(){
        this.container = new Object[CAPACITY];
    }
    public void add(Object o){
        this.container[size] = o;
        size++;
    }
    public void insert(int i, Object o){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == container.length) {
            resizeContainer();
        }
        for (i = size; i > index; i--) {
            container[i] = container[i - 1];
        }
        container[index] = o;
        size++;
    }

    private void resizeContainer() {
        int newCapacity = container.length * 2;
        Object[] newContainer = new Object[newCapacity];
        System.arraycopy(container, 0, newContainer, 0, size);
        container = newContainer;
    }


    public void readList(){
        for (Object o : container){
            if (o != null){
                System.out.println(o);
            }
        }
    }
    public Object get(int index){
        return this.container[size];
    }
    public  void remote(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            container[i] = container[i + 1];
        }
        container[size - 1] = null;
        size--;
    }
    public void update(int index, Object value){
        this.container[index] = value;
    }
}
