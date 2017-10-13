package com.company;

/**
 * Kashkan Vladislav
 */

import java.util.*;

public class Main {

    /**
     * X - Случайное, целое число;
     * index - индекс первого элемента списка, который будет строго меньше X;
     * arrayList - хранит список случайных, целых значений;
     * count - Количество добавляемых элементов в arrayList;
     */
    private static int x = (int) (Math.random()*1000);
    private static int index;
    private static int count = (int) (Math.random()*100);
    private static ArrayList<Integer> arrayList;

    /**Заполняем список:
     *
     * Т.к в задача поставлена на нахождение элемента в списке, и добавление элементов
     * осуществляется последовательно, используется ArrayList.
     *
     * @param count - количество элементов, добавляемых в список.
     * @return arrayList - заполненый список.
     */
    public ArrayList addArrayList(int count){
        arrayList = new ArrayList<Integer>();
        for(int i = 0; i <= count; i ++){
            arrayList.add((int) (Math.random() * 1000));
        }
        return  arrayList;
    }

    /**Сортирует arrayList по убыванию
     *
     * @return arrayList (отсортированный)
     */
    public ArrayList sortArrays(){
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    /**
     *
     * @param arrayList - отсортированный список;
     * @param x - случайное число.
     * @return index - возвращает индекс первого элемента списка, который строго меньше x.
     */
    public Integer bSearch(ArrayList<Integer> arrayList, int x) {

        for (int q = 0; q < arrayList.size(); q++) {
            if (arrayList.get(q) < x) {
                index = arrayList.indexOf(arrayList.get(q));
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addArrayList(count);
        System.out.println("Количество добавляемых элементов в arrayList: " + count);
        System.out.println("До сортировки: " + arrayList);
        main.sortArrays();
        System.out.println("После сортировки: " + arrayList);
        main.bSearch(arrayList, x);
        System.out.println("Индекс: " + index);
        System.out.println("X: " + x);
    }
}

/**Результат работы программы:

 * До сортировки: [357, 297, 371, 271, 687, 231, 494, 173, 501, 950, 102, 369, 846, 868, 889, 634, 277, 879, 480, 295, 505, 164, 938, 111, 239, 746, 518, 974, 431, 131, 146, 570, 781, 340, 3, 964, 706, 621, 702, 468, 133, 108, 1, 10, 433, 770, 669, 696, 513, 44, 131]
 После сортировки: [974, 964, 950, 938, 889, 879, 868, 846, 781, 770, 746, 706, 702, 696, 687, 669, 634, 621, 570, 518, 513, 505, 501, 494, 480, 468, 433, 431, 371, 369, 357, 340, 297, 295, 277, 271, 239, 231, 173, 164, 146, 133, 131, 131, 111, 108, 102, 44, 10, 3, 1]
 Индекс: 19
 X: 561

 * До сортировки: [431, 384, 48, 795, 68, 383, 164, 266, 677, 987, 770, 909, 564, 853, 723, 724, 795, 443, 275, 945, 754, 854, 576, 218, 62, 354, 352, 757, 219, 682, 242, 508, 721, 355, 601, 655, 932, 845, 587, 961, 720, 536, 988, 578, 691, 741, 562, 932, 896, 957, 648]
 После сортировки: [988, 987, 961, 957, 945, 932, 932, 909, 896, 854, 853, 845, 795, 795, 770, 757, 754, 741, 724, 723, 721, 720, 691, 682, 677, 655, 648, 601, 587, 578, 576, 564, 562, 536, 508, 443, 431, 384, 383, 355, 354, 352, 275, 266, 242, 219, 218, 164, 68, 62, 48]
 Индекс: 9
 X: 867

 * До сортировки: [627, 632, 10, 699, 544, 442, 825, 554, 971, 646, 873, 568, 957, 347, 249, 664, 597, 891, 357, 389, 164, 507, 93, 201, 417, 385, 569, 742, 888, 301, 400, 252, 583, 530, 692, 19, 384, 849, 780, 531, 645, 137, 440, 758, 918, 225, 804, 839, 472, 375, 405]
 После сортировки: [971, 957, 918, 891, 888, 873, 849, 839, 825, 804, 780, 758, 742, 699, 692, 664, 646, 645, 632, 627, 597, 583, 569, 568, 554, 544, 531, 530, 507, 472, 442, 440, 417, 405, 400, 389, 385, 384, 375, 357, 347, 301, 252, 249, 225, 201, 164, 137, 93, 19, 10]
 Индекс: 3
 X: 912

 * До сортировки: [391, 693, 637, 32, 546, 150, 88, 469, 934, 585, 733, 302, 379, 642, 827, 854, 820, 802, 350, 869, 955, 146, 828, 278, 191, 518, 620, 997, 85, 811, 693, 554, 708, 374, 978, 541, 531, 961, 883, 752, 507, 198, 440, 407, 979, 295, 876, 51, 942, 616, 83]
 После сортировки: [997, 979, 978, 961, 955, 942, 934, 883, 876, 869, 854, 828, 827, 820, 811, 802, 752, 733, 708, 693, 693, 642, 637, 620, 616, 585, 554, 546, 541, 531, 518, 507, 469, 440, 407, 391, 379, 374, 350, 302, 295, 278, 198, 191, 150, 146, 88, 85, 83, 51, 32]
 Индекс: 45
 X: 149

 * До сортировки: [499, 331, 99, 531, 848, 361, 294, 420, 586, 541, 420, 997, 886, 188, 334, 49, 282, 149, 672, 775, 814, 549, 246, 337, 400, 740, 623, 565, 479, 771, 558, 101, 761, 192, 469, 548, 420, 424, 815, 4, 159, 259, 66, 431, 362, 242, 914, 920, 3, 848, 558]
 После сортировки: [997, 920, 914, 886, 848, 848, 815, 814, 775, 771, 761, 740, 672, 623, 586, 565, 558, 558, 549, 548, 541, 531, 499, 479, 469, 431, 424, 420, 420, 420, 400, 362, 361, 337, 334, 331, 294, 282, 259, 246, 242, 192, 188, 159, 149, 101, 99, 66, 49, 4, 3]
 Индекс: 41
 X: 215
 */
