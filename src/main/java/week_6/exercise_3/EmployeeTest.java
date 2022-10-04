package week_6.exercise_3;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[2] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);

        // Print Sebelum di Sort
        System.out.println("Sebelum di Sort");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
        System.out.println("");

        // Memanggil Method .shell_sort
        Sortable.shell_sort(staff);

        // Print Sesudah di Sort
        System.out.println("Sesudah di Sort");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
        System.out.println("");

        // Memanggil Method .raiseSalary
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }
      
        // Print Sesudah kenaikkan Gaji
        System.out.println("Sesudah Dinaikkan Gaji");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
    
}