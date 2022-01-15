//2 ЗАДАНИЕ
import java.util.Scanner;
//RationalFraction() - конструктор для дроби, равной нулю;???
// reducevoid reduce.как сократить дробь
////double value() - десятичное значение дроби; • boolean equals(RationalFraction) - сравнить дробь с другой дробью • 
//(не забывайте, что 2/4 и 1/2 - одна и та же дробь) • int numberPart() - целая часть дроби;
public class RationalFraction {
	private int numerator;
	private int denominator;
	
	public RationalFraction(int numerator, int denominator) {
	this.numerator = numerator;
	this.denominator = denominator;
	}
	
	public RationalNumber add(RationalNumber p) {
		if (denominator == p.denominator) {
			return new RationalNumber(numerator + p.numerator, denominator);
		}
		int resDenominator = denominator * p.denominator;
		return new RationalNumber(numerator * p.denominator + p.numerator * denominator, resDenominator);
	}
	
	
	public void add2(RationalNumber) {
		if (denominator == p.denominator) {
			System.out.println(numerator + p.numerator, denominator);
		}
		int resDenominator = denominator * p.denominator;
		System.out.println(numerator * p.denominator + p.numerator * denominator, resDenominator);
	}
		
	public RationalNumber sub(RationalNumber p) {
		if (denominator == p.denominator) {
			return new RationalNumber(numerator - p.numerator, denominator);
		}
		int resDenominator = denominator * p.denominator; // общий знаменатель
		return new RationalNumber(numerator * p.denominator - p.numerator * denominator, resDenominator); // результат
	}
	public RationalNumber mul(RationalNumber p) {
		int resDenominator = denominator * p.denominator;
		return new RationalNumber(numerator * p.numerator, resDenominator);
	}
	public RationalNumber div(RationalNumber p) {
		int resDenominator = ;
		return new RationalNumber(, resDenominator);
	}
	@Override 
	public String toString() {
		return numerator + "/" + denominator;
	}
	public double value() {
		return numerator+"/"+ denominator;
	}
	public boolean equals(RationalNumber) {
        if (this.numerator == p.numerator && this.denominator == p.denominator) {
            return true;
        }
        return false;
    }
	
}


