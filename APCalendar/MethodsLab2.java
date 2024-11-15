class MethodsLab2 {

    public static void create_list(int start, int end, int inc) {
        String str = "";

        for (int i = start; i < end; i += inc) {
            str += i + " ";
        }

        System.out.println("start " + start + " : stop " + end + " : increment " + inc);
        System.out.println(str);
        System.out.println();

    }

    public static void total(int integers) {
        String ints = Integer.toString(integers);
        int sum = 0;
        for (int i = 0; i < ints.length(); i += 1) {
            sum += Integer.parseInt(ints.substring(i, i+1));
        }

        System.out.println(ints.length() + " digits totaling " + sum);
    }

    public static void dothething(String str) {
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase().replace(" ", "-"));
        System.out.println();
    }

    public static void main(String[] args) {

        create_list(2, 90, 5);
        create_list(3, 76, 4);
        create_list(-10, 8, 2);
        create_list(5, 30, 2);
        create_list(100, 150, 5);

        total(234);
        total(10000);
        total(123456789);
        total(222222);
        System.out.println();

        dothething("Hello World");
        dothething("Jim Bob");
        dothething("Computer Science");
        dothething("UIL TCEA");
        dothething("State Champions");
    }

}