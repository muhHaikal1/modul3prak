/**
 * Kelas TriangleCalculator digunakan untuk menghitung luas dan keliling segitiga.
 * <p>
 * Pengguna dapat mengatur panjang sisi-sisi segitiga dan menggunakan metode yang disediakan
 * untuk mendapatkan hasil perhitungan luas dan keliling.
 * </p>
 *
 * @author [Haikal]
 * @version 1.0
 */
public class TriangleCalculator {

    /**
     * Panjang sisi pertama segitiga.
     */
    private double sideA;

    /**
     * Panjang sisi kedua segitiga.
     */
    private double sideB;

    /**
     * Panjang sisi ketiga segitiga.
     */
    private double sideC;

    /**
     * Konstruktor untuk membuat objek TriangleCalculator dengan panjang sisi-sisi tertentu.
     *
     * @param sideA Panjang sisi pertama segitiga.
     * @param sideB Panjang sisi kedua segitiga.
     * @param sideC Panjang sisi ketiga segitiga.
     */
    public TriangleCalculator(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Mendapatkan nilai panjang sisi pertama segitiga.
     *
     * @return Nilai panjang sisi pertama segitiga.
     */
    public double getSideA() {
        return sideA;
    }

    /**
     * Mengatur nilai panjang sisi pertama segitiga.
     *
     * @param sideA Nilai panjang sisi pertama segitiga yang baru.
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    /**
     * Mendapatkan nilai panjang sisi kedua segitiga.
     *
     * @return Nilai panjang sisi kedua segitiga.
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * Mengatur nilai panjang sisi kedua segitiga.
     *
     * @param sideB Nilai panjang sisi kedua segitiga yang baru.
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /**
     * Mendapatkan nilai panjang sisi ketiga segitiga.
     *
     * @return Nilai panjang sisi ketiga segitiga.
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * Mengatur nilai panjang sisi ketiga segitiga.
     *
     * @param sideC Nilai panjang sisi ketiga segitiga yang baru.
     */
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    /**
     * Menghitung luas segitiga menggunakan rumus Heron.
     *
     * @return Nilai luas segitiga.
     */
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Menghitung keliling segitiga.
     *
     * @return Nilai keliling segitiga.
     */
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Contoh penggunaan kelas TriangleCalculator.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        // Contoh penggunaan
        TriangleCalculator triangle = new TriangleCalculator(3.0, 4.0, 5.0);
        System.out.println("Luas segitiga: " + triangle.calculateArea());
        System.out.println("Keliling segitiga: " + triangle.calculatePerimeter());
    }
}
