public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my name is Alex ").append("and i am future Java programer.");
        System.out.println(sb);
        for (int i = 0; i < 5; i ++){
            sb.append("error x_x ");
        }
        System.out.println(sb);
    }
}
