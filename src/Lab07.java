public class Lab07 {
    public static void printSet(MySet<Integer> s){
        System.out.print("{ ");
        for(Integer element : s) System.out.print(element+" , ");
        System.out.println(" }");
    }

    public static void main(String[] args) {
        MySet<Integer> A = new MySet<>();
        MySet<Integer> B = new MySet<>();
        B.add(4);
        B.add(5);
        B.add(6);
        B.add(-1);

        System.out.println("------------------------Test size, empty, add--------------------------");
        System.out.print("Set A = ");printSet(A);
        System.out.println("Size of A = "+A.size());
        System.out.println("Is A empty? = "+A.isEmpty());

        System.out.println("Add 5 in A = "+A.add(5));
        System.out.println("Add 5 in A = "+A.add(5));
        System.out.println("Add 6 in A = "+A.add(6));
        System.out.println("Add 7 in A = "+A.add(7));
        System.out.print("Set A = ");printSet(A);
        System.out.println("Size of A = "+A.size());
        System.out.println("Is A empty? = "+A.isEmpty());

        System.out.println("------------------------Test size, contains, remove--------------------------");
        System.out.println("Does A contains 5? = "+A.contains(5));
        System.out.println("Does A contains 1? = "+A.contains(1));

        System.out.println("Remove 7 in A = "+A.remove(7));
        System.out.println("Remove 7 in A = "+A.remove(7));
        System.out.println("Remove 99 in A = "+A.remove(99));

        System.out.print("Set A = ");printSet(A);
        System.out.print("Set B = ");printSet(B);
        System.out.println("Size of A = "+A.size());
        System.out.println("Size of B = "+B.size());

        System.out.println("------------------------Test containAll--------------------------");
        System.out.print("Set A = ");printSet(A);
        System.out.print("Set B = ");printSet(B);
        System.out.println("Does B containAll A? = "+B.containsAll(A));
        System.out.println("Does A containAll B? = "+A.containsAll(B));
        System.out.println("Does B containAll B? = "+B.containsAll(B));

        System.out.println("------------------------Test addAll--------------------------");
        A.add(99);
        A.add(88);
        System.out.print("Set A = ");printSet(A);
        System.out.print("Set B = ");printSet(B);

        System.out.println("B addAll A = "+B.addAll(A));
        System.out.print("Set B = ");printSet(B);
        System.out.println("B addAll A = "+B.addAll(A));
        System.out.print("Set B = ");printSet(B);
        System.out.println("B addAll B = "+B.addAll(B));
        System.out.print("Set B = ");printSet(B);

        System.out.println("------------------------Test retainAll--------------------------");
        MySet<Integer> C = new MySet<>();
        C.add(4);
        C.add(66);
        C.add(7);
        C.add(8);
        C.add(-1);
        System.out.print("Set A = ");printSet(A);
        System.out.print("Set B = ");printSet(B);
        System.out.print("Set C = ");printSet(C);

        System.out.println("B retainAll C = "+B.retainAll(C));
        System.out.print("Set B = ");printSet(B);
        System.out.println("C retainAll A = "+C.retainAll(A));
        System.out.print("Set C = ");printSet(C);

        System.out.println("------------------------Test removeAll--------------------------");
        C.add(4);
        C.add(5);
        C.add(6);
        C.add(-1);
        System.out.print("Set A = ");printSet(A);
        System.out.print("Set B = ");printSet(B);
        System.out.print("Set C = ");printSet(C);
        System.out.println("A removeAll B = "+A.removeAll(B));
        System.out.print("Set A = ");printSet(A);
        System.out.println("A removeAll C = "+A.removeAll(C));
        System.out.print("Set A = ");printSet(A);
        System.out.println("B removeAll C = "+B.removeAll(C));
        System.out.print("Set B = ");printSet(B);

        System.out.println("------------------------Test clear--------------------------");
        System.out.print("Set A = ");printSet(A);
        System.out.println("Clear A");A.clear();

        System.out.print("Set A = ");printSet(A);
    }
}