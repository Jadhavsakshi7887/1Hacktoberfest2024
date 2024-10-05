
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enetr the no. of elements");
        int n = sc.nextInt();
        System.out.println("enter your elements");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        reversestack(st);
        System.out.println(st);

    }
    static void reversestack(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reversestack(st);
        bottom(st,top);
    }
    static void bottom(Stack<Integer> st,int item){
        if(st.size() == 0){
            st.push(item);
            return;
        }

        int top = st.pop();
        bottom(st,item);
        st.push(top);
    }
}
