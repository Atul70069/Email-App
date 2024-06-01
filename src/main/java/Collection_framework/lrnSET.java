package Collection_framework;

import java.util.HashSet;
import java.util.Set;

public class lrnSET {
    public static void main(String[] args) {

        // DUBLICATE ELEMENTS ARE NOT ALLOWED IN SET

        Set<Integer> st= new HashSet<>();


        st.add(12);
        st.add(15);
        st.add(16);
        st.add(18);
        st.add(19);

        System.out.println(st);
        st.remove(18);
        System.out.println(st);

        System.out.println(st.contains(15));

        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.clear();
        System.out.println(st );


    }
}
