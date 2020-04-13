package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private int number;
    
    public RandomInitializer(int number) {
        this.number = number;
    }
    
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * number) - (number));
            System.out.print (array[i] + " ");
        
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
}
}
