package main;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode<K> next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        StringBuilder myNodeString=new StringBuilder();
        myNodeString.append("MyNode{"+"K=").append(key).append('}');
        if(next!=null)
            myNodeString.append("->").append(next);
        return myNodeString.toString();
    }
}
