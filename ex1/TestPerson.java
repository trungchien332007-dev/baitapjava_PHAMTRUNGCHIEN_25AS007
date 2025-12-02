package ex1;

public class TestPerson {
    public static void main(String[] args){
        Person [] ds = new Person[6];
        ds [0] = new SinhVien("Pham Trung Chien","Da Nang",2007,"25AS007",5.0);
        ds [1] = new SinhVien("Duong Cong Minh","Quang Binh",2007,"25AS032",6.0);
        ds [2] = new SinhVien("Nguyen Binh Anh Vuong","Da Nang",2007,"25AS063",5.0);
        ds [3] = new SinhVien("Pham Thai Bao","Da Nang",2007,"25AS004",5.0);
        ds [4] = new GiangVien("Nguyen Vu Thanh Ha","Da Nang",1999,"13AG7171",2000000);
        ds [5] = new GiangVien("Vo Minh Nhan","Da Nang",1998,"13GS2432",3000000);
        for (Person p : ds) {
            p.inThongTin();
        }
    }
}
