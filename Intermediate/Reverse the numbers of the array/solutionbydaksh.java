package daksh;

 public static void reversewithoutotherarray(int[]a){
        int l=a.length-1;
        for (int i=0;i<=l/2;i++){
            int tmp=a[i];
            a[i]=a[l-i];
            a[l-i]=tmp;
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


//This logic is implemented by daksh
