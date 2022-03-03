#Bytebank - evolução do código

1) Criar uma classe do tipo Conta e uma classe do tipo CriaConta:
  * Conceitos aplicados dentro da classe CriaConta:
    *instanciar um objeto do tipo conta
    *atribuir um valor ao atributo
    *acessar um atributo
**Primeira Versão do Código**
```
public class Conta {
    //atributos
        double saldo;
        int numero;
        String titular;
}
```
```
public class CriaConta {
    public static void main(String[] args) {

        //instanciar um objeto do tipo Conta
        Conta primeiraConta = new Conta();

        //atribuir um valor ao atributo
        primeiraConta.saldo = 200;

        //acessar um atributo
        System.out.println(primeiraConta.saldo);

    }
}
```
