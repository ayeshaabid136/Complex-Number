public class ComplexNumber implements Cloneable{

    private double real;
    private double imag;

    //null constructor
    public ComplexNumber(){
        this.real = 0;
        this.imag = 0;
    }

    //Parametrized constructor
    public  ComplexNumber (double real , double imag){
         this.real = real;
         this.imag = imag;
    }

    //copy constructor
    public ComplexNumber (ComplexNumber other){
        this.real = other.real;
        this.imag = other.imag;
    }

    //setter
    public void setReal(double real){
        this.real = real;
    }

    public void setImag (double imag){
        this.imag = imag;
    }

    //getter
    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }

    //Addition
    public ComplexNumber add (ComplexNumber other){
       return new ComplexNumber( this.real + other.real , this.imag + other.imag);
    }

    //Substraction
    public ComplexNumber sub (ComplexNumber other){
        return new ComplexNumber( this.real - other.real , this.imag - other.imag);
    }

    //Multiply
    public ComplexNumber mul (ComplexNumber other){
         double r = this.real * other.real - this.imag * other.imag;
         double i = this.real *  other.imag + this.imag * other.real;
         return new ComplexNumber( r , i);
    }

    //conjugate
    public  ComplexNumber conjugate(){
        return new ComplexNumber( real , -imag);
    }

    //Magnitude
    public double magnitude(){
return Math.sqrt(this.real * this.real + this.imag *this.imag);
    }

    //toString
    @Override
    public String toString(){
        return real+ "+" +imag+ "i" ;
    }

    //Clone
    public ComplexNumber Clone()  throws CloneNotSupportedException {
        return (ComplexNumber) super.clone();
    }
