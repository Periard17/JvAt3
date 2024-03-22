import java.util.Scanner;
public class At3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome,sexo,e; 
    int idade;
    double sal;
    System.out.print("Digite o nome do indivíduo: ");
    nome = scanner.nextLine();
    while (nome.length() < 3);
    System.out.print("Digite o sexo do indivíduo(masc ou fem): ");
    sexo = scanner.nextLine();
    while (!sexo.equalsIgnoreCase("fem") && !sexo.equalsIgnoreCase("masc"));
    System.out.print("Digite a idade do indivíduo: ");
    idade = scanner.nextInt();
    while (idade < 0 || idade > 150);
    System.out.print("Digite o salário do indivíduo: ");
    sal = scanner.nextDouble();
    while (sal < 0);
    System.out.print("Digite o Estado civil do indivíduo(sol,cas,viu ou div): ");
    e = scanner.nextLine();
    while (!e.equalsIgnoreCase("sol") && !e.equalsIgnoreCase("cas") && !e.equalsIgnoreCase("viu") && !e.equalsIgnoreCase("div"));
    scanner.close();
    System.out.println("Indivíduo Validado");
  }
}
    