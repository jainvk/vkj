import interfaces.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

public class EmployeeSortTest {
    //    Comparator<String> comparator =  (first1, second1) -> {first1.getName() - second1.getName()};
//
//    Comparator<String> comp = (first, second) -> first.length() - second.length();


    @Test
    public void sortByLength() throws Exception {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        System.out.println(Arrays.toString(staff));

        java.util.Arrays.sort(staff, new NameComparator());

        System.out.println(Arrays.toString(staff));

        String[] stafffNames = new String[3];
        stafffNames[0] = "Harry Hacker";
        stafffNames[1] = "Carl Cracker";
        stafffNames[2] = "Tony Tester";


//        Arrays.sort(stafffNames, (first1, second1) -> first1.length() - second1.length());

        System.out.println(Arrays.toString(stafffNames));


    }

    class NameComparator implements Comparator<Employee> {

        public int compare(Employee first, Employee second) {
//            Logger.getGlobal().info("Comparing " + first + " and " + second);
            return first.getName().compareTo(second.getName());
        }
    }


    class LengthComparator implements Comparator<String> {

        public int compare(String first, String second) {
//            Logger.getGlobal().info("Comparing " + first + " and " + second);
            return first.length() - second.length();
        }
    }
}