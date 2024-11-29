public class Main {
    public static void main(String[] args) {
        Lista myList = new Lista();

        myList.addInit(3);
        myList.addInit(6);
        myList.addInit(9);

        myList.showList();
        System.out.printf("\n La lista tiene %d elementos\n", myList.numberOfNodes());
    }
}
