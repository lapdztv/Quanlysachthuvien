
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        BTT9 sach1 = new BTT9("001", "Toan 12", "Nguyen Van A", 1941, 15);
        BTT9 sach2 = new BTT9("002", "Ngu Van 12", "Tran Thi B", 1988, 20);

        ArrayList<BTT9> danhSach = new ArrayList<>();
        danhSach.add(sach1);
        danhSach.add(sach2);

        for (BTT9 sach : danhSach) {
            sach.hienThiThongTin();
        }
    }
}