package actions;

public interface ExtraActions {

    default void merge(String s1, String s2) {
        System.out.print(s1 + " слились с " + s2);
    }
}
