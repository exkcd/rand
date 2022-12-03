public class DiscussionPost {
    public static void main(String[] args) {
        int[] arr = {33, 3, 4, 5};

        try {
            System.out.println(arr[100]);
        } catch (Exception e) {
            System.out.println("Index out of bounds."); // error!
        }

    }
}
