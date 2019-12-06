class AlunnoTest{
    public static void main(String[] args)

    {
        Alunno A = new Alunno('A',8.0);
        Alunno B = new Alunno('B',9.0);
        Alunno C = new Alunno('C',7.0);
        Calcolo Z = new Calcolo();
        
        Z.massimo(8.0,9.0,7.0);

         System.out.println(Z);


        
    }
}