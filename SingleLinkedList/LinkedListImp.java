class LinkedListImp{
    Node head;
    boolean ins(int item){
        Node node=new Node();
        node.data=item;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;

        }
        return true;

    }
    boolean insFirst(int item){
        Node node=new Node();
        node.data=item;
        node.next=null;
        node.next=head;
        head=node;
        return true;
    }
    boolean insAt(int index, int item){
        Node node= new Node();
        node.data=item;
        node.next=null;
        if(index==0){
            insFirst(item);
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
        return true;
    }
    void del(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n= head;
            Node temp;
            for(int i =0;i<index-1;i++){
                n=n.next;
            }
            temp=n.next;
            n.next=temp.next;
        }
    }
}