package com.company;

public class Main {

    public static void main(String[] args) {
	Zadanie10 z = new Zadanie10();
	z.wypisz(z.funkcja(15));
	z.wypisz(z.funkcja2(7));

	Zadanie10 zad = new Zadanie10(1,7);
	z.wypisz(z.funkcja1(1));
	z.wypisz(z.funkcja2(7)); }
    public static class Zadanie10{
        int a,b;
        public void wypisz(int wynik){
            System.out.println(wynik); }
        Zadanie10(){
            a=1;b=1;}
        Zadanie10(int Z,int Zd){
            a=Z;b=Zd;}
            public int funkcja(int wykonajOperacjeMatematycznaDodawanie){
            return a + wykonajOperacjeMatematycznaDodawanie;}
        public int funkcja1(int wykonajOperacjeMatematycznaMnozenie){
            return a * wykonajOperacjeMatematycznaMnozenie;}
        public int funkcja2(int wykonajOperacjeMatematycznaMnozenie){
            return b * wykonajOperacjeMatematycznaMnozenie;}
     }
}
