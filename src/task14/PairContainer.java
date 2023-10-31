package task14;

public class PairContainer<T> {
    private T key;
    private T value;
    PairContainer(T key,T value){
        this.key =key;
        this.value = value;
    }
    public static void main(String[] args){
        PairContainer<String> newPairContainer = new PairContainer("ss","55");
    }
}

