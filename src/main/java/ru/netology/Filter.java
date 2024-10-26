package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;

    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int i : source) {
            if (i <= threshold) {
                logger.log(String.format("Элемент \"%d\"  не проходит", i));
            } else {
                logger.log(String.format("Элемент \"%d\" проходит", i));
                result.add(i);
                sum++;
            }
        }

        logger.log("Прошло фильтр " + sum + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        return result;
    }


}

