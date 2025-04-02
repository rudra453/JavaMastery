public class reverse{
public static void main (String[] args) {
int[] a={10,20,30,40};
System.out.println("before reversing");
for(int i:a) {
System.out.print(i+",");
}
int start=0;
int end=a.length-1;
while(start<end) {
int temp=a[start];
a[start]=a[end];
a[end]=temp;
start++;
end--;
}
System.out.println();
System.out.println("after reversing")
for(int i:a) {
System.out.print(i+",");
}
}}
