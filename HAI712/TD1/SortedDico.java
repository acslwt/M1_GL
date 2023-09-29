import java.util.Arrays;

public class SortedDico extends AbstractDico{
    public SortedDico() {
        keys = new Object[0];
        values = new Object[0];
    }

    //Recherche dichotomique
    @SuppressWarnings("unchecked")
    public int indexOf(Object key){

        Comparable<Object> researched_key = (Comparable<Object>) key;

        int first = 0;
        int last = this.size();

        int middle = (first+last)/2;

        while(first<=last){
            Comparable<Object> current_key = (Comparable<Object>) this.keys[middle];

            if(current_key.compareTo(researched_key)>0){
                first = middle+1;
            }else if(current_key==researched_key){
                return middle;
            }else{
                last = middle-1;
            }
            middle = (first + last)/2;
            if(first>last){
                return -1;
            }
        }
        return -2;
    }
}