using System;

class Program
{
    static void Main()
    {
        Console.Write("Masukkan nilai: ");
        int nilai = int.Parse(Console.ReadLine());

        if (nilai >= 75)
        {
            Console.WriteLine("Status: Lulus");
        }
        else
        {
            Console.WriteLine("Status: Tidak Lulus");
        }
    }
}
