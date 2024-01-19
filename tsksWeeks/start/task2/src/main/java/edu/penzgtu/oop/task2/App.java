package edu.penzgtu.oop.task2;

// byte 	8 бит 	от -128 до 127
// short 	16 бит 	от -32768 до 32767
// char 	16 бит 	беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
// int 	    32 бит 	от -2147483648 до 2147483647
// long 	64 бит 	от -9223372036854775808L до 9223372036854775807L

public class App
{
    public static void main( String[] args )
    {
        // byte 8 бит
        System.out.print((byte)-128 + " " + (byte)127 + "\n");

        // char 16 бит
        System.out.println((char)-32768 + " " + (char)32767 + "\n");

        // short 16 бит
        System.out.print((short)-32768 + " " + (short)32767 + "\n");

        // 32 бит
        System.out.print(-2147483648 + " " + 2147483647 + "\n");

        // long 64
        System.out.print(-9223372036854775808L + " " + 9223372036854775807L);

    }
}
