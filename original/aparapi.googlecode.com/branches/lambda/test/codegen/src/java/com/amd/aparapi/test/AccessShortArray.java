package com.amd.aparapi.test;

public class AccessShortArray{
   short[] shorts = new short[1024];

   public void run(){
      for(int i = 0; i < 1024; i++){
         shorts[i] = 1;
      }
   }
}
/**{OpenCL{
 typedef struct This_s{
 __global short* shorts;
 int passid;
 }This;

 int get_pass_id(This *this){
 return this->passid;
 }

 __kernel void run(
 __global short* shorts,
 int passid
 ){
 This thisStruct;
 This* this=&thisStruct;
 this->shorts = shorts;
 this->passid = passid;
 {
 int i_1 = 0;
 for (; i_1<1024; i_1++){
 this->shorts[i_1]  = 1;
 }
 return;
 }
 }
 }OpenCL}**/
