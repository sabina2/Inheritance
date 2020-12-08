package com.Loading;
    class Addition {
        void add(int a, int b) {
            System.out.println("Addition is " + (a + b));
        }
    }
        class Subtration extends Addition {
            void subt(int a, int b) {
                System.out.println("Subtraction is " + (a - b));
            }
        }

        class Multiplication extends Subtration{
        void mult(int a,int b){
            System.out.println("Multiplication is "+(a*b));
        }
        }

        class Division extends Multiplication{
        void div(int a,int b){
            System.out.println("Division is "+(a/b));
        }

        void callAll(){
            add(2,3);
            subt(5,3);
            mult(2,2);
            div(10,2);
        }
        }


        public class Main extends Division {
        public static void main(String[] args) {
	            Main m1=new Main();
	            m1.callAll();
    }
}
