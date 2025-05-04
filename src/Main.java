public class Main {
    public static void main(String[] args) {
    task6();
    task7();
    task8();
    }
    public static void  task6() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес двух боксеров равен " + totalWeight + " кг");
        System.out.println("Разница между боксерами составляет " + weightDifference + " кг");
    }
    public static void task7() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference1 = boxerWeight2 - boxerWeight1;
        var weightDifference2 = boxerWeight2 % boxerWeight1;
    }
    public static void task8() {
        var totalWorkHours = 640;
        var workHoursPerEmployee = 8;
        var employeeCount = totalWorkHours / workHoursPerEmployee;
        System.out.println("Всего работников в компании " + employeeCount + " человек");
        var addedEmployees = employeeCount + 94;
        var newWorkHoursPerEmployee = totalWorkHours / addedEmployees;
        System.out.println("Если в компании работает " + addedEmployees + " человек, то всего " + newWorkHoursPerEmployee +
        " часов работы может быть поделено между сотрудниками");
    }
}