public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
            new Cercle("Cercle1", 3.0),
            new Rectangle("Rectangle1", 4.0, 5.0),
            new Triangle("Triangle1", 3.0, 4.0, 5.0)
        };

        for (Figure f : figures) {
            f.afficherDetails();
        }
    }
}
