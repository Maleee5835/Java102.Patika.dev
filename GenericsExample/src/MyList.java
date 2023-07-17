public class MyList<T> {
    private int capacity;
    private T[] genericArr;

    public MyList(){
        setCapacity(10);
        setGenericArr((T[]) new Object[getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setGenericArr((T[]) new Object[getCapacity()]);
    }
    public int size(){
        int counter=0;
        for (int i=0;i<getCapacity();i++){
            if (getGenericArr()[i] != null){
                counter++;
            }
        }
        return counter;
    }
    public void doubleCapacity(){
        T[] tempArray = getGenericArr();

        setCapacity(getCapacity()*2);
        setGenericArr((T[]) new Object[getCapacity()]);

        int i =0;
        for (T oldElements : tempArray){
            this.getGenericArr()[i] = oldElements;
        }
    }

    public int gerAvailableCapaciry(){
        return getCapacity() - size();
    }

    public void checkCapacity(int numOfelemnts){
        if (numOfelemnts > gerAvailableCapaciry()){
            doubleCapacity();
            checkCapacity(numOfelemnts);
        }
    }

    public void add(T element){
        checkCapacity(1);
        getGenericArr()[size()]=element;
    }

    public void clear(){
        for (int i =0 ; i<size();i++){
            getGenericArr()[i]=null;
        }
    }

    public boolean isContains(T data){
        boolean isContains =false;
        for (int i =0; i<size();i++){
            if (getGenericArr()[i]==data){
                isContains=true;
            }
        }
        return isContains;
    }

    public boolean isEmpty(){
        boolean isEmpty= true;
        int counter=0;
        for (int i=0;i<size();i++){
            if (getGenericArr()[i]!=null){
                counter++;
            }
        }
        if (counter==0){
            isEmpty=true;
        }else {
            isEmpty=false;
        }
        return isEmpty;
    }

    public void set(int index , T element){
        if (getGenericArr()[index] != null){
            getGenericArr()[index] =element;
        }
    }
    //Boş konstraktırda eksik çalışıyor
   public int termOfFirst(){
        T first = null;
        for (int i =0;i<size();i++){
            first=getGenericArr()[i];
            break;
        }
        return (int) first;
   }

    public int termOfLast(){
        T first = null;
        for (int i =0;i<size();i++){
            first=getGenericArr()[i];

        }
        return (int) first;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getGenericArr() {
        return genericArr;
    }

    public void setGenericArr(T[] genericArr) {
        this.genericArr = genericArr;
    }

}