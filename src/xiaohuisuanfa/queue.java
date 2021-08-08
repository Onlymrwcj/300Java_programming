package xiaohuisuanfa;

/**
 * @author guiqing
 * @version 1.0
 * @className queue
 * @description TODO
 * @since 2021/8/8 8:54 下午
 */
public class queue {
    private int []array;
    private int rear;
    private  int front;

    public queue(int capacity){
        this.array=new int[capacity];
    }

    //入队
    public void enQueue(int element)throws  Exception{
        if ((rear+1)%array.length==front){
            throw new Exception("队列已经满了");
        }
        array[rear]=element;
        rear=(rear+1)% array.length;
    }


    //出队
    public int deQueue()throws Exception{
        if (rear==front){
            throw new Exception("队列已经空");

        }
        int deQueueElement=array[front];
        front =(front+1)%array.length;
        return deQueueElement;

    }


    //输出队列
    public void output(){
        for (int i = front; i !=rear ; i=(i+1)% array.length) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws  Exception{
        queue queue=new queue(6);
        queue.enQueue(3);
        queue.enQueue(54);
        queue.deQueue();
        queue.enQueue(435);
        queue.output();






    }




}
