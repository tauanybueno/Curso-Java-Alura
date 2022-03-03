public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        boolean acompanhado;
        if (quantidadePessoas >=2){
             acompanhado = true;
        }else{
             acompanhado = false;
        }


       /* if (quantidadePessoas >=2){
            //ainda nao existe
            boolean acompannhado = true;
            //existe
        }else{
            boolean acompanhado = false;
            //existe
        }
        //variavel nao existe mais*/

        if (idade >= 18 && acompanhado) {

            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }

    }
}
