import java.util.*;

public class HummanResources {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            ArrayList<Departmentt> phongBan = new ArrayList<Departmentt>();
            phongBan.add(new Departmentt("BUS","Business"));
            phongBan.add(new Departmentt("PRO","Project"));
            phongBan.add(new Departmentt("TEC","Technical"));
            ArrayList<Staff> nhanvien = new ArrayList<>();

            Employee nhanvien1 = new Employee("BUS-01", "Nguyễn Văn Nam", 24, 2.0, "26/10/2020", "BUS", 3, 2);
            Employee nhanvien2 = new Employee("BUS-02", "Nguyễn Quốc Toàn", 19, 1.5, "16/2/2019", "BUS", 3, 2);
            Employee nhanvien3 = new Employee("PRO-01", "Bùi Thị Lan", 23, 2.0, "18/2/2018", "PRO", 2, 3);
            Employee nhanvien4 = new Employee("PRO-02", "Hoàng Quốc Việt", 20, 2.3, "18/4/2018", "PRO", 3, 3);
            Employee nhanvien5 = new Employee("PRO-03", "Phạm Văn Tùng", 23, 2.0, "30/1/2017", "PRO", 2, 3);
            Employee nhanvien6 = new Employee("TEC-01", "Phạm Văn Tùng", 30, 2.5, "18/2/2018", "TEC", 2, 3);
            Employee nhanvien7 = new Employee("TEC-02", "Nguyễn Ngọc Ngạn", 25, 2.3, "25/1/2017", "TEC", 3, 2);
            Manager nhanvien8 = new Manager("BUS-03", "Trần Quốc Toản", 32,3.0, "25/12/2017", "BUS", "Business Leader");
            Manager nhanvien9 = new Manager("PRO-04", "Phạm Văn Tuyên", 33,3.1, "26/3/2017", "PRO", "Project Leader");
            Manager nhanvien10 = new Manager("TEC-03", "Phạm Văn Thuật", 33,3.4, "01/2/2017", "TEC", "Technical Leader");
            nhanvien.add(nhanvien1);
            nhanvien.add(nhanvien2);
            nhanvien.add(nhanvien3);
            nhanvien.add(nhanvien4);
            nhanvien.add(nhanvien5);
            nhanvien.add(nhanvien6);
            nhanvien.add(nhanvien7);
            nhanvien.add(nhanvien8);
            nhanvien.add(nhanvien9);
            nhanvien.add(nhanvien10);
            String chucvu = "1000";
            String nhap = "" ;
        do {
            System.out.println("Danh sách nhân viên trong công ty: ");
            for (int i = 0; i <nhanvien.size();i++){
                nhanvien.get(i).displayInformation();
            }
            /////////////////Hiển thị các bộ phận/////////\
            System.out.println();
            System.out.println("Các phòng ban trong công ty: ");

            for (int i = 0; i< phongBan.size();i++){
                System.out.println(phongBan.get(i).toString());
            }
            System.out.println();
            //////////////////////Hiển thị các nhân viên theo từng bộ phận///////////
            for(int i =0; i<phongBan.size();i++){
                System.out.println("Nhân viên bộ phân:" + phongBan.get(i).toString());
                int dem =0;
                for (int j=0; j<nhanvien.size();j++){

                    if(nhanvien.get(j).getWorkingParts().equalsIgnoreCase(phongBan.get(i).getMaBoPhan())){
                        dem++;

                       nhanvien.get(j).displayInformation();
                    }

                }
                System.out.println("Bộ phận "+phongBan.get(i).toString()+" gồm :"+ dem+" nhân viên");
                System.out.println();
            }

            nhanvien1.calculateSalary();
            ///////////////////////thêm nhân viên mới//////////////
            chucvu ="";
            do {
                System.out.print("Nhập \"yes\" để thêm nhân viên và \"no\" để bỏ qua: ");
                nhap = sc.next();

                if (nhap.equalsIgnoreCase("yes")) {
                    System.out.print("1 để thêm nhân viên quản lí. 2 để thêm nhân viên thông thường: ");
                    chucvu = sc.next();
                    if(chucvu.equalsIgnoreCase("2")) {
                        sc.nextLine();
                        Staff themNhanVien= new Employee();
                        themNhanVien.nhap(sc);
                        nhanvien.add(themNhanVien);
                    }
                    else if (chucvu.equalsIgnoreCase("1")) {
                        sc.nextLine();
                        Staff themTruongPhong = new Manager();
                        themTruongPhong.nhap(sc);
                        nhanvien.add(themTruongPhong);
                        System.out.println(chucvu);
                    }
                } else{
                    break;
                }
            }
            while (nhap.equalsIgnoreCase("yes"));
        }
        while (chucvu.equalsIgnoreCase("1")|| chucvu.equalsIgnoreCase("2"));


                    /////////////////Bảng lương///////////////////////
        System.out.println();
        ArrayList<Integer> bangLuong = new ArrayList<>();
        System.out.println("Bảng lương của nhân viên trong công ty:");
        for (int i = 0; i< nhanvien.size();i++){
            System.out.println(nhanvien.get(i).getId()+" - "+nhanvien.get(i).getName()+": "+ nhanvien.get(i).calculateSalary());
            bangLuong.add(nhanvien.get(i).calculateSalary());
        }
        System.out.println();
        //////////////////Bảng lương tăng dần//////////////////
        System.out.println("Bảng lương tăng dần: ");
        nhanvien.sort((o1, o2) -> o1.calculateSalary()- o2.calculateSalary());
            for (int i = 0; i< nhanvien.size();i++){
                System.out.println(nhanvien.get(i).getId()+" - "+nhanvien.get(i).getName()+": "+ nhanvien.get(i).calculateSalary());
                bangLuong.add(nhanvien.get(i).calculateSalary());
            }
        System.out.println();


            /////////////////Bảng lương giảm dần...........
        System.out.println("Bảng lương giảm dần");
        nhanvien.sort((o2, o1) -> o1.calculateSalary()- o2.calculateSalary());
        for (int i = 0; i< nhanvien.size();i++){
            System.out.println(nhanvien.get(i).getId()+" - "+nhanvien.get(i).getName()+": "+ nhanvien.get(i).calculateSalary());
            bangLuong.add(nhanvien.get(i).calculateSalary());
        }


        //////////////////////Tìm kiếm nhân viên trong công ty//////////////////////////
        System.out.println();
        System.out.println("Tìm kiếm nhân viên trong công ty: ");
        System.out.print("Nhập ID hoặc họ tên nhân viên: ");
        String tim = "";
        sc.nextLine();
        String timKiem = sc.nextLine();
        for(int i = 0; i<nhanvien.size(); i++){
            if (timKiem.equalsIgnoreCase(nhanvien.get(i).getId())||timKiem.equalsIgnoreCase(nhanvien.get(i).getName())){
                tim = "Thông tin nhân viên bạn cần tìm kiếm: ";
                nhanvien.get(i).displayInformation();
                break;
            }
            else {
                tim = "Không tìm thấy nhân viên theo mã bạn tìm kiếm. ";
            }
        }
        System.out.println(tim);
    }
}
