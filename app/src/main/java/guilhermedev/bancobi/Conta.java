package guilhermedev.bancobi;

/**
 * Created by grodrigues on 26/04/16.
 */
public class Conta {
    public static double saldo=0.0;
    public static String usuario = "Guiguiba";
    public static String senha = "camafeu22" ;
    public static String numeroConta = "12345";
    public static String numeroAgencia = "140901";

    public static String getSaldoMonetario(String numeroConta){
        if (!numeroConta.equals(numeroConta)){
            return "Conta invalida";
        }
        return String.format("R$ %.2f",saldo);
    }

    public static String sacar(String numeroConta,String numeroAgencia,double valor){
        if (!numeroConta.equals(Conta.numeroConta)){
            return "Sua conta Esta invalida";
        }
        if (!numeroAgencia.equals((Conta.numeroAgencia))){
            return "O numero da agencia esta errado";
        }
        if (valor > Conta.saldo || valor <= 0){
            return "VAlor invalido para saque";
        }
        Conta.saldo -= valor;
        return "Saque efetuado com sucesso";
    }

    public static String depositar(String numeroConta,String numeroAgencia,double valor){
        if (!numeroConta.equals(Conta.numeroConta)){
            return "Sua conta esta invalida";
        }
        if(!numeroAgencia.equals((Conta.numeroAgencia))){
            return "O numero da agencia esta errado";
        }
        if (valor <= 0){
            return "Valor invalido para Deposito";
        }
        Conta.saldo += valor;

        return "Deposito Efetuado com Sucesso";
    }


    public static  boolean Login(String username, String senha){
        if (username.equals(Conta.usuario)&& senha.equals(Conta.senha)){
            return true;
        }
        return false;
    }
}
