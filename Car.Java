public class Car {
String make;
String color;
int model;
int price;
double np;
double np2;
int diff;
int kms;
double dep2(){
double tt;
if(diff&gt;=5){
if(diff&gt;=15){
tt=price*0.7;
np=tt;
}
else{
tt=price*0.9;
np=tt;
}
}
if(kms&gt;100000){
if(kms&gt;500000){
tt=np/1.5;
np2=tt;

}
else{
tt=np/1.25;
np2=tt;
}
}
return np2;
}
}