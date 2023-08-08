import java.util.Scanner;
public class OOPopenlab {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
Car obj=new Car();
Salesman obj2=new Salesman();
Cartype obj3=new Cartype();
Dealership obj4=new Dealership();
int menu=1;
int choice=1;
int n;
do{
System.out.println(&quot;Press 1 for car valuation and 2 for salesman record 3 for
Dealership inventory, 0 to exit&quot;);
menu=scn.nextInt();
if(menu==1){
System.out.println(&quot;Enter Car color &quot;);
obj.color=scn.next();
System.out.println(&quot;Enter Car model year &quot;);
obj.model=scn.nextInt();
System.out.println(&quot;Enter Car Mileage &quot;);
obj.kms=scn.nextInt();
System.out.println(&quot;Enter Car Make &quot;);
obj.make=scn.next();
System.out.println(&quot;Enter Car launch value &quot;);
obj.price=scn.nextInt();
obj.diff=2023-obj.model;
System.out.println(&quot;The current valuation based on the condition of your
&quot;+obj.color+&quot; &quot;+obj.model+&quot; &quot;+obj.make+&quot; is &quot;+ obj.dep2()+&quot; USD&quot;);
}
else if (menu==2){
System.out.println(&quot;Salesman name followed by age&quot;);
obj2.name=scn.next();
obj2.age=scn.nextInt();
System.out.println(&quot;Press the number of the car which the salesman sold, press
0 to exit&quot;);
do{
System.out.println(&quot; 1-&quot;+obj3.str1+&quot; 2-&quot;+obj3.str2+&quot; 3-&quot;+obj3.str3+&quot; 4-
&quot;+obj3.str4+&quot; 5-&quot;+obj3.str5);
choice=scn.nextInt();

if (choice==1){
obj3.s1++;
}
else if(choice==2){
obj3.s2++;
}
else if(choice==3){
obj3.s3++;
}
else if(choice==4){
obj3.s4++;
}
else if(choice==5){
obj3.s5++;
}
} while(choice!=0);
System.out.println(obj2.name+&quot; sold &quot;+obj3.s1+&quot; &quot;+obj3.str1+&quot;,&quot;+obj3.s2+&quot;
&quot;+obj3.str2+&quot;,&quot;+obj3.s3+&quot; &quot;+obj3.str3+&quot;,&quot;+obj3.s4+&quot; &quot;+obj3.str4+&quot;,&quot;+obj3.s5+&quot;
&quot;+obj3.str5);
}
else if(menu==3){
do{
System.out.println(obj4.name+&quot; &quot;+obj4.Address+&quot; has the following cars: &quot;);
System.out.println(&quot;1. &quot;+obj4.Car1+&quot;\n 2. &quot;+obj4.Car2+&quot;\n 3.
&quot;+obj4.Car3+&quot;\n 4.&quot;+obj4.Car4+&quot;\n 5. &quot;+obj4.Car5+&quot;\n 6. &quot;+obj4.Car6);
System.out.println(&quot;Total cost of all these cars is
&quot;+(obj4.p1+obj4.p2+obj4.p3+obj4.p4+obj4.p5+obj4.p6));
System.out.println(&quot;press car no. to edit inventory, 0 to exit process&quot;);
n= scn.nextInt();
if(n&gt;=1&amp;&amp;n&lt;=6){
System.out.println(&quot;Enter new car name and price&quot;);
switch(n){
case 1 -&gt; {
obj4.Car1=scn.next();
obj4.p1=scn.nextInt();
}
case 2 -&gt; {
obj4.Car2=scn.next();
obj4.p2=scn.nextInt();
}
case 3 -&gt; {
obj4.Car3=scn.next();
obj4.p3=scn.nextInt();
}
case 4 -&gt; {
obj4.Car4=scn.next();
obj4.p4=scn.nextInt();
}
case 5 -&gt; {

obj4.Car5=scn.next();
obj4.p5=scn.nextInt();
}
case 6 -&gt; {
obj4.Car6=scn.next();
obj4.p6=scn.nextInt();
}
default -&gt; System.out.println(&quot;Error&quot;);
}
}
} while(n!=0);
}
}while(menu!=0);
}
}