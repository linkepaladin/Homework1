public class Main {
    public static void main(String[] args) {
    task6();
    }
    public static void  task6() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес двух боксеров равен " + totalWeight + " кг");
        System.out.println("Разница между боксерами составляет " + weightDifference + " кг");
    }
}