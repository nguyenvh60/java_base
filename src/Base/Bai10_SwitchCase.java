package Base;

public class Bai10_SwitchCase {
    public static void main(String[] args) {
        //Câu lệnh này switch chọn một trong nhiều khối mã để thực thi:

        //Biểu thức switch được đánh giá một lần.
        //Giá trị của biểu thức được so sánh với giá trị của mỗi case.
        //Nếu có sự trùng khớp, khối mã liên quan sẽ được thực thi.
        //Từ khóa break và default là tùy chọn

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        } //  Outputs "Thursday" (day 4)


        //Khi Java đạt đến một từ khóa break , nó sẽ thoát khỏi khối chuyển đổi.
        //Điều này sẽ dừng việc thực thi thêm mã và thử nghiệm trường hợp bên trong khối.
        //Khi tìm thấy sự trùng khớp và công việc đã hoàn tất, đã đến lúc nghỉ ngơi. Không cần phải thử nghiệm thêm nữa.


        //Default chỉ định một số mã để chạy nếu không có trường hợp nào khớp:
        int today = 4;
        switch (today) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        // Outputs "Looking forward to the Weekend"
        // Nếu default sử dụng làm câu lệnh cuối cùng trong khối chuyển đổi thì không cần break để ngắt câu lệnh
    }
}
