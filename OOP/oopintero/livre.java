package oopintero;

public class livre {
    public static void main(String[] args) {
    Livre l1 = new Livre("Clean Code", "Robert Martin", 464);
    Livre l2 = new Livre("1984", "Orwell");
    Livre l3 = new Livre();
    
    l2.setNbPages(328);
    
    l3.setTitre("Dune"); 
    l3.setAuteur("Herbert"); 
    l3.setNbPages(896);
    
    System.out.println(l1.getNbPages());
    System.out.println(l1);
    System.out.println(l2);
}
    
}
