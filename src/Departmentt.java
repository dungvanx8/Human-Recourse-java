import java.util.ArrayList;

public class Departmentt  {
    private String maBoPhan;
    private String tenBoPhan;
    private int soNhanVienTrongBoPhan;

    public Departmentt(String maBoPhan, String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoNhanVienTrongBoPhan() {
        return soNhanVienTrongBoPhan;
    }

    public void setSoNhanVienTrongBoPhan(int soNhanVienTrongBoPhan) {
        this.soNhanVienTrongBoPhan = soNhanVienTrongBoPhan;
    }

    @Override
    public String toString() {
        return getMaBoPhan()+"-" +getTenBoPhan();
    }
//@Override
   // public void displayInformation() {

   // }
}
