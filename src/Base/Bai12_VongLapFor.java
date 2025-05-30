package Base;

public class Bai12_VongLapFor {
    public static void main(String[] args) {
        // Khi biết chính xác số lần bạn muốn lặp qua một khối mã, hãy sử dụng vòng lặp for thay vì while
        // Cú pháp
//        for (statement 1; statement 2; statement 3) {
//            // code block to be executed
//        }
//        Câu lệnh 1 được thực thi (một lần) trước khi thực thi khối mã.
//        Câu lệnh 2 định nghĩa điều kiện để thực thi khối mã.
//        Câu lệnh 3 được thực thi (mỗi lần) sau khi khối mã đã được thực thi.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        Câu lệnh 1 đặt một biến trước khi vòng lặp bắt đầu (int i = 0).

//        Câu lệnh 2 định nghĩa điều kiện để vòng lặp chạy (i phải nhỏ hơn 5). Nếu điều kiện là đúng, vòng lặp sẽ bắt đầu lại,
//        nếu sai, vòng lặp sẽ kết thúc.

//        Câu lệnh 3 tăng một giá trị (i++) mỗi lần khối mã trong vòng lặp được thực thi.


        // Ví dụ in các giá trị chẵn từ 0 đến 10:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }


        // Vòng lặp for lồng nhau
        // "Vòng lặp bên trong" sẽ được thực hiện một lần cho mỗi lần lặp của "vòng lặp bên ngoài":

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); //

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }


    }
}
