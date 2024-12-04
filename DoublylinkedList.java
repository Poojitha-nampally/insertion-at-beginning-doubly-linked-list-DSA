class DoublylinkedList
{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }
    public void InsertatBeginning(int data){
        Node newNode=new Node(data);
        if(head!=null){
            newNode.next= head;
            head.prev=newNode;
        }
        head=newNode;
    }
    public void Traversal(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		DoublylinkedList list = new DoublylinkedList();
		list.InsertatBeginning(100);
		list.InsertatBeginning(200);
		list.InsertatBeginning(300);
		list.Traversal();
	}
}
