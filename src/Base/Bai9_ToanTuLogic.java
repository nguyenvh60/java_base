package Base;

public class Bai9_ToanTuLogic {
    public static void main(String[] args) {
        // Các toán tử logic được sử dụng để xác định logic giữa các biến hoặc giá trị:
        // Toán tử && trả về true nếu cả hai câu lệnh đều đúng
        int x = 5;
        System.out.println(x > 3 && x < 10); //trả về true vì 5 lớn hơn 3 VÀ 5 nhỏ hơn 10


        // Toán tử  || trả về true nếu một trong các câu lệnh là đúng
        int y = 5;
        System.out.println(y > 3 || y < 4); //trả về giá trị đúng vì một trong các điều kiện là đúng (5 lớn hơn 3, nhưng 5 không nhỏ hơn 4)

        // Toán tử ! đảo ngược kết quả, trả về false nếu kết quả là đúng
        int z = 5;
        System.out.println(!(z > 3 && z < 10)); // // trả về false vì ! được sử dụng để đảo ngược kết quả
    }


}
