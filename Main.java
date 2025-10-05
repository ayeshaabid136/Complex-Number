
    public class Main{
    public static void main(String[] args) {
        
        ComplexNumber c1 = new ComplexNumber(2,4);
        ComplexNumber c2 = new ComplexNumber(5,-9);

        System.out.println("c1:"  +c1);
        System.out.println("c2:"  +c2);
        System.out.println("c1+c2:"  +c1.add(c2));
        System.out.println("c1-c2:"  + c1.sub(c2));
        System.out.println("c1*c2:"  +c1.mul(c2));
        System.out.println("c1 conjugate:"   +c1.conjugate());
        System.out.println("c2 conjugate:"   +c2.conjugate());
        System.out.println("c1 magnitude:"   +c1.magnitude());
        System.out.println("c2 magnitude:"   +c2.magnitude());
        System.out.println(c2.clone());

        //using setter and getters
        c1.setReal(8);
        c1.setImag(7);
        system.out.println("updated c1="  +c1);
        system.out.println( c1.getReal());
        system.out.println( c1.getImag());
    }
}
