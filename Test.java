
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("001", "Toan 12", "Nguyen Van A", 1941, 15);
        Sach sach2 = new Sach("002", "Ngu Van 12", "Tran Thi B", 1988, 20);

        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(sach1);
        danhSach.add(sach2);

        for (Sach sach : danhSach) {
            sach.hienThiThongTin();
        }
    }
}