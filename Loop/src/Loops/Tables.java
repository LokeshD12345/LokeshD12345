class Tables
{
    int length;
    int height;
    int box(int length, int height)
    {
        int vol;
        vol=length*height ;
        return vol;

    }
    public static void main( String[] args)
    {
      Tables t = new Tables();
      t.box(8,9);
        System.out.println(t.box);

    }
}