package Base;

public class Bai16_MethodParameters {
//    Thông tin có thể được truyền tới phương thức dưới dạng tham số. Tham số hoạt động như các biến bên trong phương thức
//    Các tham số được chỉ định sau tên phương thức, bên trong dấu ngoặc đơn.
//    Bạn có thể thêm bao nhiêu tham số tùy thích, chỉ cần phân tách chúng bằng dấu phẩy.

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }


    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Bạn còn trẻ");
        } else {
            System.out.println("Bạn đã trưởng thành rồi đấy");
        }

    }


    // Khi một tham số được truyền vào phương thức, nó được gọi là một đối số
    // Khi làm việc với nhiều tham số,
    // lệnh gọi phương thức phải có cùng số đối số với số tham số và các đối số phải được truyền theo cùng một thứ tự.
    public static void main(String[] args) {
        myMethod("Hoàng Nguyên", 20);
        // fname, age là tham số. Hoàng Nguyên và 20 là đối số

        checkAge(20);
    }
}
