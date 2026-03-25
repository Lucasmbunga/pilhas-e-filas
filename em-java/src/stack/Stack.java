package stack;

public class Stack<T> {
    private T[] items;
    private int length;

   public Stack() {
       this.items = (T[]) new Object[10];
       this.length = 0;
   }

    public void push(T item) {

        this.aumentarCapacidade();
        this.items[this.length] = item;
        this.length++;
    }

    private void aumentarCapacidade() {

        if (this.length == this.items.length) {

            T[] newItemsList = (T[]) new Object[this.items.length *2];

            for(int i = 0; i < this.items.length; i++){
                newItemsList[i] = this.items[i];
            }
            this.items = newItemsList;

        }
    }

    public T pop() {
        if(this.isEmpty()){
            return null;
        }
        int POSITTION=this.length-1;

        T deletedItem=this.items[POSITTION];
        this.items[POSITTION]=null;

        this.length--;
        return deletedItem;

    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return this.items[this.length-1];
    }

    public int size() {
        return this.length;
    }
    public void clear() {
       this.items = (T[]) new Object[10];
       this.length = 0;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < this.length-1; i++) {
            stringBuilder.append(this.items[i]);
            stringBuilder.append(", ");
        }

        if (this.length > 0) {
            stringBuilder.append(this.items[this.length-1]);
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
