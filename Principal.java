public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Annabelle");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone("222");
        empregado.setSalario(1800);
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
        Empregado empregado2=new Empregado();
        //setar com os seus dados
        empregado2.setNome("Lui");
        empregado2.setEndereco ("Pompeia");
        empregado2.setSalario(1700);
        System.out.println(empregado2.getNome());

    }
}
