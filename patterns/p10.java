class p10 {
    public static void main(String[] args) {
        int z = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= z; j++) {
                System.out.print("*");
            }
            --z;
            System.out.println();
        }
    }
}
