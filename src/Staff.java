import java.util.Scanner;

public abstract class Staff implements ICalculator{
    private String id;
    private String name;
    private int age;
    private double heSoLuong;
    private String  dayWork;
    private String workingParts;
    private int daysOfLeave;


    public Staff(){}

    public Staff(String id, String name, int age, double heSoLuong, String dayWork, String workingParts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.heSoLuong = heSoLuong;
        this.dayWork = dayWork;
        this.workingParts = workingParts;
    }

    public Staff(String  id, String name, int age, double heSoLuong, String dayWork, String workingParts, int daysOfLeave) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.heSoLuong = heSoLuong;
        this.dayWork = dayWork;
        this.workingParts = workingParts;
        this.daysOfLeave = daysOfLeave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getDayWork() {
        return dayWork;
    }

    public void setDayWork(String dayWork) {
        this.dayWork = dayWork;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public int getDaysOfLeave() {
        return daysOfLeave;
    }

    public void setDaysOfLeave(int daysOfLeave) {
        this.daysOfLeave = daysOfLeave;
    }

    public abstract void displayInformation();

    @Override
    public String toString() {
        return super.toString();
    }

    public void nhap(Scanner sc){
        System.out.print("Tên nhân viên: ");
        setName(sc.nextLine());
        System.out.print("Nhập ID nhân viên: ");
        setId(sc.nextLine());
        System.out.print("Age: ");
        setAge(sc.nextInt());
        System.out.print("Hệ số lương: ");
        setHeSoLuong(sc.nextDouble());
        System.out.print("Ngày vào làm việc: ");
        setDayWork(sc.next());
        sc.nextLine();
        System.out.print("Bộ phận làm việc: ");
        setWorkingParts(sc.nextLine());
        System.out.print("Số ngày nghỉ phép: ");
        setDaysOfLeave(sc.nextInt());
    }


}
