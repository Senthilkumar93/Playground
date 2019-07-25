#include<stdio.h>
#include<math.h>
int main()
{
  float area,r;
  int d;
  
  scanf("%d",&d);
  
  r=(float)d/2;
  area=3.14*r*r;
  printf("%.2f\n",area);
  
  return 0;
}