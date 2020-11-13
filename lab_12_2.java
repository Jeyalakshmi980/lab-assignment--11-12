/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_12_1;

/**
 *
 * @author hp
 */
public class lab_12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] arr1={3,4,2,5,8};
        Double[] arr2={10.9,38.85,38.47,36.3,2.7};
        //Integer v=Min(arr1);
        //Double v1=Min(arr2);
        genmin<Integer> iob=new genmin<Integer>(arr1);
        genmin<Double> dob=new genmin<Double>(arr2);
        Integer v=iob.Min();
        Double v1=dob.Min();
        System.out.println("Minimum of integer array : "+v);
        System.out.println("Minimum of double array : "+v1);
    }
}
class genmin<t extends Number>{
  t arr[];
  t min;
  genmin(t ar[])
  {
   arr=ar;
  }
  t Min()
  {
      min=arr[0];
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i].intValue()<min.intValue())
        {
          min=arr[i];
        }
      }
   return min;
  }      
}
    