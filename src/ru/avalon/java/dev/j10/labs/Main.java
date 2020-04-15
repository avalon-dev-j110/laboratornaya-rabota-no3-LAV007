package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int [20];
        /**
         * Проинициализировать массив значениями                
	 * последовательности чисел Фибоначчи.
         */
        FibonacciInitializer f = new FibonacciInitializer();
        f.initialize(array);
        System.out.println("Initialization of array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
                
        /**
         * Найти сумму элементов массива.
         */
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The amount of Fibonacci's numbers is " + sum);
                
        /**
         * Проинициализировать массив последовательностью
	 * случайных чисел в диапазоне от -50 до 50.
         */ 
        RandomInitializer random = new RandomInitializer(-50, 50);
        System.out.println("\n-------------------------------------------------------------------- \n" +
                           "Initialization with random numbers from " + RandomInitializer.minValue +
                           " to " + RandomInitializer.maxValue + " :");
        random.initialize(array);        
        for(int print: array) System.out.print(print + " ");
        System.out.println();
        
        /**
         * Отсортировать массив с использованием
	 * пузырьковой сортировки.
         */
        System.out.println("Sort of array by BUBBLE sort: ");
        BubbleSort bubble = new BubbleSort();
        bubble.sort(array);
        for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        
        /**
         * Проинициализировать массив последовательностью
	 * случайных чисел в диапазоне от -50 до 50.
         */
        System.out.println("\n-------------------------------------------------------------------- \n" +
                           "Initialization with random numbers from " + RandomInitializer.minValue +
                           " to " + RandomInitializer.maxValue + " :");
        random.initialize(array);
        for(int print: array) System.out.print(print + " ");
        System.out.println();
        
        /**
         * Отсортировать массив с использованием
	 * сортировки выбора.
         */
        System.out.println("Sort of array by SELECTION sort: ");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        
        /**
         * Проинициализировать массив последовательностью
	 * случайных чисел в диапазоне от -50 до 50.
         */
        System.out.println("\n-------------------------------------------------------------------- \n" +
                           "Initialization with random numbers from " + RandomInitializer.minValue +
                           " to " + RandomInitializer.maxValue + " :");
        random.initialize(array);
        for(int print: array) System.out.print(print + " ");
        System.out.println();
        
        /**
         * Отсортировать массив с использованием
	 * сортировки Шела.
         */
        System.out.println("Sort of array by SHELL sort: ");
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        System.out.println("\n");
        
        /* Сортировка с помощью стандартного класса Arrays
        System.out.println("\n");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));  */      

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
