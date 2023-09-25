import java.util.Arrays;

public class SortedDico extends AbstractDico{
    public SortedDico() {
        keys = new Object[0];
        values = new Object[0];
    }

    @Override
    public int indexOf(Object key){
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object get(Object key) throws Exception{
        int i = this.size()/2;
        int final_index = 0;
        Comparable<Object> researched_key = (Comparable<Object>) key;
        Object[] current_tab_keys = this.keys;
        while(current_tab_keys[i]!=key){
            System.out.println(Arrays.toString(current_tab_keys));
            Comparable<Object> current_key = (Comparable<Object>) current_tab_keys[i];
            if(current_key.compareTo(researched_key)>=0){
                i = i/2;
                current_tab_keys = Arrays.copyOfRange(current_tab_keys, 0, i);
                System.out.println("Premiere moitié "+Arrays.toString(current_tab_keys));

                final_index = i;
            }else {
                current_tab_keys = Arrays.copyOfRange(current_tab_keys, i, this.size());
                System.out.println("Deuxième moitié " + Arrays.toString(current_tab_keys));
                final_index = i + current_tab_keys.length/2;
            }
        }
        return final_index;
    }
}