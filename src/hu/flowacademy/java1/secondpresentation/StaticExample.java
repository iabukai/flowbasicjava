package hu.flowacademy.java1.secondpresentation;

    class Super {
        static {  System.out.print("Super "); }
    }
    class One {
        static { System.out.print("One "); }
    }
    class Two extends Super {
        static { System.out.print("Two "); }
    }
    class Test {
        public static void main(String[] args) {
            One o = null;
            // Super s = new Super(); // Super
            Two t = new Two(); // Super Two
            Two t2 = new Two();
            // System.out.println((Object)o == (Object)t);
        }
    }
