package ExerciciosFuncao;

public class ex31 {
    static int potencia(int num){
        int quadrado = num * num;
        return quadrado;
    }

    public static void main(String[] args){
        for(int i = 10; i <= 150; i++){
            System.out.println(potencia(i));
        }
    }
}
