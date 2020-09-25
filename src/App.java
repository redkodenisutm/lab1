public class App {

    public static void displayName(String name) {
        System.out.println(name);
    }

    public static int responseToEverything() {
        return 42;
    }

    public static void main(String[] args) throws Exception {
        byte age = 21;
        short balance = 4200;
        int chinaPopulation = 1393512598;
        long stars = 5223322036854775807L;
        float temperature = 36.6F;
        double e = 2.71D;
        boolean isPresent = false;
        char gender = 'm';

        String os = "Windows 10";

        displayName("Denis");

        int res = responseToEverything();
        System.out.println(res);

        char[] alphabet = { 'a', 'b', 'c', '.', '.', '.' };

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
        }

        for (char c : alphabet) {
            System.out.print(c);
        }
    }
}
