public class tugas1 {
    
    char[] stack;
    int top;
    int maxSize;

    public tugas1(int size) {
        maxSize = size;
        stack = new char[maxSize];
        top = -1;

    }

    public void push(char item) {
        if (top < maxSize - 1) {
            stack[++top] = item;
        } 
        else {
            System.out.println("Stack penuh. Tidak bisa push.");
        }

    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak bisa pop.");
            return ' ';
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public String reverseSentence(String sentence) {
        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            push(sentence.charAt(i));
        }

        StringBuilder reversedSentence = new StringBuilder();
        while (!isEmpty()) {
            reversedSentence.append(pop());
        }

        return reversedSentence.toString();
    }
}
