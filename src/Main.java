public class Main {
    public static void main(String[] args) {
        int[] dakikalardizisi = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] isimdizisi = {"kadir", "gokhan", "hakan", "suzan", "pinar", "mehmet", "ali", "emel", "firat", "james", "jale", "ersin", "deniz", "gozde", "anil", "burak"};

        maraton yaris = new maraton(isimdizisi, dakikalardizisi);
        yaris.outputs();
    }
}