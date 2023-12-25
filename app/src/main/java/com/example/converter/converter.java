package com.example.converter;

public class converter {
    String x="",y="";
    int i,a,n;
    String binary(int n){
     this.n=n;
        while(n > 0)
        {
            a = n % 2;

            x = x + "" + a;
            n = n / 2;
    }
        for(i=x.length()-1;i>=0;i--)
           y=y+x.charAt(i);
        return y;
}
String octal(int n){
        String str=Integer.toOctalString(n);
        return str;
}
String Hexa(int n){
        String str=Integer.toHexString(n);
        return str;
}

}
