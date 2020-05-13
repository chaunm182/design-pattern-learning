package iterator_pattern;

public class CategoryRepository implements Container {
    public String[] name = new String[]{"Sách","Máy tính","Quần áo"};

    @Override
    public Iterator getIterator() {
        return new CategoryIterator();
    }

    public class CategoryIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < name.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return name[index++];
            }
            return null;
        }
    }

}
