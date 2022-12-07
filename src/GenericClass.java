public class GenericClass <T> {

    private T t;

    /**
     * Method for getting the value of the private attribute t
     * @return a generics type T for the current's instance of t
     */
    public T getT(){
        return t;
    }

    /**
     * Method for setting the value of the private attribute t
     * @param valueToSet is a generics type T value that will be assigned to t
     */
    public void setT(T valueToSet){
        this.t = valueToSet;
    }

    /**
     * Method for checking if two GenericsClass object are equals.
     * @param gc1 is the first GenericClass value to compare
     * @param gc2 is the second GenericClass value to compare
     * @return a boolean that indicates if the two GenericsClass are equals
     */
    public static <T> boolean isEqual(GenericClass gc1, GenericClass gc2){
        return gc1.getT().equals(gc2.getT());
    }

}
