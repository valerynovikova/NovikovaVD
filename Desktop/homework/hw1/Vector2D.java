

public class Vector2D {

    private double a;
    private double b;

    // • Vector2D() - конструктор для нулевого вектора;
    public Vector2D() {
        this.a = 0;
        this.b = 0;
    }

    // • Vector2D(double, double) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
    public Vector2D(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // • Vector2D add(Vector2D) - сложение вектора с другим вектором, результат возвращается как новый объект.
    public Vector2D add(Vector2D vector) {
        Vector2D vectorToReturn = new Vector2D(this.a + vector.a, this.b + vector.b);
        return vectorToReturn;
    }

    // • void add2(Vector2D) - сложение вектора с другим вектором, результат сохраняется в том, у кого был вызван этот метод;
    public void add2(Vector2D vector) {
        this.a = this.a + vector.a;
        this.b = this.b + vector.b;
    }

    // • Vector2D sub(Vector2D) - вычитание из вектора другого вектора, результат возвращается как новый объект;
    public Vector2D sub(Vector2D vector) {
        return new Vector2D(this.a - vector.a, this.b - vector.b);
    }

    // • void sub2(Vector2D) - вычитание из вектора другого вектора, результат сохраняется в том векторе, у кого был вызван этот метод;
    public void sub2(Vector2D vector) {
        this.a = a - vector.a;
        this.b = b - vector.b;
    }

    // • Vector2D mult(double) - умножение вектора на вещественное число, результат возвращается как новый объект;
    public Vector2D mult(double number) {
        return new Vector2D(this.a * number, this.b * number);
    }

    // • void mult2(double) - умножение вектора на вещественное число, результат сохраняется в векторе;
    public void mult2(double number) {
        this.a = a * number;
        this.b = b * number;
    }

    // • String toString() - строковое представление вектора;
    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    // • double length() - длина вектора;
    public double length() {
        double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return result;
    }

    // • double scalarProduct(Vector2D) - скалярное произведение вектора на другой вектор;
    public double scalarProduct(Vector2D vector) {
        return ((this.a * vector.a) + (this.b * vector.b));
    }

    // • double cos(Vector2D) - косинус угла между этим и другим вектором;
    public double cos(Vector2D vector) {
        double numerator = this.scalarProduct(vector);
        double denominator = this.length() * vector.length();
        return numerator / denominator;
    }

    // • boolean equals(Vector2D) - сравнить вектор с другим вектором
    public boolean equals(Vector2D vector) {
        if (this.a == vector.a && this.b == vector.b) {
            return true;
        }
        return false;
    }
}
