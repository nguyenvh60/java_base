package Base;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//Ngày và giờ Java
//Ngày tháng Java
//Java không có lớp Date tích hợp sẵn, nhưng chúng ta có thể nhập java.time gói để làm việc với API ngày và giờ.
// Gói bao gồm nhiều lớp ngày và giờ. Ví dụ:
//LocalDate Biểu thị một ngày (năm, tháng, ngày (yyyy-MM-dd))
//LocalTime Biểu thị một thời gian (giờ, phút, giây và nano giây (HH-mm-ss-ns))
//LocalDateTime Biểu thị cả ngày và giờ (yyyy-MM-dd-HH-mm-ss-ns)
//DateTimeFormatter Định dạng để hiển thị và phân tích các đối tượng ngày giờ
public class Bai18_KieuDuLieuDate {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); //Tạo 1 đối tượng ngày
        System.out.println(myObj); // Hiển thị ngày hiện tại
        // Để hiển thị thời gian hiện tại (giờ, phút, giây và nano giây), hãy nhập java.time.LocalTime và sử dụng phương thức now() của lớp đó:
        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);

//Để hiển thị ngày và giờ hiện tại, hãy nhập java.time.LocalDateTime và sử dụngp hương thức now() của lớp đó
        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);


//Định dạng Ngày và Giờ
//"T" trong ví dụ trên được sử dụng để tách ngày khỏi thời gian. Bạn có thể sử dụng DateTimeFormatterlớp với ofPattern()phương thức trong cùng một gói để định dạng hoặc phân tích các đối tượng date-time.
// Ví dụ sau sẽ xóa cả "T" và nano giây khỏi date-time:
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
