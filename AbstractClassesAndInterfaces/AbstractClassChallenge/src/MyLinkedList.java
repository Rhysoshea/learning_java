public class MyLinkedList implements NodeList {
    
    private ListItem root = null;

    public MyLinkedList(ListItem item) {
        this.root = item;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem node = this.root;
        while (node != null) {
            int comparison = node.compareTo(item);
            if (comparison == 0) {
                System.out.println("Item already present");
                return false;
            }
            if (comparison < 0) {
                if(node.next() != null) {
                    node = node.next();
                } else {
                    node.setNext(item).setPrevious(node);
                    // we can set next and previous this way due to returning the item in the setters
                    return true;
                }
            } else if (comparison > 0) {
                if (node.previous() != null) {
                    node.previous().setNext(item).setPrevious(node.previous());
                    item.setNext(node).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison<0){
                currentItem = currentItem.next();
            } else {
                // item is not in the list
                return false;
            }
        }
        // reached end of list
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (item == null) {
            System.out.println("The list is empty");
        } else {
            while (item != null) {
                System.out.println(item.getValue());
                item  = item.next();
            }
        }
    }
}
