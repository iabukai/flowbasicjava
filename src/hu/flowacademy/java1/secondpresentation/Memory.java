package hu.flowacademy.java1.secondpresentation;
//Blokkok
public class Memory {

    //létrejön a main stack-je
    public static void main(String[] args) {
        // main stackjén jön létre
        int i=1;
        // létrejön egy új objektum a heapen, a rámutató referencia (obj) a stackre kerül
        Object obj = new Object();
        // ugyanaz mint az obj esetében
        Memory mem = new Memory();
        // létrejön egy blokk a stacken belül a foo függvény elemeinek a stacken belül
        mem.foo(obj);

    }
    private void foo(Object param) {
        //létrejön egy string objektum ami a heapbe kerül ezen belül pedig a string poolba
        String str = param.toString();
        //létrejön egy objektum a heapen ami a string poolban lévő és a foo stack blokkjában jön létre
        System.out.println(str);
    }
}