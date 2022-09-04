package BuildClass;

public class VanBan {
    //Thuoc tinh
private String noiDung;
    //phuong thuc
    //Ham khoi tao khong doi so
public VanBan(){

}
//Ham khoi tao co doi so
    public VanBan(String noiDung){
    this.noiDung=noiDung;
}
// Ham dem so tu trong 1 xau
    public int countWordOfString(String xau) {
        final char SPACE = ' ';
        final char TAB = '\t';
        final char BREAK_LINE = '\n';

        if (xau == null) {
            return -1;
        }

        int count = 0;
        int n = xau.length();
        boolean notCounted = true;

        for (int i = 0; i < n; i++) {
            if ((xau.charAt(i) != SPACE) && (xau.charAt(i) != TAB) && (xau.charAt(i) != BREAK_LINE)) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                } else {
                    notCounted = true;
                }
            }
        }
        return count;
    }
        public String chuanHoa(String xau) {
            String xauOK=xau.trim(); //Loai bo ki tu trang o dau va cuoi xau
            //Loai bo khoang giua xau
            while (xauOK.indexOf("  ")!=-1) {
                xauOK=xauOK.replaceAll("  ", " ");
            }

            return xau;
        }
        //Ham dem ky tu A
        public int CountA(String xau) {
            int count = 0;

            int n = xau.length();
            for (int i = 0; i < n; i++) {
                if ((xau.charAt(i) == 'a') || (xau.charAt(i) == 'A')) {
                    count++;
                }
            }
            return count;
        }
    }
