public class Main {

    public static void main(String[] args) {

    // CHARACTER
        char var1 = 'A';               // 2 bytes  Range

    // BOOLEAN
        boolean var2 = true;           // 1 bit (Not precisely defined in terms of bytes)

    // INTEGER TYPES
        short var3 = 1;                // 2 bytes  Range   [                (-32,768) to (32,767)                        ]
        int var4 = 1;                  // 4 bytes  Range   [           (-2,147,483,648) to (2,147,483,647)               ]
        long var5 = 1L;                // 8 bytes  Range   [ (-9,223,372,036,854,775,808) to (9,223,372,036,854,775,807) ]

    // FLOATING POINT NUMBERS
        float var6 = 1.0f;             // 4 bytes  Range   [ (1.4 × 10^-45)   to (3.4 × 10^38)  ]
        double var7 = 1.0;             // 8 bytes  Range   [ (4.9 × 10^-324)  to (1.7 × 10^308) ]

    // STRING TYPES
        String var8 = "Hello";               // Size depends on the string length and implementation
        char[] var9 = "Hello".toCharArray(); // Equivalent to C-style string, Size depends on the string length

    }
}
