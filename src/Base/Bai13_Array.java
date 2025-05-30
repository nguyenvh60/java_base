package Base;

public class Bai13_Array {
    public static void main(String[] args) {
        //Mảng được sử dụng để lưu trữ nhiều giá trị trong một biến duy nhất, thay vì khai báo các biến riêng biệt cho mỗi giá trị.
        //Để khai báo một mảng, hãy xác định kiểu biến bằng dấu ngoặc vuông :
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        // Lặp qua một mảng
        // Có thể lặp qua các phần tử mảng bằng vòng lặp for và sử dụng thuộc tính length để chỉ định số lần vòng lặp sẽ chạy
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }

        // Ngoài ra còn có vòng lặp " for-each ", được sử dụng riêng để lặp qua các phần tử trong mảng:
        // for (type variable : arrayname) {

        //}
        for (String i : cars) {
            System.out.println(i);
        }

        // Chỉ số mảng bắt đầu bằng 0: [0] là phần tử đầu tiên. [1] là phần tử thứ hai
    }
}
