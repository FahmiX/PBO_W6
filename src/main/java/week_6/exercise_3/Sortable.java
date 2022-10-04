package week_6.exercise_3;

abstract class Sortable {

    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        Employee[] staff = (Employee[]) a;
        int i, j;

        for (i = 0; i < staff.length - 1; i++) {
            for (j = i + 1; j < staff.length; j++) {
                if (staff[i].compare(staff[j]) > 0) {
                    Employee temp = staff[i];
                    staff[i] = staff[j];
                    staff[j] = temp;
                }
            }
        }
    }
}
