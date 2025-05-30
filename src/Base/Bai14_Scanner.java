package Base;

import java.util.Scanner;

public class Bai14_Scanner {
    public static void main(String[] args) {

        // Scanner được sử dụng để lấy dữ liệu đầu vào của người dùng
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        // Để sử dụng lớp Scanner, hãy tạo một đối tượng của lớp và sử dụng bất kỳ phương thức nào có sẵn trong Scanner.
        // Trong ví dụ trên, sử dụng nextLine() phương thức được sử dụng để đọc Chuỗi
        // Để đọc các kiểu khác
//    nextBoolean()	Đọc giá trị boolean từ người dùng
//    nextByte()	Đọc giá trị byte từ người dùng
//    nextDouble()	Đọc giá trị double từ người dùng
//    nextFloat()	Đọc giá trị float từ người dùng
//    nextInt()   	Đọc giá trị int từ người dùng
//    nextLine()	Đọc giá trị chuỗi từ người dùng
//    nextLong()	Đọc giá trị long từ người dùng
//    nextShort()	Đọc giá trị short từ người dùng

        // Bài tập : sử dụng các phương pháp khác nhau để đọc dữ liệu thuộc nhiều loại khác nhau
        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }




}
