package ex42;

public class Main {
        public static void main(String[] args) {
            Student st = new Student("Chiến", "Đà Nẵng", "IT", 2, 15000000);
            Staff sf = new Staff("An", "Hà Nội", "THPT A", 12000000);

            System.out.println(st.toString());
            System.out.println(sf.toString());
        }
    }

