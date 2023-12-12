public class Lab07 {
    public static void main(String[] args) {
        Set<Integer> s = new Set<>();
        Set<Integer> s1 = new Set<>();
        s.add(2);
        s.add(5);

        s1.add(90);
        System.out.println(s1.size());
//        System.out.println(s1.addAll(s));
//        System.out.println(s1.containsAll(s));
//        System.out.println(s1.removeAll(s));
//        System.out.println(s1.removeAll(s));
//        System.out.println(s1.retainAll(s));
//        for(Map.Entry m : s.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
        for(int i : s.keySet()){
            System.out.println(i);
        }
        System.out.println("/////////////////");
        for(int i : s1.keySet()){
            System.out.println(i);
        }
    }
}