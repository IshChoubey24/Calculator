
 class Ish{

    public static void main(String[] args) {
        int s = 10000;
        if (s>10000)
        {
            s = s + 2000;
        }
        else if(s<10000)
        {
            s=s+1000;
        }
        else{
            s=s+4000;
        }
        System.out.println(s);
    }
}