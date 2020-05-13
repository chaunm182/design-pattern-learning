package iterator_pattern;

public class Main {
    public static void main(String[] args) {
        Container repository = new CategoryRepository();
        Iterator iterator = repository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
