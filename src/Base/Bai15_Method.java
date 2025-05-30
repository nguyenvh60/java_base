package Base;

public class Bai15_Method {
    //    Phương thức là khối mã chỉ chạy khi được gọi.
//        Bạn có thể truyền dữ liệu, được gọi là tham số, vào một phương thức.
//        Phương pháp được sử dụng để thực hiện các hành động nhất định và chúng còn được gọi là hàm .
//        Tại sao sử dụng phương thức? Để tái sử dụng mã: định nghĩa mã một lần và sử dụng nhiều lần.
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    //    myMethod()là tên của phương pháp
//        static có nghĩa là phương thức thuộc về lớp Main chứ không phải là đối tượng của lớp Main.
//        void có nghĩa là phương pháp này không có giá trị trả về, sẽ tìm hiểu thêm về giá trị trả về sau trong chương này
//    }











    public static void main(String[] args) {


//        Một phương thức phải được khai báo trong một lớp.
//        Nó được định nghĩa bằng tên của phương thức, theo sau là dấu ngoặc đơn () .
//        Java cung cấp một số phương thức được xác định trước, chẳng hạn như System.out.println(),
//         nhưng bạn cũng có thể tạo phương thức của riêng mình để thực hiện một số hành động nhất định:
        myMethod();
        myMethod();


    }
}

