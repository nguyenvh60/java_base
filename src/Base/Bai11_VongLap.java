package Base;

public class Bai11_VongLap {
    public static void main(String[] args) {
        //Vòng lặp có thể thực thi một khối mã miễn là đạt được điều kiện đã chỉ định.
        //Vòng lặp rất tiện lợi vì chúng tiết kiệm thời gian, giảm lỗi và làm cho mã dễ đọc hơn.


        // 1. Vòng lặp While
        // Vòng lặp này while lặp qua một khối mã miễn là điều kiện được chỉ định là true:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; //  mã trong vòng lặp sẽ chạy liên tục, miễn là biến (i) nhỏ hơn 5:
            // Đừng quên tăng biến được sử dụng trong điều kiện, nếu không vòng lặp sẽ không bao giờ kết thúc
        }



        // 2. Vòng lặp do-while
        // Vòng lặp do/while là một biến thể của while. Vòng lặp này sẽ thực thi khối mã một lần,
        // trước khi kiểm tra xem điều kiện có đúng không, sau đó nó sẽ lặp lại vòng lặp miễn là điều kiện vẫn đúng.
        int i2 = 6;
        do {
            System.out.println(i2);
            i2++;
        }
        while (i2 < 5); // Vòng lặp sẽ luôn được thực hiện ít nhất một lần,
        // ngay cả khi điều kiện là sai, vì khối mã được thực hiện trước khi điều kiện được kiểm tra:
        // output là 6, sau đó dừng

        // Ví dụ
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown --;
        }

        System.out.println("Happy New Year");
    }
}
