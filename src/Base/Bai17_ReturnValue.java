package Base;

public class Bai17_ReturnValue {
    // sử dụng void từ khóa void cho biết phương thức này không nên trả về giá trị.
//    Nếu bạn muốn phương thức trả về một giá trị, bạn có thể sử dụng kiểu dữ liệu nguyên thủy (như int, char, v.v.) thay vì void,
//    và sử dụng return từ khóa bên trong phương thức:

    static int myMethod(int x, int y) {
        return x+y ;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
        // Output 8 (5+3)
        // Hoặc lưu trũ kết quả trong 1 biến
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
