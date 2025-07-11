package basics;

public class FunsFromKotlin {
    public static void main(String[] args){
        KotlinFile.printStuff();

        //Default values do not work and need to be provided when calling functions from Java
        FunctionArgumentsKt.defaultArgumentsForJava('#',5);
        //Because the function is annotated with @JvmOverloads the default parameters are preserved
        FunctionArgumentsKt.defaultArgumentsForJava('/');
    }
}
