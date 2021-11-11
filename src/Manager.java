import java.util.Scanner;

public class Manager extends Staff implements ICalculator{
    private String chucDanh;

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public Manager() {
    }

    public Manager(String id, String name, int age, double heSoLuong, String dayWork, String workingParts, String chucDanh) {
        super(id, name, age, heSoLuong, dayWork, workingParts);
        this.chucDanh = chucDanh;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        sc.nextLine();
        System.out.print("Chức danh: ");
        chucDanh = sc.nextLine();
    }

    @Override
    public String toString() {
        return getWorkingParts();
    }
    /*@Override
    public int calculateSalary() {
        if(getChucDanh() == "Business Leader"){
            return (int) (getHeSoLuong()*5000000 + 8000000);
        }
        if(getChucDanh() == "Project Leader"){
            return (int) (getHeSoLuong()*5000000 + 5000000);
        }
        if(getChucDanh() == "Technical Leader"){
            return (int) (getHeSoLuong()*5000000 + 6000000);
        }
        return 0;
    }*/

    @Override
    public void displayInformation() {
        System.out.print("ID: "+ getId()+ " * " + getName() + " * Tuổi: " + getAge()+ " * Bộ phận làm việc: "+ getWorkingParts());
        //System.out.println("Name: "+ getName());
        //System.out.println("Age: "+ getAge());
        //System.out.println("Ngày vào làm: " +getDayWork());
        //System.out.println("Bộ phậm làm việc: " + getWorkingParts());
        //System.out.println("Số ngày nghỉ phép: " + getDaysOfLeave());
        System.out.println(" * Chức danh: " + getChucDanh());

    }

    @Override
    public int calculateSalary() {
        int luong = 0;
        if (chucDanh.equalsIgnoreCase("Business Leader")) {
            luong =Math.abs(((int) getHeSoLuong() * 5000000 + 8000000)/1000);
            luong = luong*1000;
        }
        else if (chucDanh.equalsIgnoreCase("Project Leader")) {
            luong = Math.abs(((int) getHeSoLuong() * 5000000 + 5000000)/1000);
            luong = luong*1000;
        }
        else if (chucDanh.equalsIgnoreCase("Technical Leader")) {
            luong = Math.abs(((int) getHeSoLuong() * 5000000 + 6000000)/1000);
            luong = luong*1000;
        }
        return luong;
    }
}
