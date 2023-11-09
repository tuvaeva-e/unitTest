public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    //    В классе Calculator создайте метод calculateDiscount,
    //    который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
    //    Скидка sale - значение скидки в процентах
    public float calculateDiscount(float sum, int discount){
        if(discount < 0 ){
            throw new IllegalArgumentException("Скидка не может быть меньше 0%, проверьте введеное значение");
        }
        if (discount > 100){
            throw new IllegalArgumentException("Скидка не может быть больше 100%, проверьте введеное значение");
        }
        return sum - (sum*discount/100);
    }
}
