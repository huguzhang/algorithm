package algorithm.search;

public class LinearSearch {

    private LinearSearch(){}

    public static void main(String[] args) {
        Integer[] oneList = {21,1,5,7,22,42,12,31,100,3,9,76};
        int index = linearSearch(oneList,31);
        System.out.println(index);
        System.out.println(oneList[index]);
    }

    public static <E> int linearSearch(E[] oneList,E value){

        int n = oneList.length;
        for (int i = 0; i < n; i++) {
            //泛型类的比较要使用equals方法
            if (oneList[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

}
