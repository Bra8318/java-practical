class UnderAge extends Exception{
    int age;

    public UnderAge(int age){
        this.age = age;
    }
    public String toString(){
        return "Under Age :" + age;
        
    }
}
class ExceptionDemo{
    public static void test(int age) throws UnderAge{
        if (age <18){
            throw new UnderAge(age);

        }
        else{
            System.out.println("you are eligible");
        }
    }
    public static void main(String args[]){
        try {
        test(5);
        } catch (UnderAge e){
            System.out.println(e);
        }
       
    }
}


