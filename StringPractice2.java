package com.java.practice;

import java.util.Arrays;

public class StringPractice2 {
	
	public static int commonChild(String s1, String s2) {
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        char[] s3 = new char[s11.length];
        int[] a = new int[s11.length];
    int k =0;
        for(int i=0;i<s11.length;i++)
        {
            for(int j=0;j<s22.length;j++)
            {
                if(s11[i]==s22[j])
                {
                    if(i<j)
                    {
                        a[k]=i;
                        s3[k]=s11[i];
                        k++;
                    }else{
                        {
                        a[k]=j;
                        s3[k]=s22[j];
                        k++;
                    }
                    }
                    s22[j]=' ';
                }
            }
        }
        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(a));
        int count=1;
        for(int i=1;i<s3.length-1;i++) 
        {
            if(a[i-1]>a[i])
            	return count;
            count++;
        }

return count;
    }
    


	public static void main(String[] args) {
		System.out.println(commonChild("OUDFRMYMAW", "AWHYFCCMQX"));
	}

}
