#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<pthread.h>

void *thread_function(void *arg){
  printf("Inside Thread\n");
  for(int i=0;i<5;i++){
    printf("%d\n",i);
    sleep(1);
  }
}
int main(){
  pthread_t a_thread;
  pthread_create(&a_thread,NULL,thread_function,NULL);
  pthread_join(a_thread,NULL);
  printf("INside the main program\n");
  for(int j=20;j<25;j++){
    printf("%d\n",j);
    sleep(1);
  }
}