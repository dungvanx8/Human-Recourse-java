import java.util.Scanner;

public class Employee extends Staff implements ICalculator{
    private int soGioLamThem;

    public Employee(){

    }
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("Số giờ làm thêm: ");
        setSoGioLamThem(sc.nextInt());
    }

    public Employee(String id, String name, int age, double heSoLuong, String dayWork, String workingParts, int daysOfLeave,int soGioLamThem) {
        super(id, name, age, heSoLuong, dayWork, workingParts, daysOfLeave);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public String toString() {
        return getId();
    }

    @Override
    public void displayInformation() {
        System.out.println("ID: "+ getId()+ " * " + getName() + " * Tuổi: " + getAge()+ " * Bộ phận làm việc: "+ getWorkingParts());
        //System.out.println("Name: "+ getName());
        //.out.println("Age: "+ getAge());
        //System.out.println("Hệ số lương: " + getHeSoLuong());
        //System.out.println("Ngày vào làm: " +getDayWork());
        //System.out.println("Bộ phậm làm việc: " + getWorkingParts());
        //System.out.println("Số ngày nghỉ phép: " + getDaysOfLeave());
        //System.out.println();
    }

    @Override
    public int calculateSalary() {
        int luong =Math.abs((int) (getHeSoLuong()*3000000 + soGioLamThem*200000)/1000);
        luong = luong*1000;
        return luong;
    }
// return (int) (getHeSoLuong()*3000000 + soGioLamThem*200000);
}
