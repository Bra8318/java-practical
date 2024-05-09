class complex{
    int real,imaginary;
    public complex(int x,int y){
       this.real = x;
       this.imaginary = y;
    }
    public void show(){System.out.println(this.real+"+"+this.imaginary+"i");}
    public complex add (complex other){
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new complex (newReal,newImaginary);
    }
    public complex multiple(complex other){
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.imaginary * other.real + this.real * other.imaginary;
        return new complex(newReal,newImaginary);
    }
    public String toString(){
    return this.real+"+"+this.imaginary+"i";
    }
    public static void main(String[] args) {
       complex obj1 = new complex(5,3);
       complex obj2 = new complex(3,3);
       System.out.print("first complex number :");
       obj1.show();
       System.out.print("second complex number :");
       obj2.show();
complex sum = obj1.add(obj2);
System.out.print("sum of to complex number :");
sum.show();
complex multiple = obj1.multiple(obj2);
System.out.print("multiple of to complex number :");
multiple.show();
    }
}