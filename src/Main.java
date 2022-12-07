public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass1= new GenericClass();
        GenericClass<Integer> genericClass2 = new GenericClass();
        GenericClass<String> genericClass3 = new GenericClass();
        GenericClass<String> genericClass4 = new GenericClass();

        genericClass1.setT(12);
        genericClass2.setT(13);
        genericClass3.setT("This is a string");
        genericClass4.setT("This is a string");

        System.out.println(GenericClass.isEqual(genericClass1, genericClass2));
        System.out.println(GenericClass.isEqual(genericClass3, genericClass4));
    }
}
