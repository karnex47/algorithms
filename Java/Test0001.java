public class Test0001 {
    class Message {
        String msg;
        public Message(String msg) {
            this.msg = msg;
        }
        public Message() {}
        public void print() {
            System.out.println(this.msg);
        }
    }

    public static void main(String args[]) {
// started 6:56pm
        // Print a message provided as argument (args[1])
        // You will have to use the Message class

        // Write here
        String str = args[0];
        Message msg = new Message(str); 
        msg.print();
//ended at 6:57
    }
}
