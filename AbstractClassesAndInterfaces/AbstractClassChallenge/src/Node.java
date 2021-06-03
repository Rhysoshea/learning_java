public class Node extends ListItem {
    
    public Node(String value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    // returning the pointer after setting it allows us to set pointers in both directions in one line easier later
    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue()); // this compareTo is the String class method which is already built
        } else {
            return -1;
        }

        // if ((Integer) this.value > (Integer) item.value) {
        //     return 1;
        // } else if ((Integer) this.value < (Integer) item.value) {
        //     return -1;
        // }
        // return 0;
    }
}
