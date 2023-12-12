import java.util.HashMap;
public class Set<E> extends HashMap<E,Integer> {

    boolean contains(E element){
      return containsKey(element);
  }

  boolean add(E element) {
      if ( !contains( element ) ) {
          put(element, 0);
          return true;
      }
      return false;
  }

  boolean delete(E element){
      return remove(element, 0);
  }

  boolean containsAll(Set<E> s){
      for(E element : s.keySet()){
          if (!contains(element)){
              return false;
          }
      }
      return true;
  }

  boolean addAll(Set<E> s){
      if(containsAll(s)){
          return false;
      }
      putAll(s);
      return true;
  }
  boolean removeAll(Set<E> s){
      boolean result = false;
      for(E element : s.keySet()){
          if(delete(element)) result = true;
      }
      return  result;
  }
  boolean retainAll(Set<E> s){
      boolean result = false;
      Set<E> thisset = new Set<>();
      thisset.addAll(this);
      clear();
      for(E element : thisset.keySet()){
          if(s.contains(element)){
              add(element);
              result = true;
          }
      }
      return  result;
  }

}

