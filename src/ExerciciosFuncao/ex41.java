package ExerciciosFuncao;

public class ex41 {
    static boolean dado(boolean sla){
        int dado1, dado2;

        for(dado1 = 1; dado1 <= 6; dado1++){
            for(dado2 = 1; dado2 <= 6; dado2++){
                if(dado1 + dado2 == 7){
                    System.out.println(dado1 + " e " + dado2);
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        dado(true);
    }
}
