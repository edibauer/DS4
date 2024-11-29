import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int option;
        int element;
        int tamanio;

        try {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the size of the stack?", "Gettig size", JOptionPane.INFORMATION_MESSAGE));
            Pila myStack = new Pila(tamanio);
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "1. Push an element to the stack\n" +
                    "2. Pop the element from the stack\n" +
                    "3. is empty\n" +
                    "4. is full\n" +
                    "5. Peek the top element\n" +
                    "6. Stack size\n" +
                    "7. Exit\n" +
                    "Stack Operations", "Options", JOptionPane.QUESTION_MESSAGE)
                );

                switch (option) {
                    case 1:
                        element = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the element to push into stack", "Adding elements", JOptionPane.INFORMATION_MESSAGE));
                        if( !myStack.isFull() ) {
                            myStack.push(element); 
                        } else {
                            JOptionPane.showMessageDialog(null, "Stack Overflow", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 2:
                        if( !myStack.isEmpty() ) {
                            JOptionPane.showMessageDialog(null, "The element to pop is: " + myStack.pop(), "Getting data", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "The stakc is fully", "Fully stack", JOptionPane.ERROR_MESSAGE);

                        }
                    break;
                    case 3:
                        if( myStack.isEmpty() ) {
                            JOptionPane.showMessageDialog(null, "The stack is empty", "Empty Stack", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "The stack is nt empty", "It conatains data", JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    case 4:
                        if(  myStack.isFull() ) {
                            JOptionPane.showMessageDialog(null, "The stack is fully", "Fully Stack", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "The stack is not fully", "Not fully Stack", JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "The peek element is " + myStack.getPeek(), "Last element", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "The stack size is: " + myStack.getSize(), "Stack Size", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "App Finalized", "End", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                    default:
                        JOptionPane.showMessageDialog(null, "Incorrect Option", "End", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } while (option != 7);   
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
        }
    }
}
