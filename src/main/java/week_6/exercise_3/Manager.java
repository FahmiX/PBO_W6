package week_6.exercise_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee implements I_Sortable {

    // Attributes
    private String secretaryName;

    // Getter
    public String getSecretaryName() {
        return secretaryName;
    }

    // Constructor
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    // Methods
    @Override
    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    @Override
    public void shell_sorts(I_Sortable[] a) {
        I_Sortable temp;
        int i, j;

        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i].compare(a[j]) < 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    @Override
    public int compare(I_Sortable b) {
        Manager eb = (Manager) b;
        if (getSalary() < eb.getSalary()) {
            return -1;
        }
        if (getSalary() > eb.getSalary()) {
            return +1;
        }
        return 0;
    }

}
