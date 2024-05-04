public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Aleksandra Wojcik", 5000);
        employees[1] = new Employee("Krzysztof Kowalski", 4000);
        employees[2] = new Employee("Wiktor Nowak", 5400);
        employees[3] = new Employee("Oliwia Kot", 6200);
        employees[4] = new Employee("Filip Michalski", 7300);
        
        System.out.println("Dane pracownika o indeksie równym 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(4700);

        System.out.println("Dane wszystkich pracowników");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}