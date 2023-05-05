public class LinkQueue {
    public FirstLastList theList;

    public LinkQueue(){
        theList=new FirstLastList();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void enqueue(String j){
        theList.insertLast(j);
    }

    public String dequeue(){
        return theList.deleteFirst();
    }

    public String peek(){
        if(isEmpty()){
            return null;
        }
        return theList.first.dData;
    }

    public void displayQueue(){
        System.out.println("Daftar Pengunjung: ");
        theList.displayList();
        System.out.println();
    }

    public int size(){
        int count = 0;
        Link current = theList.first;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
