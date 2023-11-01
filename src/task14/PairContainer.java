package task14;

public class PairContainer<T,S> {
    private T key;
    private S value;
    PairContainer(T key,S value){
        this.key =key;
        this.value = value;
    }
    public static void main(String[] args){
        PairContainer<String,Integer> newPairContainer = new PairContainer("ss",55);
    }
}

