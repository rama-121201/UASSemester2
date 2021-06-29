package soalStack;
public class TheApps { //20090051
    public static void main(String[] args) {
        MainStack newStack = new MainStack(10);
        newStack.push(11);
        newStack.printData();
        newStack.push(30);
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("Nama saya adalah : Rama Anandya Putra");
        System.out.println("Nilai yang dihapus ="+newStack.pop());
        newStack.printData();
        newStack.push(40);
        newStack.printData();
        newStack.push(50);
        newStack.printData();
        
    }
}