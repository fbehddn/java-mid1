package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottiGenerator lottiGenerator = new LottiGenerator();
        int[] lottoNumbers = lottiGenerator.generate();

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
