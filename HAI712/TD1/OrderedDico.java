public class OrderedDico extends AbstractDico{
    public OrderedDico() {
        keys = new Object[0];
        values = new Object[0];
    }

    @Override
    public int indexOf(Object key){
        return -1;
    }
}