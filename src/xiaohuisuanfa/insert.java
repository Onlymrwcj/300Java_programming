package xiaohuisuanfa;

import org.w3c.dom.Node;

/**
 * @author guiqing
 * @version 1.0
 * @className insert
 * @description 链表的操作
 * @since 2021/8/6 9:17 下午
 */



public class insert {

    //头节点指针
    private Node head;
    //尾节点指针
    private Node last;

    //链表的实际长度
    private int size;

    //链表插入元素，data插入元素，index插入位置
    public void insert(int data,int index) throws Exception{
        if (index<0||index>size){
            throw  new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node insertedNode=new Node(data);
        if (size==0){
            //空链表，头节点等于尾节点
            head=insertedNode;
            last=insertedNode;
        }else if (index==0){
            //插入头部
            insertedNode.next=head;
            head=insertedNode;
        }else if (size==index){
            last.next=insertedNode;
            last=insertedNode;
        }else {
            //插入中间
            Node prevNode=get(index-1);
            insertedNode.next=prevNode.next;
            prevNode.next=insertedNode;
        }
        size++;
    }
    //链表删除元素，index删除的位置
    public Node remove(int index)throws Exception{
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node removedNode=null;
        if (index==0){
            //删除头节点
           removedNode=head;
           head=head.next;
        }else  if (index==size-1){
            //删除尾节点
            Node prevNode=get(index-1);
            removedNode=prevNode.next;
            prevNode.next=null;
            last=prevNode;
        }else {
            //删除中间节点
            Node prevNode=get(index-1);
            Node nextNode=prevNode.next.next;
            removedNode=prevNode.next;
            prevNode.next=nextNode;
        }
        size--;
        return removedNode;
    }

    //链表查找元素，index查找的位置
    public Node get(int index)throws Exception{
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }


    //输出链表
    public void output(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    //链表的节点
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) throws Exception{
       insert myLinkedList=new insert();
       myLinkedList.insert(3,0);
       myLinkedList.insert(7,1);
       myLinkedList.insert(9,2);
       myLinkedList.insert(65,3);
       myLinkedList.remove(0);
       myLinkedList.output();




    }


}

