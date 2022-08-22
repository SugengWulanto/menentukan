public class Menentukan {
    public static void main(String[] args) {
        String input = "JavapemprogramanDasar1: 'Hello World!'";
        int uppercase = 0;
        int lowercase = 0;
        int angka = 0;
        int symbol = 0;
        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);
            if (karakter >= 'A' && karakter <= 'Z') uppercase++;
            else if (karakter >= 'a' && karakter <= 'z') lowercase++;
            else if (karakter >= '0' && karakter <= '9') angka++;
            else symbol++;
        }
        System.out.println("uppercase : " + uppercase);
        System.out.println("lowercase : " + lowercase);
        System.out.println("angka : " + angka);
        System.out.println("symbol : " + symbol);
    }
}
