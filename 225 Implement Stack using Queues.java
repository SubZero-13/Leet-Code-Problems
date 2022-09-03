class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        q2.add(x);
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        return q2.remove();
    }
    
    public int top() {
        if(empty()) {
            return -1;
        }
        return q2.element();
    }
    
    public boolean empty() {
        if(q2.isEmpty()) {
            return true;
        }
        return false;
    }
}