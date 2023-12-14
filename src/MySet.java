import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MySet<E> implements Set<E>{
    private HashMap<E,Integer> hashMap = new HashMap<>();

    public int size(){
        return hashMap.size();
    }
    public boolean isEmpty(){
        return hashMap.isEmpty();
    }

    public Iterator<E> iterator(){
        return hashMap.keySet().iterator();
    }

    public boolean contains(Object element){
        return hashMap.containsKey(element);
    }

    public Object[] toArray(){
        Object []array = new Object[size()];
        int i=0;
        for (Object element: this) {
            array[i++]=element;
        }
        return array;
    }

    public <T> T[]	toArray(T[] a){
        return a;
    }

    public boolean add(E element) {
        if ( !contains( element ) ) {
            hashMap.put(element, 0);
            return true;
        }
        return false;
    }

    public boolean remove(Object element){
        return hashMap.remove(element, 0);
    }

    public boolean containsAll(Collection<?> c){
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> c){
        boolean result=false;
        for (E element : c) {
            if (!contains(element)) {
                result = true;
                add(element);
            }
        }
        return result;
    }

    public boolean retainAll(Collection<?> c){
        boolean result = false;
        MySet<E> thisset = new MySet<>();
        thisset.addAll(this);
        clear();
        for(E element : thisset){
            if(c.contains(element)){
                add(element);
                result = true;
            }
        }
        return  result;
    }

    public boolean removeAll(Collection<?> c){
        boolean result = false;
        for(Object element : c){
            if(remove(element)) result = true;
        }
        return  result;
    }

    public void clear(){
        hashMap.clear();
    }


}
